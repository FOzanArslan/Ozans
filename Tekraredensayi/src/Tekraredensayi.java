import java.util.Arrays;

public class Tekraredensayi {

    static boolean isfind(int [] arr,int value){

        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }





    public static void main(String[] args){
        int[] list = {1, 3, 4, 5, 7, 3 , 4 , 7, 19 , 34, 26, 34};
        int[] duplicate = new int[list.length];
        int startindex =0;
        for (int i = 0; i< list.length; i++){
            for (int b= 0; b< list.length; b++){
                if (b!=i && list[b] == list[i]){
                    if(list[b]%2 == 0){
                        if (!isfind(duplicate, list[b]))
                         duplicate[startindex++]= list[b];
                    }
                }
            }
        }
        for (int value : duplicate){
            if (value!= 0){
                System.out.println(value);
            }
        }


    }
}
