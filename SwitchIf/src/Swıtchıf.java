import java.util.Scanner;
public class Swıtchıf {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1,n2,select;

        System.out.println("Enter the number one: ");
        n1 = sc.nextInt();

        System.out.println("Enter the number two: ");
        n2 = sc.nextInt();

        System.out.println("1-Toplama \n 2-Çıkarma\n 3-Çarpma \n 4-Bölme");
        System.out.println("Your selection");
        select = sc.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam= "+(n1+n2));
                break;
            case 2:
                System.out.println("Fark= "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpım= "+(n1*n2));
                break;
            case 4:
                System.out.println("Bölüm= "+(n1/n2));
                break;
        }
    }
}
