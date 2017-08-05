import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        //Object Declarations
        Scanner inputDouble = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.println("Hi, I am really good at math!! You'll see.");

        double number1;
        double number2;
        String operandString;
        char operand;
        String exitTest;
        boolean exit = false;
        do{
            System.out.print("Please enter two numbers with decimals separated by a space and press enter: ");
            number1 = inputDouble.nextDouble();
            number2 = inputDouble.nextDouble();
            System.out.print("Please enter an operand [ + - * or /] and press Enter: ");
            operandString = inputString.next();
            operand = operandString.charAt(0);
            switch (operand) {
                case '+': {
                    System.out.println("I am great at addition!");
                    double output = number1 + number2;
                    System.out.printf("%.2f + %.2f = %.2f%n", number1, number2, output);
                    break;
                }
                case '-': {
                    System.out.println("I am great at subtraction!");
                    double output = number1 - number2;
                    System.out.printf("%.2f - %.2f = %.2f%n", number1, number2, output);
                    break;
                }
                case '*': {
                    System.out.println("I am great at multiplication!");
                    double output = number1 * number2;
                    System.out.printf("%.2f * %.2f = %.2f%n", number1, number2, output);
                    break;
                }
                case '/': {
                    System.out.println("I am great at division!");
                    if (number2 != 0) {
                        double output = number1 / number2;
                        System.out.printf("%.2f / %.2f = %.2f%n", number1, number2, output);
                    }
                    else {
                        System.out.println("You cannot divide by zero!!!!");
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid operand entered.");
                }
            }
            System.out.print("Again? [Y]es/[N]o: ");
            exitTest = inputString.next();
            char exitChar = exitTest.toUpperCase().charAt(0);
            if (exitChar == 'N') {
                System.out.println("Bye!");
                exit = true;
            }
        } while (!exit);



    }
}
