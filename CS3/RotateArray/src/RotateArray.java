import java.util.Random;
import java.util.Scanner;

public class RotateArray {
    /**
     * @author Daniel Pinedo
     */

    private static void rotateArrayLeft(int[] arr, int iter) {
        for (int j = 0; j < iter; j++) {
            int tempShift = arr[0];
            for (int i = 1; i < arr.length; i++) {
                int tempSwap = arr[i];
                arr[i - 1] = tempSwap;
            }
            arr[arr.length - 1] = tempShift;
        }
        return;
    }

    private static void rotateArrayRight(int[] arr, int iter) {
        for (int j = 0; j < iter; j++) {
            int tempShift = arr[arr.length - 1];
            for (int i = arr.length - 2; i >= 0; i--) {
                int tempSwap = arr[i];
                arr[i + 1] = tempSwap;
            }
            arr[0] = tempShift;
        }
        return;
    }

    public static void rotateArray(int[] arr, char shift, int iter) {
        if (shift == 'L') {
            rotateArrayLeft(arr, iter);
        }
        else if (shift == 'R') {
            rotateArrayRight(arr, iter);
        }
        return;
    }

    public static void main(String[] args) {
	    // Declare objects
        Random randgen = new Random();
        Scanner inputNum = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);

        //Prompt user for number of array elements
        System.out.print("Enter number of array elements: ");
        int numElements = inputNum.nextInt();

        //Generate random number for each element of array from 11-99
        int [] randArray = new int[numElements];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = randgen.nextInt(99 - 10) + 1;
        }

        //Output array elements to console
        System.out.print("This/These are the element(s) for your array: ");
        for (int s : randArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        //Prompt user for shift direction and number
        System.out.print("Which direction to shift? [L/R]: ");
        String shiftString = inputStr.next();
        char shiftChar = shiftString.toUpperCase().charAt(0);
        System.out.print("How many iterations? : ");
        int numIterations = inputNum.nextInt();


        //void method called rotateArray is run with array, shift direction, and iteration number called as args
        rotateArray(randArray, shiftChar, numIterations);

        //Output final results
        System.out.printf("Result(s) after shifting %c direction %d # of times: ", shiftChar, numIterations);
        for (int s : randArray) {
            System.out.print(s + " ");
        }
    }
}
