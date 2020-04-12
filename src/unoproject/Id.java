/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Urvis
 */
public class Id <Type>{
	private Type id;
	
	public Id(Type Id){
		this.id = Id;
	}
	
	public Type getID(){
		return this.id; 
	}
    
}
