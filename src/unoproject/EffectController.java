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
public class EffectController {
 
    private Table tControl;
	private PlayerManager pControl;
	private String wildColor;
	
	public EffectController(Table table, PlayerManager players){
		this.tControl = table;
		this.pControl = players;
		this.wildColor = null;
	}
	
	public boolean setWildColor(String color){
		if(NCard.validColor(color)){
			this.wildColor = color;
			return true;
		}
		
		return false;
	}

	public String getWildColor(){
		return this.wildColor;
	}
	
	public void applyDrawTwo(){
		UnoCard card1 = this.tControl.pullCard();
		UnoCard card2 = this.tControl.pullCard();
		this.pControl.getNext().takeCard(card1);
		this.pControl.getNext().takeCard(card2);
		this.pControl.rotateNextPlayer();
	}
	
	public void applyReverse(){
		this.pControl.changeDirection();
		
		if(this.pControl.getNumPlayers() == 2)
			this.pControl.rotateNextPlayer();
	}
	
	public void applySkip(){
		System.out.println(pControl.getCurrent().getName());
		this.pControl.rotateNextPlayer();
	}
	
	public String applyWild(){
		return this.getWildColor();
	}
	
	public void applyDrawFour(){
		UnoCard card;
		for(int i = 0; i < 4; i++){
			card = this.tControl.pullCard();
			this.pControl.getNext().takeCard(card);
		}
		this.pControl.rotateNextPlayer();
	}

    
}
