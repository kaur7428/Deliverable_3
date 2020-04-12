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
	
	public int getNumCards(){
		return this.cardList.size();
	}
	
	public boolean isEmpty(){
		if(0 == this.cardList.size())
			return true;
		else
			return false;
	}
    
    
}
