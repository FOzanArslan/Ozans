import java.util.Scanner;

public class Individual extends Account{

    @Override
    public void addPolicy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which insurance do you want?");
        System.out.println("1- Car insurance \n 2- Health insurance \n 3- ResidenceInsurance 4-Travel insurance");
        int userInt =sc.nextInt();
        if (userInt==1){
            

        }

    }
}
