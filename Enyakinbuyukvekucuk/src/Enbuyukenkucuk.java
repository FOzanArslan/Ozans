import java.util.Arrays;
public class Enbuyukenkucuk {
    public static void main(String[] args){
        int list[] = {16, 38, 9, 3, 19, 25 , 23, 5, 6};
        Arrays.sort(list);
        int userChoice = 33;
        int a = 0;
        for (int i: list){
            if(i< userChoice){
                a++;
            }

        }
        System.out.println("En küçük yakın = " + list[a-1]);
        System.out.println("En büyük yakın = " + list[a]);

    }


}
