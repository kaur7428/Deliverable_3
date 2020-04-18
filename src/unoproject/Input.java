/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;
import java.io.InputStream;
import java.util.Scanner;
/**
 *
 * @author Japn
 */
public class Input {
    
     private Scanner input = null;
	 
	 public Input(InputStream in){
	 	input = new Scanner(in);
	 }
	 	
	 public String[] readFields(){
	 	return this.input.nextLine().trim().split("\\s+");
	 }
	 	
	 public void close(){
	 	if(null != input)
	 		this.input.close();
	 }
    
}
