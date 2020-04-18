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
public class DrawFourCard extends WildCard{
	private Value value;
	private int attribute;
	
	public DrawFourCard(){
        super();
        this.value = Value.WILDDRAWFOUR;	
	}
	
    @Override
    public String getValue(){
    	return this.value.toString();
    }
    
    @Override
	public void applyEffect(EffectController ctrl){
    	ctrl.applyDrawFour();
    	super.setColor(ctrl.applyWild());
    }

	public int getAttribute() {
		return this.attribute;
	}

	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}    
}
