import java.time.Year;
import java.util.Scanner;

public class ArtikYil {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Yılı giriniz: ");
        int year = sc.nextInt();
        int yüzKalan = year % 100;
        int dYüzKalan = year % 400;
        int dörtKalan = year % 4;
        if (yüzKalan == 0 && dYüzKalan == 0) {
            System.out.println(year + " bir artık yıldır.");
        } else if (dörtKalan == 0 && !(yüzKalan==0) ) {
            System.out.println(year + " bir artık yıldır.");
        }else {
            System.out.println(year + " bir artık yıl değildir.");
        }

    }
}

