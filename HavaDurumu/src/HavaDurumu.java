import java.util.Scanner;
public class HavaDurumu {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        int heat = sc.nextInt();

        if (heat<5){
            System.out.println("Kayak yapabilirsin.");
        } else if (heat>=5 && heat<=15) {
            System.out.println("Sinemaya gidebilirsin");
        } else if (heat>15 && heat<=25) {
            System.out.println("Piknik yapabilirsin");
        }else{
            System.out.println("Yüzebilirsin");
        }

    }
}
