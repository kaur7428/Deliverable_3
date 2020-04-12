/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;

/**
 *
 * @author Urvis
 */
public class Player {
    
    private Id <Integer> p_id;
	private Hand p_hand;
	private String p_name;
	
	public Player(Id<Integer> p_id){
		this("Player ", p_id.getID());
		this.p_name += this.p_id.getID();
	}
	
	public Player(String name, int p_id) {
		this.p_id   = new Id<Integer>(p_id);
		this.p_hand = new Hand();
		this.p_name = name;
	}
	
	public Player(String name, Id<Integer> p_id){
		this(name, p_id.getID());
	}
	
	public int getID(){
		return this.p_id.getID();
	}
	
	public String getName(){
		return this.p_name;
	}
	
	public int numCards(){
		return p_hand.getNumCards();
	}
	
	public boolean takeCard(UnoCard card){
		return this.p_hand.addCard(card);
	}
	
	public UnoCard playCard(String cardName){
		int i = 0;
		while(i != this.p_hand.getNumCards()){
			if(this.p_hand.showCard(i).equals(cardName))
				return this.p_hand.getCard(i);
			i++;
		}
		
		return null;
	}
	
	public UnoCard playCard(int i){
		return this.p_hand.getCard(i);
	}
	
	public void showCards(){
		int ncards =  this.p_hand.getNumCards();
		String toPrint = "";
		int i;
		if(ncards == 0){
			System.out.print("EMPTY HAND.");
			
		} else{
			for(i = 0; i < ncards; i++){
				toPrint += "[" + this.p_hand.showCard(i) + "] ";
			}
		}
		
		if(toPrint.length() > 80){
			for(i = 0; i < toPrint.length()/80; i++)
				System.out.println(toPrint.substring(i*80, i*80 + 80));
			System.out.println(toPrint.substring(i*80));
		} else {
			System.out.println(toPrint);
		}
	}
	
	public void emptyHand(){
		while(!this.p_hand.isEmpty())
			this.p_hand.getCard(0);
		}
    
    
}
