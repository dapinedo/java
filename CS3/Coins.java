import java.util.Scanner;

/**
 * @author dp
 */
public class Coins {

    public static void main(String[] args) {
        
        // Class Declarations
        Scanner scnr = new Scanner(System.in);
        
        // Global Variable Declarations
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        int totalCents; // User input variable
        int leftOver;
        
        do {  
            // User Input
            System.out.print("Enter the total number of cents you have [0 to exit]: ");
            totalCents = scnr.nextInt();
        
            // Algorithm
            
            quarters = totalCents / 25;
            leftOver = totalCents % 25;
        
            
            dimes = leftOver / 10;
            leftOver %= 10;
        
            
            nickels = leftOver / 5;
            leftOver %= 5;
        
            pennies = leftOver;
            
            System.out.printf("%d quarters, %d dimes, %d nickels, %d pennies\n", quarters, dimes, nickels, pennies);
            
            } while (totalCents != 0);
        
        System.exit(0);
        
    } // end void main
    
} // end class coins
