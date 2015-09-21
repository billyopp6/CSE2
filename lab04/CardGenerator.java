//Billy Oppenheimer
//CSE2
//lab04-Card Generator
//September 18, 2015
/*This program will allow a magician to practice card trips by picking a random
card from the deck*/

import java.util.Random; //import scanner

public class CardGenerator { //define a class
    public static void main(String[] args) {
    
        int card = (int) (Math.random() * 52); //creating the card
        
        int cardSuit = card / 13; //#1A
        
        
        String suit;
        //2
        if (cardSuit == 0) {
            suit = (String) "Diamonds";
        }
        else if (cardSuit == 1) {
            suit = (String) "Clubs";
        }
        else if (cardSuit == 2) {
            suit = (String) "Hearts";
        }
        else {
            suit = (String) "Spades";
        }
        
        int cardNumber = card % 13; //1B
        String number = " ";
        
        switch ( cardNumber ) {
            case 0:
                number = "King";
                break;
            case 1: 
                number = "Ace"; 
                break;
            case 2:
                number = "2";
                break;
            case 3: 
                number = "3";
                break;
            case 4:
                number = "4";
                break;
            case 5: 
                number = "5"; 
                break;
            case 6:
                number = "6";
                break;
            case 7: 
                number = "7";  
                break;
            case 8:
                number = "8";
                break;
            case 9: 
                number = "9"; 
                break;
            case 10:
                number = "10";
                break;
            case 11: 
                number = "Jack"; 
                break;
            case 12:
                number = "Queen";
                break;
            
        }
        System.out.println("You picked the " + number + " of " + suit);
    }
    
}
    