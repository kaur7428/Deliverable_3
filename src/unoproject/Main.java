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
public class Main {
    
    public static void main(String[] args) {
		Interpreter inter = new Interpreter();	
		SignUp sign = new SignUp();
		Match game = Match.getInstance();

		System.out.println("---------------------------------------"
				+ "-----------------------------------------");
		System.out.println("\t\t\t\tUNO CARD GAME");
		System.out.println("---------------------------------------"
				+ "-----------------------------------------");
		game.init();					// Initiate the game.
		while(sign.sign() == false);	// Registers players.
		game.start();					// Start the game.
		inter.readCommands();			// Read the commands from users.
		game.finish();					// Finishes the game.
		
	}
    
}
