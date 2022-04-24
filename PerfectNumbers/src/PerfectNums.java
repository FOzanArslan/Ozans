import java.util.Scanner;

public class PerfectNums {
    public static void main(String args[]){
        System.out.println("Sayı Giriniz: ");
        Scanner sc = new Scanner(System.in);
        int uInput = sc.nextInt();
        int sum = 0;
        for (int i=1; i<uInput;i++){
            if (uInput%i== 0){
                sum += i;
            }
        }
        if (sum == uInput){
            System.out.println(uInput+" bir mükemmel sayıdır.");
        }else System.out.println(uInput+" bir mükemmel sayı değildir.");
    }
}
