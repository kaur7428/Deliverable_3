/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;

/**
 *
 * @author Japneet
 */
public class ActionCard extends UnoCard{

    /**
     *
     * @param c
     * @param v
     */
    
    
    public enum Color {
        BLUE   { public String toString() { return "BLUE"; }},
        RED    { public String toString() { return "RED"; }},
        GREEN  { public String toString() { return "GREEN"; }},
        YELLOW { public String toString() { return "YELLOW"; }}
    }

    public enum Value {
        ZERO    { public String toString() { return "0";}},
        ONE     { public String toString() { return "1";}},
        TWO     { public String toString() { return "2";}},
        THREE   { public String toString() { return "3";}},
        FOUR    { public String toString() { return "4";}},
        FIVE    { public String toString() { return "5";}},
        SIX     { public String toString() { return "6";}},
        SEVEN   { public String toString() { return "7";}},
        EIGHT   { public String toString() { return "8";}},
        NINE    { public String toString() { return "9";}}
    }

    private final Color color;
    private final Value value;

    public ActionCard(final Color color, final Value value){
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
    public void applyEffect(EffectController ctrl){	}
    
    @Override
    public boolean match(UnoCard card){
    	if(card.getColor().equals("BLACK"))
    		return true;
    	
    	return (card.getColor().equals(this.getColor())
    			|| card.getValue().equals(this.getValue()));	
    }
    
   
    public static boolean validColor(String colorToComp){
    	for(Color color : Color.values()){
    		if(color.name().equals(colorToComp.toUpperCase()))
    			return true;
    	}
    	return false;
    }
    
}
