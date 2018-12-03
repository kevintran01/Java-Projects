//import class libraries, except user input, check for valid input, catch errors in input,
// a bunch of math functions and more.

import java.util.Scanner;

public class importAndExcept {
    static Scanner userInput = new Scanner(System.in); //users keyboard

    public static void main(String[] args) {
        System.out.print("Your favorite number: ");

        if (userInput.hasNextInt()) {

            int numberEntered = userInput.nextInt();

            System.out.println("You entered " + numberEntered);

            int numEnteredTimes2 = numberEntered * 2;
            System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);

            int numEnteredSubtract2 = numberEntered - 2;
            System.out.println(numberEntered + " - 2 " + " = " + numEnteredSubtract2);

            int numEnteredDivide = numberEntered / 2;
            System.out.println(numberEntered + " / 2 " + " = " + numEnteredDivide);

            int numberABS = Math.abs(numberEntered);
            int whichIsBigger = Math.max(5, 7);
            int whichIsSmaller = Math.min(5, 7);

            double numSqrt = Math.sqrt(5.23);

            int numCeiling = (int) Math.ceil(5.23);
            int numFloor = (int) Math.floor(5.43);
            int numRound = (int) Math.round(5.50);

            int randomNumber = (int) (Math.random() * 10);

            System.out.println(numberABS);
            System.out.println(whichIsBigger);
            System.out.println(whichIsSmaller);
            System.out.println(numSqrt);
            System.out.println(numCeiling);
            System.out.println(numFloor);
            System.out.println(numRound);
            System.out.println("Random number is: " + randomNumber);

        } else {
            System.out.println("Enter an integer next time");
        }
    }
}