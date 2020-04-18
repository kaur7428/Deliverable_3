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
public class UNOGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GameManager inter = new GameManager();	
		StartGame sign = new StartGame();
		Match game = Match.getInstance();

		
		System.out.println("\t\tUNO CARD GAME...");
                System.out.println("LET's BEGIN IT...");
		game.init();					
		while(sign.sign() == false);	
		game.start();					
		inter.readCommands();			
		game.finish();	
        
        
    }
    
}
