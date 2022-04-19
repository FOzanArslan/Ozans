import java.util.List;
import java.util.Scanner;
import java.lang.Math;
public class Sayisiralama {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.println("Birinci sayıyı giriniz: ");
        a = sc.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        b = sc.nextInt();

        System.out.println("Üçüncü sayıyı giriniz: ");
        c = sc.nextInt();
        int[] myNum = {a,b,c};
        int largest = Math.max(a,b);
        int largest2 = Math.max(largest, c);

        int min = Math.min(a,b);
        int min2= Math.min(min,c);

        if (a == largest2 && b==min2){
            System.out.println("b<c<a");
        }else if (a == min2 && b== largest2){
            System.out.println("a<c<b");
        }else if (c == min2 && b== largest2){
            System.out.println("c<a<b");
        }else if (b == min2 && c== largest2){
            System.out.println("b<a<c");
        }else if (c == min2 && a== largest2){
            System.out.println("c<b<a");
        }else if (a == min2 && c== largest2){
            System.out.println("a<b<c");
        }


    }
}
