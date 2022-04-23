import java.util.Scanner;

public class katbulma {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int userEntry = sc.nextInt();
        System.out.println("Dördün katları");
        for (int i=1; i<userEntry; i*=4 ){

            System.out.println(i);

        }
        System.out.println("Beşin katları");
        for (int i=1; i<userEntry; i*=5){
            System.out.println(i);
        }

    }
}
