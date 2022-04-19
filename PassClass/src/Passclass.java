import java.util.Scanner;
public class Passclass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int cClass = 4;

        System.out.print("Matematik notunuz");
        int gradeMath = sc.nextInt();
        if (gradeMath>100 || gradeMath<0){
            gradeMath = 0;
            cClass--; }


        System.out.print("Fizik notunuz");
        int gradeFizik = sc.nextInt();
        if (gradeFizik>100 || gradeFizik<0){
            gradeFizik = 0;
            cClass--;

        }

        System.out.print("Müzik notunuz");
        int gradeMüzik = sc.nextInt();
        if (gradeMüzik>100 || gradeMüzik<0){
            cClass--;
            gradeMüzik = 0; }

        System.out.print("Kimya notunuz");
        int gradeKimya = sc.nextInt();
        if (gradeKimya>100 || gradeKimya<0){
            cClass--;
            gradeKimya = 0;}

        double avg = (gradeFizik+gradeKimya+gradeMath+gradeMüzik)/cClass;

        if (avg<= 55){
            System.out.print("Sınıfta kaldınız. ");
            System.out.print("Ortalamanız "+ avg);
        }else{
            System.out.print("Sınıfı geçtiniz");
            System.out.print("Ortalamanız "+ avg);
        }
 ;
    }
}
