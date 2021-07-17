import java.util.ArrayList;
import java.util.List;



public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private String name;
	private int score; 
	
	public Player(int score, String name) {
		
		this.score = score;
		this.name = name;
	}
	
	public Player() {
		score = 0;
	}
	
	
	public Card flip () {
		return hand.remove(0);
	}
	
	public void draw (Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score = score + 1;
	}
	
	public int getScore() {
		return score;
	}
}
