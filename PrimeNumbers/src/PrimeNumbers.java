import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int uInput = sc.nextInt();
        boolean flag= false;
        int c= 2;
        while(c<uInput) {
            flag = false;
            for (int i = 2; i <= c / 2; ++i) {
                if (c % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) System.out.println(c);
            c++;
        }
    }
    }



