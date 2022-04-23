import java.util.Scanner;

public class HarmonicCalc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int userInput = sc.nextInt();
        double series = 1;
        double sum=0;
        for (int i =1; i<=userInput; i++){
            series /= i;
            System.out.println(series+ ",");
            sum += series;
        }
        System.out.println(sum);
    }
}
