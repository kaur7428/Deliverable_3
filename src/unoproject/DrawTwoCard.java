/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;


/**
 *
 * @author japne
 */
public class DrawTwoCard extends SpecialCard{
	public DrawTwoCard(ActionCard.Color color){
		super(color, SpecialCard.Value.DRAWTWO);
	}
	
	@Override
	public void applyEffect(EffectController ctrl){
		ctrl.applyDrawTwo();
	}
    
}
