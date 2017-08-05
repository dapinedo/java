import java.util.Random;
import java.util.Scanner;

/**
 * @author dp
 * date: June 21, 2017
 * Description: This program is a guessing game. A pseudorandom number is
 * generated between 1-100, and person needs to guess the number. Program will 
 * alert user if they are above or below and keep track of amount of tries.
 * Program will exit gracefully once user has guessed pseudorandom number 
 * correctly.
 */
public class GuessingGame {

    public static void main(String[] args) {
        
        // Class Declarations
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        
        // Variable Declarations
        int numberGuess;
        int numberRandom = randGen.nextInt(100) + 1;
        
        // Random Number Generation Testing Below if not commented
        /*
        System.out.println("Random Number Test: " + numberRandom);
        */
        
        // Loop condition continues until number is guessed; found = true
        boolean found = false; // declare/initialize while condition
        int i = 0; // declare/initialize counter
        while (!found) {
            System.out.print("Please guess a number between 1-100: ");
            numberGuess = scnr.nextInt();
            if (numberGuess > numberRandom) {
               System.out.println("You guessed too high, try a lower number");
            }
            else if (numberGuess < numberRandom) {
               System.out.println("You guessed too low, try a higher number");
            }
            else {
                found = true;
            }
            i++;
        } // end found loop
        
        System.out.printf("It took a total of %d tries this time.", i);
        System.out.println("Thank you! Goodbye!");
        System.exit(0);
    }
    
}
