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
public abstract class SpecialCard extends UnoCard{

    public enum Color {
        BLUE   { public String toString() { return "BLUE"; }},
        RED    { public String toString() { return "RED"; }},
        GREEN  { public String toString() { return "GREEN"; }},
        YELLOW { public String toString() { return "YELLOW"; }}
    }

    public enum Value {
        SKIP    { public String toString() { return "SKIP";}},
        REVERSE { public String toString() { return "REVERSE";}},
        DRAWTWO { public String toString() { return "+2";}}
    }

    private final ActionCard.Color color;
    private final Value value;

    public SpecialCard(final ActionCard.Color color, final Value value){
        this.color = color;
        this.value = value;
    }
    
    @Override
    public String getColor(){
    	return this.color.name();
    }
    
    @Override
    public String getValue(){
    	return this.value.toString();
    }
    
    @Override
    public abstract void applyEffect(EffectController ctrl);
   
    @Override
    public boolean match(UnoCard card){
    	if(card.getColor().equals("BLACK"))
    		return true;
    	
    	return (card.getColor().equals(this.getColor())
    			|| card.getValue().equals(this.getValue()));	
    }
    
}
