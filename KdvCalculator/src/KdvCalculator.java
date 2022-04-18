import java.util.Scanner;
public class KdvCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number: ");
        int uValue = sc.nextInt();
        if(uValue<=1000) {

            double kdvValue = uValue + (uValue * 0.18);
            double kdvH = uValue * 0.18;

            System.out.println("Kdv'siz fiyat: " + uValue);
            System.out.println("Kdv li fiyat: " + kdvValue);
            System.out.println("Kdv miktarı: " + kdvH);
        } else if (uValue>1000) {
            double kdvValue = uValue + (uValue * 0.08);
            double kdvH = uValue * 0.08;

            System.out.println("Kdv'siz fiyat: " + uValue);
            System.out.println("Kdv li fiyat: " + kdvValue);
            System.out.println("Kdv miktarı: " + kdvH);
        }
    }
}
