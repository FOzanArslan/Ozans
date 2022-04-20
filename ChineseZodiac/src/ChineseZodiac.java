import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your birth year: ");
        int uYear = sc.nextInt();
        int remainder = uYear % 12;

        if (remainder == 0) System.out.println("Chinese zodiac is Monkey");
        else if (remainder == 1) System.out.println("Chinese zodiac is Rouster");
        else if (remainder == 2) System.out.println("Chinese zodiac is Dog");
        else if (remainder == 3) System.out.println("Chinese zodiac is Pig");
        else if (remainder == 4) System.out.println("Chinese zodiac is Mic");
        else if (remainder == 5) System.out.println("Chinese zodiac is Cow");
        else if (remainder == 6) System.out.println("Chinese zodiac is Tiger");
        else if (remainder == 7) System.out.println("Chinese zodiac is Rabbit");
        else if (remainder == 8) System.out.println("Chinese zodiac is Dragon");
        else if (remainder == 9) System.out.println("Chinese zodiac is Snake");
        else if (remainder == 10) System.out.println("Chinese zodiac is Horse");
        else if (remainder == 11) System.out.println("Chinese zodiac is Sheep");

    }
}
