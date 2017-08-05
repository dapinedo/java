public class ShowIO {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        int n1 = MyIO.getInt("Enter an Integer");
        int n2 = MyIO.getInt("Enter an Integer");

        MyIO.display("Total is: " + (n1 + n2));
    }

}

