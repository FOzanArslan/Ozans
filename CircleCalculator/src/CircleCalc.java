import java.util.Scanner;
public class CircleCalc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius 'r' of circle: ");
        int r = sc.nextInt();
        System.out.print("Enter the angle: ");
        int angle = sc.nextInt();
        double piValue = 3.14;

        double area =(piValue*(r*r)*angle)/360;
        System.out.print("The area is: "+ area);

    }
}
