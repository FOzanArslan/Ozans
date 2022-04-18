import java.util.Scanner;

public class BodyMassIndexCalc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height (in meters): ");
        double height = sc.nextDouble();

        double bMIndex = weight /(height*height);
        System.out.printf("Your body mass index is : "+ bMIndex);

    }
}
