import java.util.Arrays;

public class FrekansArray {
    public static void main(String[] args){
        int[] list = {1,4,5,6,7,4,4,5,7};
        Arrays.sort(list);
        int tekrar = 1;
        int a = 0;

        for (int i=0 ;i< list.length; i++){
            tekrar = 1;
            for (int b = 0; b< list.length; b++){
                if (b!=i && list[b] == list[i]){
                    tekrar++;


                }
            }
            if (tekrar >1 && a != list[i])
            System.out.println(list[i]+ " bu kadar tekrar edildi : "+tekrar );
            a = list[i];

        }


    }
}
