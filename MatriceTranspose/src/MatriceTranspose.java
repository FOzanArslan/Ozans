import java.util.Arrays;

public class MatriceTranspose {

    public static void main(String[] args){
        int[][] matrix ={{3,5,6,7,8},
                         {4,2,46,7, 14}};
        int j = 0;
        int[][] tMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i< matrix.length ;i++){
            for (int b =0; b< matrix[i].length; b++){
                tMatrix[b][i] = matrix[i][b];
            }



        }


       for (int[] row: tMatrix){
           for(int col : row){
               System.out.print(col+ " ");
           }
           System.out.println();
       }
    }
}
