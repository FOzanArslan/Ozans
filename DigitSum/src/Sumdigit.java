import java.util.Scanner;
import java.lang.Math;
public class Sumdigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int userInput= sc.nextInt();
        int rem;
        int sum= 0;
        while (userInput != 0){
            rem = userInput % 10;
            userInput = userInput/10;
            sum +=rem;
        }
        System.out.println(sum);

    }
}
