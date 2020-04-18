/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;
import java.lang.UnsupportedOperationException;
import java.util.ArrayList;

/**
 *
 * @author Urvis
 */
public class DiscardPile extends GroupOfCards <UnoCard>{
	
	public DiscardPile(){
		//super();
	}
	
	@Override
	public boolean addCard(UnoCard card){
		if(this.getTopCard() == null)
			return false;
		
		if(!this.getTopCard().match(card))
			return false;

		return this.cardList.add(card);
	}

	public void initialize(UnoCard card){
		if(this.cardList.size() == 0)
			this.cardList.add(card);
	}
	
	@Override
	public UnoCard getCard(int index){
		throw new UnsupportedOperationException("Operation not allowed.");
	}

	public UnoCard getTopCard(){
		UnoCard aux;
		
		try{
			aux = cardList.get(cardList.size()-1);
		}catch(IndexOutOfBoundsException e){
			aux = null;
		}
		
		return aux;
	}
	
	public ArrayList<UnoCard> takeCardsBack(){		
		ArrayList<UnoCard> newDeck = new ArrayList<UnoCard>();
		
		while(this.cardList.size() > 1){
			newDeck.add(this.cardList.remove(0));
		}
		
		return newDeck;		
	}
    
}
