import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
   //sort with book name
    public int compare(Book o1, Book o2) {
       return (o1.getName().compareTo(o2.getName()));
    }
}
