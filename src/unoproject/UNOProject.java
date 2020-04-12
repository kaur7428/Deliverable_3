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
public class UNOProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Interpreter inter = new Interpreter();	
		SignUp sign = new SignUp();
		Match game = Match.getInstance();

		System.out.println("---------------------------------------"
				+ "-----------------------------------------");
		System.out.println("\t\t\t\tUNO CARD GAME");
		System.out.println("---------------------------------------"
				+ "-----------------------------------------");
		game.init();					
		while(sign.sign() == false);	
		game.start();					
		inter.readCommands();			
		game.finish();	
        
        
    }
    
}
