//Billy Oppenheimer
//CSE2
//September 11, 2015
//lab03
/*Here I will create a program that obtains the cost of a restaurant bill, 
the percentage tip the users wish to pay, and the number of ways the check will be split
to determine how much each person will pay*/

import java.util.Scanner; //this command imports the Scanner Class

public class Check {
    //main method required for every Java program
    public static void main(String[] args) {
        //First we need to accept the input
        Scanner myScanner; //this statement declares the myScanner variable
        myScanner = new Scanner (System.in); //constructs my scanner
        
        System.out.print("Enter the original cost of the check in the form xx.xx: ");//tells user to enter the cost of the check
        double checkCost = myScanner.nextDouble();
        
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx) : ");
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100; //convert the percentage into a decimal value
        
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        //Now we output the amount that each member of the group needs to spend in order to pay the check
        double totalCost;
        double costPerPerson;
        int dollars, //whole dollar amoubt of cost
                dimes, pennies; //for storing digits
                    //to the right of the decimal point
                    //for the cost$
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        //get the whole amount, dropping decimal fraction
        dollars=(int)costPerPerson;
        //get dimes amount, e.g.,
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        // where the % (mod) operator returns the remainder 
        // after the division: 583%100 -> 83, 27%5 -> 2
        dimes=(int)(costPerPerson * 10) % 10;
        pennies=(int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
    }//end of main method
}//end of class