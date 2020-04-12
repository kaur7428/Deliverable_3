/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;
import java.util.ArrayList;

//import Player;

/**
 *
 * @author Urvis
 */
public class PlayerManager {
    
    	private ArrayList <Player> players;
	private boolean canAdd;
	private int currElem;
	private int nextElem;
	private boolean toRight;
	private static PlayerManager pM = null;
	
	private PlayerManager(){
		this.players = new ArrayList<Player>();
		this.canAdd  = true;
		this.currElem = 0;
		this.nextElem = 0;
		this.toRight = true;
	}
	
	public static PlayerManager getInstance(){
		if(pM == null)
			pM = new PlayerManager();
		
		return pM;			
	}
	
	public boolean addPlayer(Player player){
		if(this.canAdd){
			this.players.add(player);
			
			if(this.players.size() == 2)
				this.nextElem = 1;
		}
			
		return this.canAdd;
	}
	
	public String getPlayersStatus(){
		String pStatus = "";
		Player player;
		for(int i = 0; i < this.players.size(); i++){
			player  = this.players.get(i);
			pStatus += "[" +player.getName() + ": ";
			pStatus += Integer.toString(player.numCards()) + "] ";
		} 
		
		return pStatus;
	}
	
	public int getNumPlayers(){
		return this.players.size();
	}
	
	public void lockAdd(){
		this.canAdd = false;
	}
	
	public void unlockAdd(){
		this.canAdd = true;
	}
	
	public String getDirection(){
		if(this.toRight)
			return "RIGHT";
		else
			return "LEFT";
	}
	
	public void changeDirection(){
		this.toRight ^= true;
		
		if(this.toRight)
			this.nextElem = (this.currElem + 1) % players.size();
		else
			this.nextElem = (this.currElem - 1 + players.size()) % players.size();
	}
	
	public void rotate(){	
		//this.players.get(this.currElem).passTurn(this.players.get(this.nextElem));
		this.currElem = this.nextElem;
		this.rotateNextPlayer();
	}
	
	public void rotateNextPlayer(){
		
		if(this.toRight)
			this.nextElem = (this.nextElem + 1) % players.size();
		else			
			this.nextElem = (this.nextElem - 1 + players.size()) % players.size();
	}
	
	public Player getCurrent(){
		Player p;
		try{
			p = this.players.get(this.currElem);
			
		} catch(IndexOutOfBoundsException e){
			System.out.println("There isn't any players.");
			p = null;
		}
			
		return p; 
	}
	
	public Player getNext(){
		return this.players.get(this.nextElem);
	}
	
	public Player lookForWinner(){
		for(int i = 0; i < this.players.size(); i++){
			if(this.players.get(i).numCards() == 0)
				return this.players.get(i);
		}
		
		return null;
	}
    
    
}
