import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int[] list = new int[5];
        int i = 0;
        int random = rnd.nextInt(100);
        int right = 5;
        while(right>0){
            System.out.println("Tamininizi giriniz ?");
            int userChoice = sc.nextInt();
            list[i] = userChoice;
            if (userChoice>=0 && userChoice<= 100) {
                if (userChoice == random) {
                    System.out.println("Tebrikler doğru sayıyı buldunuz: " + userChoice);
                    break;
                } else if (userChoice > random) {
                    System.out.println("Doğru bilemediniz. Sayı tahminizden daha düşük.");
                } else if (userChoice < random) {
                    System.out.println("Doğru bilemediniz. Sayı tahminizden daha büyük.");
                }
                right--;
                i++;
            }else System.out.println("0-100 arasında bir sayı giriniz.");
        }

        if (right == 0){
            System.out.println("Oynama hakkınız bitti");
            System.out.println("Doğru sayı : " + random);
            System.out.println("Tahminleriniz   ::  ");
            System.out.println(Arrays.toString(list));}
        }
    }

