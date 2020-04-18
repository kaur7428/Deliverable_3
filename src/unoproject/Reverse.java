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
public class Reverse extends SpecialCard{
	
	public Reverse(ActionCard.Color color){
		super(color, SpecialCard.Value.REVERSE);
	}
	
	@Override
	public void applyEffect(EffectController ctrl){
		ctrl.applyReverse();
	}
    
}
