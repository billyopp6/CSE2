//Billy Oppenheimer
//CSE2
//September 15, 2015
//hw03
/*Here I will write a program to calculate the
volume and surface area of a black*/

import java.util.Scanner; //import Scanner class

public class Block { //main method

    public static void main(String[] args) {
        
    //Accept the input:
    Scanner myScanner; //declares the myScanner variable
    myScanner = new Scanner (System.in); //constructs my scanner
    
    System.out.print("Enter the length of the block: "); //tell user to enter the length of the block
    double blockLength = myScanner.nextDouble();
    
    System.out.print("Enter the width of the block: "); //tell user to enter the width of the block
    double blockWidth = myScanner.nextDouble();
    
    System.out.print("Enter the height of the block: "); //tell user to enter the height of the block
    double blockHeight = myScanner.nextDouble();
    
    //Output:
    double volume = blockLength * blockWidth * blockHeight;
    
    double surfaceArea = 2 * blockLength + 2 * blockWidth + 2 * blockHeight;
    
    System.out.println("The volume of the block of dimensions " + blockLength  + " x " + blockWidth  + " x " +  blockHeight + " x " + "is " + volume);
    
    System.out.println("The surface area of the block is " + surfaceArea);
    
    }
}