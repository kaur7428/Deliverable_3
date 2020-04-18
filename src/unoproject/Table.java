/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;
import java.util.ArrayList;
//import uno.*;

/**
 *
 * @author Japne
 */
public class Table
{
        private DiscardPile dPile;
	private Deck deck;
	private static Table table = null;
	
	private Table(){
		this.dPile = new DiscardPile(); 
		this.deck = new Deck(); 
	}
	
	public static Table getInstance(){
		if(table == null)
			table = new Table();
		
		return table;
	}
	
	public void prepareTable(){
		if(this.dPile.getNumCards() != 0){
			ArrayList <UnoCard> list = dPile.takeCardsBack();
			for(int i = 0; i < list.size(); i++)
				this.deck.addCard(list.remove(0));
		}
		
		deck.shuffle();
		
		UnoCard card = this.deck.getCard(0);
		while(card.getColor().equals("BLACK")){
			this.deck.addCard(card);
			card = this.deck.getCard(0);
		}
		
		this.dPile.initialize(card);
	} 
	
	public UnoCard showTopCard(){
		return this.dPile.getTopCard();
	}

	public boolean pushCard(UnoCard card){		
		if(card == null)
			return false;
		
		if(this.dPile.getTopCard().match(card)){
			this.dPile.addCard(card);
			return true;
			
		} else{
			return false;
		}		
	}
	
	public UnoCard pullCard(){	
		UnoCard card = null;
		if(this.deck.isEmpty()){
			ArrayList <UnoCard> list = dPile.takeCardsBack();
			if(list.size() != 0){
				for(int i = 0; i < list.size(); i++)
					card = list.remove(0);
				
				if(card.getValue().equals("WILD+4"))
					this.deck.addCard(new DrawFourCard());
				else if(card.getValue().equals("WILD"))
					this.deck.addCard(new WildCard() {});
				else
					this.deck.addCard(card);
				
				this.deck.shuffle();
			} else{
				System.out.println("NO MORE CARDS AVAILABLE");
				return null;
			}
		}	
			
		return this.deck.getCard(0);
	}
	
	public int getNumCardsOnDeck(){
		return this.deck.getNumCards();
	}
    
}
