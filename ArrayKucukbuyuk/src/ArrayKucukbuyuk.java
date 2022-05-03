import java.util.Arrays;
import java.util.Scanner;

public class ArrayKucukbuyuk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç eleman girmek istersiniz? ");
        int diziboyut = sc.nextInt();
        int temp = 0;

        int[] list = new int[diziboyut];
        for (int i = 0; i< diziboyut; i++){
            System.out.println(i+1 + ". elemanı giriniz : ");
            int eleman = sc.nextInt();
            list[i] = eleman;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
