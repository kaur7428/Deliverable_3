/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;
import java.util.InputMismatchException;
import java.util.Scanner;
//import PlayerManager;
/**
 *
 * @author Japne
 */
public class StartGame {
    
    private Scanner input = new Scanner(System.in);
	private PlayerManager pM = PlayerManager.getInstance();
	
	public boolean sign(){
		int number;
		System.out.print("DIGIT THE NUMBER OF PLAYERS (2 TO 10): ");
		
		try{
			number = input.nextInt();
			
		} catch(InputMismatchException e){
			System.out.println("PLEASE INSERT A NUMBER.");
			input.next();
			return false;
		}
		
		while(number < 2 || number > 10){
			System.out.println("RANGER FROM 2 UNTIL 10 PLAYERS");
			System.out.print("DIGIT THE NUMBER OF PLAYER (2 TO 10): ");
			number =input.nextInt();
		}
		
		for(int i = 0 ; i < number ; i++){
			System.out.print("PLAYER " + String.valueOf(i+1) + ": ");
		}
		
		return true;
	}
    
}
