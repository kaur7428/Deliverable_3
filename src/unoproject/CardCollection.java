/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;
import java.util.ArrayList;
/**
 *
 * @author Urvis
 */
public abstract class CardCollection  <CardType> {
	protected ArrayList <CardType> cardList;
	
	public CardCollection(){
		this.cardList = new ArrayList<CardType>();
	}
	
	public abstract boolean addCard(CardType card);
	public abstract CardType getCard(int index);
	
	/**
	 * Count the number of cards in the collection.
	 * @return the number of cards in the collection.
	 */
	public int getNumCards(){
		return this.cardList.size();
	}
	
	/**
	 * Verify if the collection is empty.
	 * @return true if it is empty, false otherwise.
	 */
	public boolean isEmpty(){
		if(0 == this.cardList.size())
			return true;
		else
			return false;
	}
    
    
}
