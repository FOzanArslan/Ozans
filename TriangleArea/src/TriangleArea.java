import java.util.Scanner;
import java.lang.Math;
public class TriangleArea {

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of edge 1: ");
            int edg1 = sc.nextInt();
            System.out.print("Enter the length of edge 2: ");
            int edg2 = sc.nextInt();
            System.out.print("Enter the length of edge 3: ");
            int edg3 = sc.nextInt();

            int cevreUcgen = edg1+edg3+edg2;
            double u = cevreUcgen/2;

            double alankare = u* (u-edg1)* (u-edg2)* (u-edg3);
            System.out.print("Area of this triangle: "+Math.sqrt(alankare));


        }
}

