import java.util.Scanner;

public class usdTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int uInput = sc.nextInt();
        int m,n;
        for (m= uInput-1; m>0; m--){
            for (n=1; n<=uInput-m;n++){
                System.out.print(" ");
            }
            for (n=1; n<=m*2- 1; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
