
public class App {
	
	public static void main(String[] args) {
		
		Deck deck1 = new Deck();
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		deck1.shuffle();
		
		for (int i = 0; i < 52; i++) {
			
			if (i%2 == 0) {
				player1.draw(deck1);
				
			} else {
				player2.draw(deck1);
			}
			
		}
		
		for (int i = 0; i < 26; i++) {
			
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			if(player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			} else if (player1Card.getValue() < player2Card.getValue()) {
				player2.incrementScore();
			}
		}
		
		System.out.println("Player 1 score = " + player1.getScore());
		System.out.println("Player 2 score = " + player2.getScore());
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 wins!");
		} else {
			System.out.println("It's a Draw!");
		}
	}
	
	
}
