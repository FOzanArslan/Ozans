import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImprovedCalc {

    public static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number will be entered? ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i= 1; i<=num; i++){
            System.out.println(i + " Number= ");
            int userInput = sc.nextInt();
             sum += userInput;
        }
        System.out.println("The sum is : "+ sum);
        return sum;
    }
    public static int minus(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number will be entered? ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i= 1; i<=num; i++){
            System.out.println(i + " Number= ");
            int userInput = sc.nextInt();
            if (i == 1) sum += userInput;
            else  sum-= userInput;
        }
        System.out.println("The minus is : "+ sum);
        return sum;
    }
    public static int times(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number will be entered? ");
        int num = sc.nextInt();
        int sum = 1;
        for (int i= 1; i<=num; i++){
            System.out.println(i + " Number= ");
            int userInput = sc.nextInt();
              sum*= userInput;
        }
        System.out.println("The multiply is : "+ sum);
        return sum;
    }
    public static int divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number will be entered? ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i= 1; i<=num; i++){
            System.out.println(i + " Number= ");
            int userInput = sc.nextInt();
           if(i == 1) sum+= userInput;
           else sum/=userInput;
        }
        System.out.println("The divide is : "+ sum);
        return sum;
    }
    public static double exponential(int a, int b){
        double exp = Math.pow(a,b);
        System.out.println("The exponential is : "+ exp);
        return exp;
    }
    public static double factorial(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 1;
        for (int i = num; i>0; i--){
            sum *= i;
        }
        System.out.println("The factorial is :"+sum);
        return sum;

    }
    public static double mode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        int finale = num1%num2;
        System.out.println("the mode is: " +finale);
        return finale;
    }
    public static void rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        int area = num1*num2;
        int radius = (num1+num2)*2;
        System.out.println("area : "+area);
        System.out.println("radius : "+radius);
    }
    public static void main(String[] args){
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("1- Toplama işlemi");
            System.out.println("2- Çıkarma işlemi");
            System.out.println("3- Çarpma işlemi");
            System.out.println("4- Bölme işlemi");
            System.out.println("5- Üs işlemi");
            System.out.println("6- faktöriyel işlemi");
            System.out.println("7- Mod işlemi");
            System.out.println("8- Çevre ve alan işlemi");
            System.out.println("9- Exit");
            System.out.println("Yapmak istediğiniz işlemi giriniz: ");
            int uChoice = sc.nextInt();
            switch (uChoice){
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    exponential(a,b);
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                case 9:
                    System.exit(0);

            }
        }
    }

}
