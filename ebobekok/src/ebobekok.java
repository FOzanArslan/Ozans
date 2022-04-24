import java.util.Scanner;

public class ebobekok {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int num1 = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int num2 = sc.nextInt();
        int i = Math.max(num1,num2);
        int b = 1;
        while (i>0){
            if (num1%i == 0 && num2%i == 0){
                System.out.println("Ebob = "+i);
                break;
            }
            i--;
        }
        while (b>0){
            int numkat1= b*num1;
            if(numkat1 % num2==0){
                System.out.println("Ekok =" + numkat1);
                break;
            }
            b++;
        }

    }
}
