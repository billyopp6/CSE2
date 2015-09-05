////////////////////////////////////////////////////////////////////////////////
//Billy Oppenheimer
//CSE002
//September 4 2015
//lab02
//Cyclometer Java Program
//
public class Cyclometer {
    // main method required for every Java program
    public static void main(String[] args) {
        int secsTrip1=480; //declaring and initializing an integer for number of seconds in Trip 1
        int secsTrip2=3220; //declaring and initializing an integer for number of seconds in Trip 2
        int countsTrip1=1561; //declaring and initializing an integer for rotation count in Trip 1
        int countsTrip2=9037; //declaring and initializing an integer for rotation count in Trip 2
        double wheelDiameter=27.0, //declaring a double for wheel diameter
        PI=3.14159, //value of PI
           feetPerMile=5280, //Converts feet in the trip to miles
           inchesPerFoot=12, //Converts inches in the trip to feet
           secondsPerMinute=60; //Converts seconds in the trip to minutes
        double distanceTrip1, distanceTrip2, totalDistance; //declaring a double
        
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }  //end of main method
}  //end of class
