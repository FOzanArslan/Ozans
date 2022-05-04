import java.util.Scanner;

public class PalindromikKelime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
        String uWord = sc.nextLine();
        String nWord = "";
        for (int i = 0, b = uWord.length()-1; i< uWord.length(); i++,b--){

            if (uWord.charAt(i) == uWord.charAt(b)){
                nWord += uWord.charAt(i);
            }

        }
        if (nWord .equals(uWord)) System.out.println("Palindromik sayıdır. ");
        else System.out.println("Palindromik sayı değildir.");


    }

    }
}
