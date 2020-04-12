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
public abstract class UnoCard {
    
    public abstract String getColor();
	
	public abstract String getValue();
	
	public abstract void applyEffect(EffectController ctrl);
	
	public abstract boolean match(UnoCard card);
	
	@Override
        public String toString(){
    	return this.getColor()  + this.getValue();
    }
    
}
