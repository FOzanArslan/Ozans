import java.util.Scanner;

public class Divider {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value");
        int userEntry = sc.nextInt();
        for (int i=1; i<userEntry; i++ ){
            int three = i%3;
            int four = i%4;
            if (three==0 && four == 0){
                System.out.println(i);
            }

        }
    }
}
