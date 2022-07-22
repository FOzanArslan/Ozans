import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Book bk1 = new Book("Batıda yeni bir şey yok", "Ozan", 2000,300);
        Book bk2 = new Book("Gazap Üzümleri", "Ozan", 2000,300);
        Book bk3 = new Book("Dövüş Klübü", "Ozan", 2000,69);

        ArrayList<Book> books = new ArrayList<>();
        books.add(bk1);
        books.add(bk2);
        books.add(bk3);

        Map<String, String> booksandAuthors = new HashMap<>();
        books.stream().forEach(p -> booksandAuthors.put(p.getName(),p.getAuthorName()));
        for (String b : booksandAuthors.keySet()){
            System.out.println("Kitap : "+ b + ", Yazar : "+ booksandAuthors.get(b));
        }

        List<Book> newList=books.stream().filter(p->p.getPageNumber()>100).toList();
        System.out.println("\nSayfa Sayısı 100'den fazla olan kitaplar :");
        for(Book b:newList){
            System.out.println("Kitap Adı : "+b.getName()+" | " +
                    "Sayfa Sayısı : "+b.getPageNumber()+" | "+
                    "Yazar : "+b.getPageNumber()+" | "+
                    "Yayın Tarihi : "+b.getPageNumber());
        }

    }

}
