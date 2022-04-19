import java.util.Scanner;
public class BurcBulma {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Doğdunuz ayı giriniz: ");
        int month = sc.nextInt();
        System.out.println("Doğdunuz günü giriniz");
        int day = sc.nextInt();

        int totalDay = ((month-1)*30)+ day;
        if (totalDay <= 21) System.out.println("Oğlak Burcu");
        if (totalDay >= 22 && totalDay<= 49) System.out.println("Kova Burcu");
        if (totalDay >= 50 && totalDay<= 80) System.out.println("Balık Burcu");
        if (totalDay >= 81 && totalDay<= 110) System.out.println("Koç Burcu");
        if (totalDay >= 111 && totalDay<= 141) System.out.println("Boğa Burcu");
        if (totalDay >= 142 && totalDay<= 172) System.out.println("İkizler Burcu");
        if (totalDay >= 173 && totalDay<= 203) System.out.println("Yengeç Burcu");
        if (totalDay >= 204 && totalDay<= 233) System.out.println("Aslan Burcu");
        if (totalDay >= 234 && totalDay<= 263) System.out.println("Başak Burcu");
        if (totalDay >= 264 && totalDay<= 293) System.out.println("Terazi Burcu");
        if (totalDay >= 294 && totalDay<= 322) System.out.println("Akrep Burcu");
        if (totalDay >= 323 && totalDay<= 352) System.out.println("Yay Burcu");
        if (totalDay >= 354 && totalDay<= 365) System.out.println("Oğlak Burcu");

    }
}
