import java.util.Scanner;

public class Stars {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = sc.nextInt();

        int m,n;

        for (m=1; m<= userInput; m++){
            for (n=1; n<= userInput- m; n++){
                System.out.print(" ");
            }
            for (n=1; n<= m*2-1; n++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (m= userInput-1; m>0; m--){
            for (n=1; n<=userInput-m;n++){
                System.out.print(" ");
            }
            for (n=1; n<=m*2- 1; n++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
