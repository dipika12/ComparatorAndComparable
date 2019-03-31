import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Book b9 = new Book(19,"ZeoGraphy", "social");
        Book b1 = new Book(10,"Geography", "social");
        Book b2 = new Book(30,"Algebbra", "Math");
        Book b3 = new Book(50,"Computer", "computer");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        BookComparator bookComparator = new BookComparator();
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b9);
        Collections.sort(bookList,bookComparator);
        for (Book b:
             bookList) {
            System.out.println(b.getId());
            System.out.println(b.getName());
            System.out.println(b.getCategory());
        }


        //Example for implementing Comparable
        ArrayList<AudioBook> audioBookList = new ArrayList<>();
        AudioBook ad10 = new AudioBook(10, "GameOfThrone", "Series");
        AudioBook ad6 = new AudioBook(6, "ReactTuroral", "JAvascriptTutorails");
        AudioBook ad9 = new AudioBook(78,"JavaTutorail", "Anonamous");
        audioBookList.add(ad10);
        audioBookList.add(ad6);
        audioBookList.add(ad9);
        Collections.sort(audioBookList);
        for (AudioBook b:
                audioBookList) {
            System.out.println(b.getId());
            System.out.println(b.getName());
            System.out.println(b.getCategory());
        }




    }
}
