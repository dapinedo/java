import java.util.Comparator;

/**
 * Created by dp on 7/27/17.
 */
public class BookTitleComparator implements Comparator <Object> {

    @Override
    public int compare (Object o1, Object o2) {
        Book b1 = (Book)o1;
        Book b2 = (Book)o2;

        return b1.getTitle().compareTo(b2.getTitle());
    }
}
