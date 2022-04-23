import java.util.Scanner;

public class EvenCalc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int userInput;
        int total =0;
        do {
            System.out.println("Sayı giriniz: ");
             userInput = sc.nextInt();
             if (userInput%4 == 0 ){
                  total += userInput;
             }
        }while (userInput %2 == 0);
        System.out.println(total);

    }
}
