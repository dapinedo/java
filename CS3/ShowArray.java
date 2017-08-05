/**
 *
 * @author dp
 */
public class ShowArray {

    public static void main(String[] args) {
        System.out.println("It is working");
        int [] x = new int[200];
        System.out.println("value of x: " + x);

// fill array with two digit number

        fillArray(x);
        printArray(x);
        doSort(x);
        System.out.println("@@@@@@@@@@@@ SORTED @@@@@@@@@@@@@");
        printArray(x);

        int t = sumArray(x);
        System.out.printf("Total is %d\n", t);
        double ave = aveArray(x);
        System.out.printf("Average is %.2f\n", ave);



    }

    public static void fillArray(int [] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * (99-10+1)) + 10;
        }
    }

    public static void printArray(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static int sumArray(int [] a) {
        int sum = 0;
        for (int i = 0; i< a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static double aveArray(int [] a) {
        return (double)sumArray(a) / a.length;
    }

    public static void doSort(int [] a) {
        for (int i = 0; i < a.length- 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

} // end ShowArray