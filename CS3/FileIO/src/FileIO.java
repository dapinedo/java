import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO { // Bubble Sort
    static final int MAX = 5;

    public static doSort(String [] x) {
        for (int i = 0 ; i < x.length - 1 ; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if x[i].compareTo(x[j]) > 0 {
                    String temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }
}

    public static void main(String[] args) throws IOException {
        FileInputStream inFile = null; // File input stream
        Scanner inputScan= null;                   // Scanner object
        String [] fileString = new String [MAX];  // Data value from file


        // output file stream
        FileOutputStream outFile = null; // File output stream
        PrintWriter pr = new PrintWriter(outFile);
        //pr.println("STUFF");
        pr.close();

        // Try to open file
        System.out.println("Opening file myfile.txt.");
        inFile = new FileInputStream(":\\myfile.txt");
        inputScan = new Scanner(inFile);

        // File is open and valid if we got this far (otherwise exception thrown)
        // myfile.txt should contain two integers, else problems
        System.out.println("Reading strings from file");
        for (int i = 0; i < fileString.length; i++) {
            fileString[i] = inputScan.nextLine();
        }

        // Output values read from file
        for (int i = 0; i < fileString.length; i++){
            System.out.println(fileString[i]);
        }

        // Done with file, so try to close it
        System.out.println("Closing file myfile.txt.");
        inFile.close(); // close() may throw IOException if fails

        return;
    }
}
