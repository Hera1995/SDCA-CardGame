/*
*CardGameApp.java
*@author Shan Liang
*03/2023
*/

import javax.swing.JOptionPane;

public class CardGameApp {
    public static void main(String[] args) {

		//declare variables
		String cardName;
        int points = 0, totalPoints = 0;
		String[] drawnCards = new String[3];
		String moreGames = "no";


		//display game name and instructions
        JOptionPane.showMessageDialog(null, "Welcome to the Card Game!\n\n"
											+ "In this game, you will draw one card from a deck of cards in each round.\n"
											+ "A game consists of three rounds, and you will receive points based on the cards drawn.\n\n"
											+ "Points System:\n"
											+ "Ace, Jack, Queen or King: 30 points\n"
											+ "2, 3, 4, 5, 6, 7, 8, 9 or 10 (first or last round): -14 points\n"
											+ "Ace in all three rounds: 65 bonus points\n\n"
											+ "Let's get started!");


		//declare and create new objects
		CardGame myCardGame = new CardGame();


		do{
			//process and output
			//play a 3-round game and display the result every round
			for (int i = 0; i < 3; i++){
				myCardGame.play();
				cardName = myCardGame.getCardName();
				JOptionPane.showMessageDialog(null, "Round " + (i + 1) + ":\n"
													+ "You drew a " + cardName + "!");
				drawnCards[i] = cardName;
			}

			//calculate the points
			myCardGame.setDrawnCards(drawnCards);
			myCardGame.calculatePoints();
			points = myCardGame.getPoints();
			totalPoints = myCardGame.getTotalPoints();
			JOptionPane.showMessageDialog(null, "Game points: " + points
												+ "\nTotal points: " + totalPoints);

			moreGames = JOptionPane.showInputDialog(null, "Do you want to play another game, yes or no?");

		}while(moreGames.equalsIgnoreCase("yes"));


        JOptionPane.showMessageDialog(null, "Thank you for playing! Your final score is: " + totalPoints);


    }//main
}//class