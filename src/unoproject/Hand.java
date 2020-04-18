/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;

import unoproject.UnoCard;

/**
 *
 * @author Japne
 */
public class Hand extends GroupOfCards <UnoCard>{
	
	public Hand(){
		super();
	}
	
	@Override
	public boolean addCard(UnoCard card){
		return this.cardList.add(card);
	}

	@Override
	public UnoCard getCard(int index){
		try{
			return this.cardList.remove(index);
		} catch(IndexOutOfBoundsException e){
			return null;
		}
	}
	
	public String showCard(int index){
		try{
			return this.cardList.get(index).toString();
		} catch(IndexOutOfBoundsException e){
			return null;
		}
	}
    
}
