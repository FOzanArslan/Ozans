import java.util.Scanner;
public class GroceryCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.00;

        System.out.print("Armut kaç kilo? : ");
        int uArmut = sc.nextInt();
        System.out.print("Elma kaç kilo? : ");
        int uElma = sc.nextInt();
        System.out.print("Domates kaç kilo? : ");
        int uDomates = sc.nextInt();
        System.out.print("Muz kaç kilo? : ");
        int uMuz = sc.nextInt();
        System.out.print("Patlıcan kaç kilo? : ");
        int uPatlıcan = sc.nextInt();

        double sum = (uArmut*armut)+(uElma*elma)+(uDomates*domates)+(uPatlıcan*patlıcan)+(uMuz*muz);
        System.out.printf("Toplam Tutar : "+ sum);
    }
}
