/**
 * Created by dp on 7/26/17.
 */

public class Book implements Comparable <Book> {

    private String title;
    private double price;

    //Constructor
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    //Accessors
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    //Mutators
    public void setTitle(String t) {
        title = t;
    }

    public void setPrice(double p) {
        price = p;
    }

    public String toString() {
        return "Title: " + title + "\n"
                + "Price: $" + price + "\n";
    }

    /** implementation of Comparable method(s)
    * this implementation will identify:
    *      - if the Book objects are identical
    *      - if the price of the Book objects are different.
    */

    @Override
    public int compareTo(Book b2) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        int answer = 0;
        if (this == b2) {
            answer = EQUAL;
        }

        //comparing price
        if (this.price < b2.price) {
            answer = BEFORE;
        }
        if (this.price > b2.price) {
            answer = AFTER;
        }
        return answer;
    }

} // end Class Book

