import java.util.Scanner;

public class ENumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Alttaki numarayı giriniz");
        int altInput = sc.nextInt();
        System.out.println("Üstteki numarayı giriniz");
        int ustInput = sc.nextInt();
        int toplam=1;

        for (int i=1; i<=ustInput; i++){
            toplam *=altInput;
        }
        System.out.println(toplam);
    }
}
