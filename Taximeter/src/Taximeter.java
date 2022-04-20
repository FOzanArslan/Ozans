import java.util.Scanner;
public class Taximeter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.println("Gideceğiniz km yi giriniz: ");
        int uKm = sc.nextInt();

        double uCost = uKm * 0.10;
        System.out.println("Yaşınızı giriniz: ");
        int uAge = sc.nextInt();

        System.out.println("Yolculuk tipini giriniz (Gidiş- 1 , Gidiş-Dönüş- 2): ");
        int gidisTipi = sc.nextInt();

        if (!(gidisTipi==1) && !(gidisTipi == 2)){
            System.out.println("Hatalı veri girdiniz");
        }
        if (uKm<0 || uAge<0) System.out.println("Hatalı Veri Girdiniz");

        if (uAge<12){
            double uNCost = uCost -(uCost/2);
            if (gidisTipi == 2){
                double utCost = uNCost - (uNCost/5);
                System.out.println(utCost);
                System.exit(0);
            }
            System.out.println(uNCost);
        }
        else if (uAge>= 12 && uAge <= 24){
            double uNCost = uCost - (uCost/10);

            if (gidisTipi == 2){
                double uTCost = uNCost - (uNCost/5);
                System.out.println(uTCost);
                System.exit(0);
            }
            System.out.println(uNCost);
        }else if (uAge> 65){
            double uNCost = uCost - ((uCost*3)/10);

            if (gidisTipi == 2){
                double utCost = uNCost - (uNCost/5);
                System.out.println(utCost);
                System.exit(0);
            }
            System.out.println(uNCost);
        }else {
            System.out.println(uCost);
            if (gidisTipi == 2){
                double uNCost = uCost - (uCost/5);
                System.out.println(uNCost);
            }
        }

    }
}
