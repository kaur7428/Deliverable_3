/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;

/**
 *
 * @author Japne
 */
public class Match implements Game{
    
    private EffectController eControl;
	private PlayerManager pControl;
	private Table table;
	private static Match match = null;
	private final static int N_CARDS_INI = 7;
	
	private Match(){
		this.table = Table.getInstance();
		this.pControl = PlayerManager.getInstance();
		this.eControl = new EffectController(this.table,this.pControl);
	}

	
	public static Match getInstance(){
		if(match == null)
			match = new Match();
		
		return match;
	}
	
	@Override
	public void init() {
		this.table.prepareTable();		
	}

	@Override
	public void start() {
		if(this.verifyNumPlayers() == false){
			System.out.println("Number of players is too low or too high.");
			return;
		}
		
		this.distributeCards();
		
		this.showMatchStatus();
	}
	
	public boolean playerTakeCard(){
		Player cPlayer = this.pControl.getCurrent();
		UnoCard card = this.table.pullCard();
		
		return cPlayer.takeCard(card);
		
	}
	
	public boolean verifyNumPlayers(){
		if(this.pControl.getNumPlayers() <= 10 && 
				this.pControl.getNumPlayers() > 1)
			return true;
		
		return false;
	}
	
	private boolean distributeCards(){
		Player p = this.pControl.getCurrent();
		int firstID = p.getID();
		int i;
		UnoCard card;

		
		do{
			for(i = 0; i < N_CARDS_INI; i++){
				card = this.table.pullCard();
				if(card == null)
					return false;
				
				p.takeCard(card);
			}
			
			pControl.rotate();
			p = this.pControl.getCurrent();
		}while(p.getID() != firstID);
		
		return true;
	}
	
	public boolean playerPlayCard(String name){
		Player cPlayer = this.pControl.getCurrent();
		UnoCard card = cPlayer.playCard(name);
		if(card == null)
			return false;
		
		if(this.table.pushCard(card) == false){
			cPlayer.takeCard(card);
			return false;
		} 
		return true;
	}
	
	public void applyEffect(){
		UnoCard card = this.table.showTopCard();
		card.applyEffect(eControl);
		
	}
	
	public boolean applyEffect(String wildColor){
		if(this.eControl.setWildColor(wildColor) == false)
			return false;
		
		this.applyEffect();
		return true;
	}
	
	public void passTurn(boolean advertUno){
		if(advertUno){
			if(pControl.getCurrent().numCards() != 1){
				this.playerTakeCard();
				this.playerTakeCard();
			} else{
				this.announceUno();
			}	

		} else{
			if(pControl.getCurrent().numCards() == 1){
				this.playerTakeCard();
				this.playerTakeCard();
			}
		}
		
		pControl.rotate();
		this.showMatchStatus();
			
	}

	public boolean isEmptyHand(){
		return (0 == pControl.getCurrent().numCards());
	}
	
	public void showMatchStatus(){
		Player p = this.pControl.getCurrent();
		String pStatus;
		int i;
		
		System.out.println("\n---------------------------------------"
				+ "-----------------------------------------");
		
		pStatus = this.pControl.getPlayersStatus();
		if(pStatus.length() > 80){
			for(i = 0; i < pStatus.length()/80; i++)
				System.out.println(pStatus.substring(i*80, i*80 + 80));
			System.out.println(pStatus.substring(i*80));
		} else{
			System.out.println(pStatus);
		}
		
		System.out.print("LAST CARD PLAYED: " 
				+ this.table.showTopCard().toString() + "\t\t\t");
		System.out.println(table.getNumCardsOnDeck() + " CARDS LEFT ON DECK.");
		System.out.println("---------------------------------------"
				+ "-----------------------------------------");
		System.out.print(p.getName() + "'S TURN. ");
		this.showHandStatus();		
	}
	
	public void showHandStatus(){
		Player p = pControl.getCurrent();
		System.out.println("CHOOSE ONE CARD:");
		p.showCards();
		System.out.println("---------------------------------------"
				+ "-----------------------------------------");
	}
	
	@Override
	public void finish() {
		Player winner = pControl.lookForWinner();
		
		if(winner == null)
			System.out.println("\nNO WINNER IN THIS GAME. =(");
		else
			System.out.println("\nCONGRATULATIONS " + winner.getName()
					 + "! \\o/\\o/\\o/\nYOU DEFEATED " + pControl.getNumPlayers()
					 + " OPONENTS.");
		
		System.out.println("\nTHANK YOU FOR PLAYING. "
				+ "\nCOME BACK ANYTIME YOU WANT.\n");
		 
	}
		
	private void announceUno(){
	
		System.out.println("\n---------------------------------------"
				+ "-----------------------------------------");
		System.out.println("UUUUNNNNNOOOOOOO");
	}
    
    
}
