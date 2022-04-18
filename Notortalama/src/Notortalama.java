import java.util.Scanner;
public class Notortalama {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int mat, muzik, kimya,turkce,tarih,fizik;
        System.out.print("Matematik notunuz ");
        mat = sc.nextInt();
        System.out.print("Müzik notunuz ");
        muzik= sc.nextInt();
        System.out.print("Kimya notunuz ");
        kimya = sc.nextInt();
        System.out.print("Türkçe notunuz ");
        turkce= sc.nextInt();
        System.out.print("Tarih notunuz ");
        tarih = sc.nextInt();
        System.out.print("Fizik notunuz ");
        fizik = sc.nextInt();
        double sum = (mat + muzik+ kimya+turkce+tarih+fizik)/6;
        boolean pass = sum>=60;
        String str =(pass)? "Sınıfı geçti": "Sınıfta Kaldı";
        System.out.print(sum+" "+ str);

    }
}
