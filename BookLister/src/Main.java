import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Book mybook1 = new Book("Evrim",100,"Ozan",2000);
        Book mybook2 = new Book("Zaman",200,"Ozan",1990);
        Book mybook3 = new Book("Kaya",314,"Ozan",2021);
        Book mybook4 = new Book("Kelimeler",420,"Ozan",2020);
        Book mybook5 = new Book("Yüzüklerin Efendisi",500,"Ozan",2014);

        HashSet<Book> myHash = new HashSet<>();
        myHash.add(mybook1);
        myHash.add(mybook2);
        myHash.add(mybook3);
        myHash.add(mybook4);
        myHash.add(mybook5);
        TreeSet<Book> mtree = new TreeSet<>(myHash);

        System.out.println(mtree);

        TreeSet<Book> bookSetPageNum = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getPageNumber() - b2.getPageNumber();
            }
        }.reversed());

        bookSetPageNum.add(mybook1);
        bookSetPageNum.add(mybook2);
        bookSetPageNum.add(mybook3);
        bookSetPageNum.add(mybook4);
        bookSetPageNum.add(mybook5);
        System.out.println(bookSetPageNum);

    }

}
