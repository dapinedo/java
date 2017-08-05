import java.util.Scanner;

/**
 *
 * @author Daniel Pinedo
 */
public class Driver {

    // Below is ugly spaghetti code for public class Driver which includes class PairOfDice
    // Future versions of this program should include separate methods for:
    //      - char Introduction(), boolean RollForTurn(), int PlayerTurn(int roundScore),
    //      - int ComputerTurn(int roundScore), GameEnd();
    // Driver class is referenced and extended by PairOfDice

    // How many points per round before computer skips a turn.
    final static int COMP_TURN = 20;

    public static void main(String[] args) {

        //Object declaration
        PairOfDice dice = new PairOfDice();
        Scanner inputStr = new Scanner(System.in);

        //Introduction
        System.out.println("Welcome to the game of Pig. Have fun my little piggies.");

        //Game Menu - each player rolls the dice, highest goes first.
        boolean turnPlayer = true; // initialize player turn condition
        boolean gameOver = false; // initialize game loop condition

        System.out.println("We will roll a die to see who goes first, Player 1 or Computer. Computer wins tie.");
        System.out.print("Type [Y]es to Continue or [N]o to quit and press [Enter]: ");
        String keepGoing = inputStr.nextLine();
        if (keepGoing.toUpperCase().charAt(0) == 'Y') {
            dice.rollDie1();
            dice.rollDie2();
            System.out.println(dice.toString());
            turnPlayer = (dice.getDie1() > dice.getDie2()) ? true : false;
            if (turnPlayer) {
                System.out.println("Left die wins!! Player goes first");
            } else {
                System.out.println("Right die wins!! Computer goes first");
            }
        }
        else {
            gameOver = true;
        }

        //Game starts
        int counterPlayer = 0; //player counter initialization
        int counterComputer = 0; //computer counter initialization


        while (!gameOver) {
            // Player turn
            if (turnPlayer) {
                boolean turnEnd = false; // initialize turn loop condition
                System.out.println("-----PLAYER TURN-----");
                while (!turnEnd) {
                    //roll the dice
                    dice.rollDie1();
                    dice.rollDie2();
                    counterPlayer += dice.getSum(); // sum of two dice
                    System.out.println(dice.toString()); // print to console this turn
                    System.out.println("Sum total: " + counterPlayer); // print to console current counter of points.
                    if (dice.getDie1() == 1 || dice.getDie2() == 1) {
                        counterPlayer = 0;
                        turnPlayer = false;
                        turnEnd = true;
                        System.out.println("Oops, at least one die was a 1. Lost all points and turn.");
                    }
                    if (counterPlayer >= 100) {
                        turnEnd = true;
                        gameOver = true;
                        System.out.println("You scored 100 total or more!!! Game is over, you win!!");
                    }
                    System.out.println("[R]oll again or [S]witch? Enter letter and press [Enter]");
                    keepGoing = inputStr.nextLine();
                    if (keepGoing.toUpperCase().charAt(0) == 'S') {
                        turnPlayer = false;
                        turnEnd = true;
                    }
                } // end player turn loop
            } // end player turn condition

            if (!turnPlayer) {
                boolean turnEnd = false;
                int turnCounter = 0;
                System.out.println("-----COMPUTER TURN-----");
                while (!turnEnd) {
                    dice.rollDie1();
                    dice.rollDie2();
                    counterComputer += dice.getSum();
                    turnCounter += dice.getSum();
                    System.out.println(dice.toString());
                    System.out.println("Sum total: " + counterComputer);
                    if (dice.getDie1() == 1 || dice.getDie2() == 1) {
                        counterComputer = 0;
                        turnPlayer = true;
                        turnEnd = true;
                        System.out.println("Oops, at least one die was a 1. Lost all points and turn.");
                        break;
                    }
                    if (counterComputer >= 100) {
                        turnEnd = true;
                        gameOver = true;
                        System.out.println("Computer scored above 100 total!!! Game is over, you lose!!");
                    }
                    if (turnCounter >= COMP_TURN) {
                        turnEnd = true;
                        turnPlayer = true;
                        System.out.println("Computer opts to skip next turn.");
                    }
                    else {
                        System.out.println("Computer opts to continue.");
                    }
                } // end computer turn loop

            } // end computer turn condition
        } // end game loop

        System.out.println("I hope you enjoyed our PIG game. Goodbye.");
        System.exit(0);
    } // end main function

} // end Driver class

class PairOfDice extends Die {
    private Die die1;
    private Die die2;

    public PairOfDice() {
        die1 = new Die();
        die2 = new Die();
    }
    public PairOfDice(Die d1, Die d2) {
        die1 = d1; die2 = d2;
    }

    public int rollDie1() {
        die1.rollDie();
        return die1.getFace();
    }
    public int rollDie2() {
        die2.rollDie();
        return die2.getFace();
    }
    public int getDie1() {
        return die1.getFace();
    }
    public int getDie2() {
        return die2.getFace();
    }
    public int getSum() {
        int sum = die1.getFace() + die2.getFace();
        return sum;

    }
    public String toString() {
        return  "Die 1: " + die1.getFace() + " || Die 2: " + die2.getFace() + "\n"
                + "Sum: " + this.getSum() + "\n";
    }
}

