import java.util.Scanner;

/**
 * @author Daniel Pinedo
 * due: July 2, 2017
 */

public class SecretMessage {
    /**
     * @param args
     * @since 1.8.0
     */

    public static void main(String[] args) {
        
        // invoke non-static input objects 
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        SecretMessage sm = new SecretMessage();
        
        // menu sentinel loop
        boolean quit = false;
        int choice;
        String getString;
        while (!quit) {
            System.out.print("Enter 1 to encode, 2 to decode, 3 to quit: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter the text to encode: ");
                    getString = inputStr.nextLine();
                    sm.codeMessage(getString, true);
                    break;
                }
                case 2: {
                    System.out.println("Enter the text to decode: ");
                    getString = inputStr.nextLine();
                    sm.codeMessage(getString, false);
                    break;
                }
                case 3: {
                    System.out.println("Goodbye.");
                    quit = true;
                    break;
                }
                default: {
                    System.out.println("Bad input, try again."); 
                }
            }
            
        } // end Menu while loop
       
        System.exit(0);

    } // end main
    
    // SecretMessage methods
     
    public boolean isLowerCaseLetter(char c) {
       /** input character returns true if lower case, else false
        * @param c is a {@code char} taken from {@code codeMessage()}
        * @return the value {@code flag}
        * @since 1.8.0
        */
       boolean flag = false;
        if (c >= 97 && c <= 122) {
           flag = true;
        }
        return flag;
    }
    
    public boolean isUpperCaseLetter(char c) {
        /** input character returns true if upper case, else false
        * @param c is a {@code char} taken from {@code codeMessage()}
        * @return the value {@code flag}
        * @since 1.8.0
        */
        boolean flag = false;
        if (c >= 65 && c <= 90) {
            flag = true;
        }
        return flag;
    }
    
    public boolean isLetter(char c) {
        /** input character returns true if lower or upper case, else false
        * @param c is a {@code char} taken from {@code codeMessage()}
        * @return the value {@code flag}
        * @since 1.8.0
        */
        boolean flag = false;
        if ((c >= 97 && c <= 122) || (c >= 65 && c <= 90)) {
            flag = true;
        }
        return flag;
    }

    public char toLowerCase(char c) {
        /** input character returns lowercase if uppercase
        * @param c is a {@code char} taken from {@code codeMessage()}
        * @return the value {@code c} adds ASCII value {@code c+=32;}
        * @since 1.8.0
        */
        if (c >= 65 && c <= 90) {
            c += 32;
        }
        return c;
    }
 
    public char toUpperCase(char c) {
       /** input character returns uppercase if lowercase
       * @param c is a {@code char} taken from {@code codeMessage()}
       * @return the value {@code c} subtracts ASCII value {@code c-=32;}
       * @since 1.8.0
       */
       if (c >= 97 && c <= 122) {
           c -=32;
       } 
       return c;
    }
    
    public char codeChar(char c, boolean enc) { 
        /** takes a char and a boolean flag. If the flag is true, 
        * it returns the encoded char according to the given mapping. If the flag 
        * is false, it returns the decoded char according to the given mapping.
        * @param c is a {@code char} taken from {@code codeMessage()}
        * @param enc is a (@code boolean}
        * @return the value {@code output} 
        *           if {@code enc == true;} 
        *               compares input from index in {@code String decodeKey}
        *               writes output from index in (@code String encodeKey}
        *           else
        *               compares input from index in {@code String encodeKey}
        *               writes output from index in (@code String decodeKey}
        * @since 1.8.0
        */
        
        // decode and encode keys
        String decodeKey = "abcdefghijklmnopqrstuvwxyz";
        String encodeKey = "kngcadsxbvfhjtiumylzqropwe"; 
        int keyLength = 26; // number of characters in decodeKey and encodeKey
        
        char output = c;
        
        if (enc) { // encode condition
            /*
            loop runs until: 
                   c matches letter at index of decodeKey, set flag done=true;
                   loop has run keyLength amount of times
            */
            boolean done = false;
            int keyIndex = 0;
            while (!done && this.isLetter(c) && (keyIndex <= keyLength)) {
                if (this.isLowerCaseLetter(c)) {
                    if (c == decodeKey.charAt(keyIndex)) {
                        output = encodeKey.charAt(keyIndex);
                        done = true;
                    }
                }
                if (this.isUpperCaseLetter(c)) {
                    output = this.toLowerCase(c);
                    if (output == decodeKey.charAt(keyIndex)) {
                        output = encodeKey.charAt(keyIndex);
                        done = true;
                    }
                    output = this.toUpperCase(output);
                }   
            keyIndex++;
            } // end encode loop
        }
        else { // decode condition
            /*
            loop runs until: 
                   c matches letter at index of encodeKey, set flag done=true;
                   loop has run keyLength amount of times
            
            */
            boolean done = false;
            int keyIndex = 0;
            while (!done && this.isLetter(c) && (keyIndex <= keyLength)) {
                if (this.isLowerCaseLetter(c)) {
                    if (c == encodeKey.charAt(keyIndex)) {
                        output = decodeKey.charAt(keyIndex);
                        done = true;
                    }
                }
                if (this.isUpperCaseLetter(c)) {
                    output = this.toLowerCase(c);
                    if (output == encodeKey.charAt(keyIndex)) {
                        output = decodeKey.charAt(keyIndex);
                        done = true;
                    }
                    output = this.toUpperCase(output);
                }   
            keyIndex++;
            }
        }  
        return output;
    } // end method codeChar()
    
    public void codeMessage(String str, boolean enc) {
        /**
         * takes a String and a boolean flag. If the flag is true, it prints 
         * the given message encoded. If the flag is false, it prints the given 
         * message decoded. This method just calls the codeChar method for every
         * character in the String and prints the character that codeChar 
         * returns.
         * @param str {@code String} taken from main
         * @param enc {@code boolean}
         * @since 1.8.0
         */
        int len = str.length();
        char extract;
        char completed;
        if (enc) { 
            for (int i = 0; i < len; i++) {
                extract = str.charAt(i);
                completed = this.codeChar(extract, true);
                System.out.print(completed);
            }
        }
        else {
            for (int i = 0; i < len; i++) {
                extract = str.charAt(i);
                completed = this.codeChar(extract, false);
                System.out.print(completed);
            }
        }
        System.out.println("\n");
    }
} // end class SecretMessage


/*
SAMPLE OUTPUT

Enter 1 to encode, 2 to decode, 3 to quit: 1
Enter the text to encode: 
ENCODE this!
ATGICA zxbl!

Enter 1 to encode, 2 to decode, 3 to quit: 2
Enter the text to decode: 
ATGICA zxbl!
ENCODE this!

Enter 1 to encode, 2 to decode, 3 to quit: 3
Goodbye.
*/