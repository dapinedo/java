import java.util.Arrays;

public class BookMain {
    /**
     * @author Daniel Pinedo
     */

    public static void main(String[] args) {
	    Book [] booksArray = new Book[10];

        // populate the Array of object Book
	    booksArray[0] = new Book("Green Eggs and Ham", 19.99);
        booksArray[1] = new Book("Perseopolis", 16.99);
        booksArray[2] = new Book("My Uncle Napoleon", 14.99);
        booksArray[3] = new Book("The Master and Margarita", 8.99);
        booksArray[4] = new Book("Ask the Dust", 4.99);
        booksArray[5] = new Book("Aion", 21.98);
        booksArray[6] = new Book("The Four Loves", 12.67);
        booksArray[7] = new Book("The Four Agreements", 14.97);
        booksArray[8] = new Book("The Art of War", 24.98);
        booksArray[9] = new Book("The Three Body Problem", 26.95);

        /* //  *** BEGIN TEST - successful population of Book [] using Book.toString()
        System.out.println("*** BEGIN TEST - successful population of Book [] using Book.toString()\n");
        showBooksArray(booksArray);
        System.out.println(" *** END TEST - successful population of Book [] using Book.toString());
        // *** END TEST */

        // Book maxPrice = new Book();
        Book maxPrice = BookMain.max(booksArray);

        System.out.print("Maximum Priced Book\n" + "-----------------\n");
        System.out.println(maxPrice.toString());

        System.out.print("Array sorted by title\n" + "-------------------\n");
        Arrays.sort(booksArray, new BookTitleComparator() );
        showBooksArray(booksArray);

    } // end main(String[] args)

    public static void showBooksArray(Book [] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }

    public static Book max ( Book [] books) {
        Arrays.sort(books);

        /* //  *** BEGIN TEST - successful sort of Book [] using Book.toString()
        System.out.println("*** BEGIN TEST - successful sort of Book [] using Book.toString()\n");
        this.showBooksArray(books);
        System.out.println(" *** END TEST - successful sort of Book [] using Book.toString()");
        // *** END TEST */

        return books[books.length - 1];
    }
}
