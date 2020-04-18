/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;

import java.util.Random;

/**
 *
 * @author Japne
 */
public class Deck extends GroupOfCards <UnoCard>{
	private final static Random sourceRandom = new Random();
	public final static int LENGTH = 108;
	
	public Deck(){
        for(ActionCard.Color c:ActionCard.Color.values()){
            for(int j = 0; j < 2 ; j++) {
                for(ActionCard.Value v:ActionCard.Value.values()){
                    if(j == 1 && v.equals(ActionCard.Value.ZERO) )
                        continue;
                    else 
                        cardList.add(new ActionCard(c,v));
                }
            }
        }

        for(ActionCard.Color c:ActionCard.Color.values()){
            for(int j = 0; j < 2 ; j++) {
                cardList.add(new SkipCard(c) {});
                cardList.add(new Reverse(c));
                cardList.add(new DrawTwoCard(c));
                
            }
        }

        for(int j = 0; j < 4; j++) {
             cardList.add(new WildCard() {});
             cardList.add(new DrawFourCard());
        }
        
    }

	/**
	 * Shuffles the deck.
	 */
    public void shuffle() {
        for(int i = cardList.size() - 1; i > 0; --i){
            int index = sourceRandom.nextInt(i);
            UnoCard c = cardList.get(index);
            cardList.set(index,cardList.get(i));
            cardList.set(i,c);
        }
    }

    public UnoCard get(final int i) { 
    	try{
			return this.cardList.get(i);
			
		} catch(IndexOutOfBoundsException e){
			return null;
		} 
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for(UnoCard c : cardList){ sb.append(c.toString() + " ");}
        return sb.toString();
    }
	
	@Override
	public boolean addCard(UnoCard card){
		return this.cardList.add(card);     
	}

	@Override
	public UnoCard getCard(int index){
		try{
			return this.cardList.remove(index);
		} catch(IndexOutOfBoundsException e){
			return null;
		}
	}

    
	
    
}
