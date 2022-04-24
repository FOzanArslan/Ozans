import java.util.List;
import java.util.Scanner;

public class Maxmincalc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç sayı girmek istersiniz? ");
        int nCount = sc.nextInt();
        int nBuyuk = 0, nKucuk=0;
        int userInput = 0;
        for (int i= 0; i<nCount; i++){
            System.out.println("Sayı giriniz: ");
             userInput = sc.nextInt();

             if (userInput>nBuyuk){
                 if (nKucuk == 0) {
                     nKucuk = userInput;
                 }
                 nBuyuk=userInput;

             }
            if (userInput<nKucuk){

                if (nBuyuk == 0) {
                     nBuyuk= userInput;
                }
                nKucuk=userInput;
            }


        }
        System.out.println("En büyük: "+nBuyuk);
        System.out.println("En küçük: "+nKucuk);


    }
}
