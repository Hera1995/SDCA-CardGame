/*
*CardGame.java
*@author Shan Liang
*03/2023
*/

public class CardGame {

	//declare data members
    private final String[] cardNames = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private int random, points, totalPoints;
    private String cardName;
    private String[] drawnCards = new String[3];

	//constructor
	public CardGame(){
		points = 0;
		totalPoints = 0;
		random = 0;
		cardName = " ";
	}

	//compute methods
	//generate an integer randomly from 0 to 12, and then get a random card name
    public void play() {
        random = (int) (Math.random() * (cardNames.length - 1));
		cardName = cardNames[random];

	}

	//calculate the points of 1 game and the total points
	public void calculatePoints(){

		//just for the record, uncomment to make it easier to review
		//System.out.println(drawnCards[0]);
		//System.out.println(drawnCards[1]);
		//System.out.println(drawnCards[2]);
		//System.out.println(" ");

		points = 0;
		if (drawnCards[0] == "Ace" || drawnCards[0] == "Jack" || drawnCards[0] == "Queen" || drawnCards[0] == "King"){
			points = points + 30;
		}
		else {
			points = points - 14;
		}
		if (drawnCards[1] == "Ace" || drawnCards[1] == "Jack" || drawnCards[1] == "Queen" || drawnCards[1] == "King"){
			points = points + 30;
		}
		if (drawnCards[2] == "Ace" || drawnCards[2] == "Jack" || drawnCards[2] == "Queen" || drawnCards[2] == "King"){
			points = points + 30;
		}
		else {
			points = points - 14;
		}
		if (drawnCards[0] == "Ace" && drawnCards[1] == "Ace" && drawnCards[2] == "Ace"){
			points = points + 65;
		}
		totalPoints = totalPoints + points;
	}

	//setters and getters

    public int getPoints() {
        return points;
    }

	public int getTotalPoints() {
		return totalPoints;
    }

    public String getCardName(){
		return cardName;
	}

	public void setDrawnCards(String drawnCards[]){
		this.drawnCards = drawnCards;
	}
}





