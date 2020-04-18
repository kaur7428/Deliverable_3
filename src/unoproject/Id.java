/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;

/**
 *
 * @author japne
 */
class Id<Type> {
   
	private Type id;
	
	public Id(Type Id){
		this.id = Id;
	}
	
	public Type getID(){
		return this.id; 
	}
}
