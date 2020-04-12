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
public abstract class SkipCard extends SpecialCard{

	public SkipCard(NCard.Color color){
		super(color, SpecialCard.Value.SKIP);
	}
	
	@Override
	public void applyEffect(EffectController ctrl){
		ctrl.applySkip();
	}
    
}
