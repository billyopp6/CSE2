//Billy Oppenheimer
//CSE2
//September 15, 2015
//hw03
/*Here i will write a program that calculates the amount of time remaining
until the user meets friends for dinner*/

import java.util.Scanner; //import Scanner class

public class Timer { //main method

    public static void main(String[] args) {
        
    //Accept the input
    Scanner myScanner; //declares the myScanner variable
    myScanner = new Scanner (System.in); //constructs my scanner
    
    System.out.print("Enter the current time in the form HHMM: "); //tell user to enter the current time
    int currentTime = myScanner.nextInt();
    
    System.out.print("Enter the time that you will be eating dinner: "); //tell user to enter the time of the dinner
    int dinnerTime = myScanner.nextInt();
    
    //Output
    int currentMinutes = currentTime % 100; //the minutes of the current time
    int currentHours = currentTime / 100; //hours of the current time 
    
    int dMinutes = dinnerTime % 100; //the minutes of the current time
    int dHours = dinnerTime / 100;
    
    int hoursRemaining = dHours - currentHours;
    int minutesRemaining = dMinutes - currentMinutes;
    
    System.out.print("You have " + hoursRemaining + " hours and " + minutesRemaining + " minutes until dinner. ");
    
    }
}    
    