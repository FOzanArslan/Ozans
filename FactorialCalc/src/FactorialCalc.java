import java.util.Scanner;

public class FactorialCalc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int userInput2 = sc.nextInt();
        int total3 = 1;
        int total = 1;
        int total2 =1;
        for (int i = 1; i<=userInput; i++){
            total *= i;
        }
        System.out.println(total);

        for (int i = 1; i<=userInput2; i++){
            total2*=i;
        }
        System.out.println(total2);
        int bolum = userInput-userInput2;
        for (int i = 1; i<=bolum; i++){
            total3*=i;
        }
        int bolumbuyuk= total2*total3;
        int sonuc = total/bolumbuyuk;

        System.out.println(sonuc);
    }


}
