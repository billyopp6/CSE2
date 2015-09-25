//Billy Oppenheimer
//CSE02
//September 22, 2015
//hw04
/*This program will allow a user to draw five random cards, and then detect if the five cards
contain a pair, two pair, or three of a kind*/

import java.util.Random;

public class PokerHand {
    public static void main(String[] args) {
        System.out.println("Your random cards were: ");
        
        //CARD1
       int card = (int) (Math.random() * 52); //creating the card
        int cardSuit = card / 13; 
        
        
        String suit;
        
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
        
        int cardNumber = card % 13; 
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
        
        System.out.println("the " + number + " of " + suit);



    //CARD2
int card2 = (int) (Math.random() * 52); //creating the card
       int cardSuit2 = card2 / 13; 
        
        
        String suit2;
        
        if (cardSuit2 == 0) {
            suit2 = (String) "Diamonds";
        }
        else if (cardSuit2 == 1) {
            suit2 = (String) "Clubs";
        }
        else if (cardSuit2 == 2) {
            suit2 = (String) "Hearts";
        }
        else {
            suit2 = (String) "Spades";
        }
        
        int cardNumber2 = card2 % 13; 
        String number2 = " ";
        
        switch ( cardNumber2 ) {
            case 0:
                number2 = "King";
                break;
            case 1: 
                number2 = "Ace"; 
                break;
            case 2:
                number2 = "2";
                break;
            case 3: 
                number2 = "3";
                break;
            case 4:
                number2 = "4";
                break;
            case 5: 
                number2 = "5"; 
                break;
            case 6:
                number2 = "6";
                break;
            case 7: 
                number2 = "7";  
                break;
            case 8:
                number2 = "8";
                break;
            case 9: 
                number2 = "9"; 
                break;
            case 10:
                number2 = "10";
                break;
            case 11: 
                number2 = "Jack"; 
                break;
            case 12:
                number2 = "Queen";
                break;
        }        
        
        System.out.println("the " + number2 + " of " + suit2);
        
        
        
        
        //CARD3
        
       int card3 = (int) (Math.random() * 52); //creating the card
        int cardSuit3 = card3 / 13; 
        
        
        String suit3;
        
        if (cardSuit3 == 0) {
            suit3 = (String) "Diamonds";
        }
        else if (cardSuit3 == 1) {
            suit3 = (String) "Clubs";
        }
        else if (cardSuit3 == 2) {
            suit3 = (String) "Hearts";
        }
        else {
            suit3 = (String) "Spades";
        }
        
        int cardNumber3 = card3 % 13; 
        String number3 = " ";
        
        switch ( cardNumber3 ) {
            case 0:
                number3 = "King";
                break;
            case 1: 
                number3 = "Ace"; 
                break;
            case 2:
                number3 = "2";
                break;
            case 3: 
                number3 = "3";
                break;
            case 4:
                number3 = "4";
                break;
            case 5: 
                number3 = "5"; 
                break;
            case 6:
                number3 = "6";
                break;
            case 7: 
                number3 = "7";  
                break;
            case 8:
                number3 = "8";
                break;
            case 9: 
                number3 = "9"; 
                break;
            case 10:
                number3 = "10";
                break;
            case 11: 
                number3 = "Jack"; 
                break;
            case 12:
                number3 = "Queen";
                break;
        }        
        
        System.out.println("the " + number3 + " of " + suit3);
        
        
    
        
        int card4 = (int) (Math.random() * 52); //creating the card
        int cardSuit4 = card4 / 13; 
        
        
        String suit4;
        
        if (cardSuit4 == 0) {
            suit4 = (String) "Diamonds";
        }
        else if (cardSuit4 == 1) {
            suit4 = (String) "Clubs";
        }
        else if (cardSuit4 == 2) {
            suit4 = (String) "Hearts";
        }
        else {
            suit4 = (String) "Spades";
        }
        
        int cardNumber4 = card4 % 13; 
        String number4 = " ";
        
        switch ( cardNumber4 ) {
            case 0:
                number4 = "King";
                break;
            case 1: 
                number4 = "Ace"; 
                break;
            case 2:
                number4 = "2";
                break;
            case 3: 
                number4 = "3";
                break;
            case 4:
                number4 = "4";
                break;
            case 5: 
                number4 = "5"; 
                break;
            case 6:
                number4 = "6";
                break;
            case 7: 
                number4 = "7";  
                break;
            case 8:
                number4 = "8";
                break;
            case 9: 
                number4 = "9"; 
                break;
            case 10:
                number4 = "10";
                break;
            case 11: 
                number4 = "Jack"; 
                break;
            case 12:
                number4 = "Queen";
                break;
        }        
        
        System.out.println("the " + number4 + " of " + suit4);
        
        
        
        
        
        int card5 = (int) (Math.random() * 52); //creating the card
        int cardSuit5 = card5 / 13; 
        
        
        String suit5;
        
        if (cardSuit5 == 0) {
            suit5 = (String) "Diamonds";
        }
        else if (cardSuit5 == 1) {
            suit5 = (String) "Clubs";
        }
        else if (cardSuit5 == 2) {
            suit5 = (String) "Hearts";
        }
        else {
            suit5 = (String) "Spades";
        }
        
        int cardNumber5 = card5 % 13; 
        String number5 = " ";
        
        switch ( cardNumber5 ) {
            case 0:
                number5 = "King";
                break;
            case 1: 
                number5 = "Ace"; 
                break;
            case 2:
                number5 = "2";
                break;
            case 3: 
                number5 = "3";
                break;
            case 4:
                number5 = "4";
                break;
            case 5: 
                number5 = "5"; 
                break;
            case 6:
                number5 = "6";
                break;
            case 7: 
                number5 = "7";  
                break;
            case 8:
                number5 = "8";
                break;
            case 9: 
                number5 = "9"; 
                break;
            case 10:
                number5 = "10";
                break;
            case 11: 
                number5 = "Jack"; 
                break;
            case 12:
                number5 = "Queen";
                break;
        }        
        cardNumber = 1;
        cardNumber2 = 2;
        cardNumber3 = 0;
        cardNumber4 = 4;
        cardNumber5 = 5;
        
        System.out.println("the " + number5 + " of " + suit5);
        int count = 0;
        boolean pair = false;
        boolean twoPair = false;
        boolean threeKind = false; 
        if ( number.equals(number2) ) {
            count++;
        }
        if ( number.equals(number3) ) {
            count++;
        }
        if ( number.equals(number4) ) {
            count++;
        }
         if ( number.equals(number5) ) {
            count++;
        }
        if ( count == 1) {
            pair = true;
        }
        else if ( count == 2) {
            threeKind = true;
        }
        else {
            pair = false;
            threeKind = false;
        }
        int count2 = 0;
        boolean pair2 = false;
        boolean threeKind2 = false; 
        
       if ( number2.equals(number3) ) {
            count2++;
        }
        if ( number2.equals(number4) ) {
            count2++;
        }
        if ( number2.equals(number5) ) {
            count2++;
    
        }
        if ( count2 == 1) {
            pair2 = true;
        }
        else if ( count2 == 2) {
            threeKind2 = true;
        }
        else {
            pair2 = false;
            threeKind2 = false;
        }
        int count3 = 0;
        boolean pair3 = false;
        boolean threeKind3 = false; 
        if ( number3.equals(number4) ) {
            count3++;
        }
        if ( number3.equals(number5) ) {
            count3++;
        }
        if ( count3 == 1) {
            pair3 = true;
        }
        else if ( count3 == 2) {
            threeKind3 = true;
        }
        else {
            pair3 = false;
            threeKind3 = false;
        }
        boolean pair4 = false;
        int count4 = 0;
        if (number4.equals(number5) ) {
            pair4 = true;
            count4++;
        }
        
        if ( threeKind3 == true || threeKind2 == true || threeKind == true) {
            System.out.println("You got three of a kind! Heck yea!");
        }
        else {
            if (count == 1 && count2 == 1) {
                twoPair = true;
            }
            else if (count2 == 1 && count3 == 1) {
                twoPair = true;
            }
            else if (count3 == 1 && count == 1) {
                twoPair = true;
            }
            else if (count == 1 && count4 == 1) {
                twoPair = true;
            }
            else if (count2 == 1 && count4 == 1) {
                twoPair = true;
            }
            else if (count3 == 1 && count4 == 1) {
                twoPair = true;
            }
            else {
                if ( pair == true || pair2 == true || pair3 == true || pair4 ==true) {
                    System.out.println("One Pair! Not Bad!");
                }
                else {
                    System.out.println("Just a High Card, better fold that hand");
                }
            }
        }
        if ( twoPair == true ) {
                System.out.println("Two Pairs! Now We're Talkin!");
        }
        
    }
}
