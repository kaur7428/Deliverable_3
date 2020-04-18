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
public abstract class WildCard extends UnoCard{
 
    public enum Value {        
        WILD            { public String toString() { return "WILD";}},
        WILDDRAWFOUR    { public String toString() { return "WILD+4";}}
    }

    private final String color = "BLACK";
    private final Value value;
    private boolean used;
    private String effectiveColor;

    public WildCard(){
        this.value = Value.WILD;
        this.used = false;
    }
    
    @Override
    public String getColor(){
    	if(!this.used)
    		return this.color;
    	else
    		return this.effectiveColor;
    }
    
    @Override
    public String getValue(){
    	return this.value.name();
    }
    
    @Override
    public void applyEffect(EffectController crtl){   	
    	this.setColor(crtl.applyWild());
    }
   
    @Override
    public boolean match(UnoCard card){
    	if(this.getColor().equals("BLACK"))
    		return false;
    	else if(card.getColor().equals("BLACK"))
    		return true;
    	else
    		return (card.getColor().equals(this.getColor()));	
    }

    public boolean setColor(String color){
    	if(this.used)
    		return false;
    	if(!ActionCard.validColor(color))
    		throw new IllegalArgumentException();
    	
    	this.effectiveColor = color;
    	this.used = true;
    	return true;  	
    }
    
    @Override
    public String toString(){
    	if(this.used)
    		return super.toString();
    		
    	return this.getValue();
    }   
}
