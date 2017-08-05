import java.util.Random;
import java.util.Scanner;

/**
 * @author dp
 * June 22, 2017
 * Description: throw the six-sided die x amount of times and calculate how many
 * times pseudorandom generator lands on each.
 */
public class DiceGame {

    public static void main(String[] args) {
        
        // Class Declarations
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        
        // Initial Variable Declarations
        int s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0, s6 = 0;
        
        // User Prompts & Scanner
        System.out.print("Enter total dice rolls for 6-sided die: ");
        int numRolls = scnr.nextInt();
        
        // Loop for die rolls
        for (int i = 0; i < numRolls; i++) {
            int dieRoll = randGen.nextInt(6) + 1;
            switch (dieRoll) {
                case 1: s1++;
                        break;
                case 2: s2++;
                        break;
                case 3: s3++;
                        break;
                case 4: s4++;
                        break;
                case 5: s5++;
                        break;
                case 6: s6++;
                        break;
            } // end switch
        } // end die roll loop
 
        // Comment out below for check of total counts of rolls
        
        /*
        int countCheck = s1 + s2 + s3 + s4 + s5 + s6;
        System.out.printf("Count Check: %d\n\n", countCheck);
        */
        
        System.out.printf("For %d total rolls of the 6-sided die:\n", numRolls);
        System.out.printf(" Side 1 rolls total: %d\n", s1);
        System.out.printf(" Side 2 rolls total: %d\n", s2);
        System.out.printf(" Side 3 rolls total: %d\n", s3);
        System.out.printf(" Side 4 rolls total: %d\n", s4);
        System.out.printf(" Side 5 rolls total: %d\n", s5);
        System.out.printf(" Side 6 rolls total: %d\n", s6);
        
        // Goodbye
        System.out.println("\nGoodbye!!");
    } // end main
    
} // end class DiceGame
