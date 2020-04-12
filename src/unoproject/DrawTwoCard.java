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
public class DrawTwoCard extends SpecialCard{
	public DrawTwoCard(NCard.Color color){
		super(color, SpecialCard.Value.DRAWTWO);
	}
	
	/**
	 * This card makes the next player takes two more cards.
	 * It also loses its turn.
	 */
	@Override
	public void applyEffect(EffectController ctrl){
		ctrl.applyDrawTwo();
	}
    
}
