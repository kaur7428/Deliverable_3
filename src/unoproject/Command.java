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
public class Command {
    
    private Match match = unoproject.Match.getInstance();
	
	public boolean playCard(String[] fields){
		if(fields[1].startsWith("WILD") && (fields.length < 3 
				||!ActionCard.validColor(fields[2])))
			return false;
		
		if(this.match.playerPlayCard(fields[1])){		
			if(fields[1].startsWith("WILD")){				 
				if(this.match.applyEffect(fields[2]) == false)
					return false;
				
			} else{
				this.match.applyEffect();
			}
			
			return true;
		}
		
		return false;
	}
	
	public boolean verifyEndGame(){
		return match.isEmptyHand();
	}
	
	public void draw(){
		match.playerTakeCard();	
		System.out.println("\n---------------------------------------"
				+ "-----------------------------------------");
		System.out.println("NEW CARD ADDED IN THE END OF THE LIST.");
		match.showHandStatus();
	}
	
	public void pass(boolean unoAdvertise){
		match.passTurn(unoAdvertise);
	}

    
    
}
