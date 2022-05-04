import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Random rnd = new Random();
    Scanner sc = new Scanner(System.in);
    int column;
    int row;

    public MineSweeper(int column, int row){
        this.column = column;
        this.row= row;

    }

    public int isWin(String[][] list){
        int wcount= 0;
        for (int a = 0; a< list.length; a++){
            for (int b= 0; b<list[a].length; b++){
                if (list[a][b].equals(" - ")){
                    wcount++;
                }
            }
        }
        return wcount;
    }

    public void MinePlaces() {

        System.out.println("Mayın tarlası");
        System.out.println("==============");
        int mineNumber = (column * row / 4);
        String[][] mineMap = new String[row][column];
        String[][] mineCopy = new String[row][column];
        for (int i = 0; i < mineNumber; i++) {

            int rndMineRow = rnd.nextInt(row);
            int rndMineColumn = rnd.nextInt(column);

            mineMap[rndMineRow][rndMineColumn] = " * ";


        }

        for (int a = 0; a < row; a++) {
            for (int b = 0; b < column; b++) {
                if (mineMap[a][b] == null) {
                    mineMap[a][b] = " - ";
                }
            }
        }
        for (int a = 0; a < row; a++) {
            for (int b = 0; b < column; b++) {
                if (mineCopy[a][b] == null) {
                    mineCopy[a][b] = " - ";
                }
            }
        }


        for (String[] row : mineMap) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

        System.out.println("==============");



        //play the game
        while (true){
            int uEnterRow;
            int uEnterColumn ;

            while (true){
            System.out.print("Satır giriniz  :  ");
             uEnterRow = sc.nextInt();
            System.out.print("Sütun giriniz  :  ");
             uEnterColumn= sc.nextInt();
            if(uEnterColumn<column && uEnterColumn>=0 && uEnterRow<row && uEnterRow>=0) break;
            else System.out.println("Harita içerisinde değerler giriniz! ");
            }




        if (mineMap[uEnterRow][uEnterColumn].equals(" * ")){
            System.out.println("Game Over") ;
            for (String[] row : mineMap) {
                for (String col : row) {
                    System.out.print(col);
                }
                System.out.println();
            }
            System.out.println("==============");
            break;
        }
        else if (mineMap[uEnterRow][uEnterColumn].equals(" - ")) {

            int areaMines = 0;
            //1
            if (uEnterRow < row - 1) {
                if (mineMap[uEnterRow + 1][uEnterColumn].equals(" * ")) {
                    areaMines++;
                }
            }
            //2
            if (uEnterRow > 0) {
                if (mineMap[uEnterRow - 1][uEnterColumn].equals(" * ")) {
                    areaMines++;
                }

            }
            //3
            if (uEnterColumn < column - 1) {
                if (mineMap[uEnterRow][uEnterColumn + 1].equals(" * ")) {
                    areaMines++;
                }

            }
            //4
            if (uEnterColumn > 0) {
                if (mineMap[uEnterRow][uEnterColumn - 1].equals(" * ")) {
                    areaMines++;
                }

            }
            //5
            if (uEnterColumn > 0 && uEnterRow > 0) {
                if (mineMap[uEnterRow - 1][uEnterColumn - 1].equals(" * ")) {
                    areaMines++;
                }

            }
            //6
            if (uEnterColumn < column - 1 && uEnterRow < row - 1) {
                if (mineMap[uEnterRow + 1][uEnterColumn + 1].equals(" * ")) {
                    areaMines++;
                }

            }
            //7
            if (uEnterColumn < column - 1 && uEnterRow > 0) {
                if (mineMap[uEnterRow - 1][uEnterColumn + 1].equals(" * ")) {
                    areaMines++;
                }

            }
            //8
            if (uEnterColumn > 0 && uEnterRow < row - 1) {
                if (mineMap[uEnterRow + 1][uEnterColumn - 1].equals(" * ")) {
                    areaMines++;
                }

            }

            mineCopy[uEnterRow][uEnterColumn] = " " + String.valueOf(areaMines) + " ";
            for (String[] row : mineCopy) {
                for (String col : row) {
                    System.out.print(col);
                }
                System.out.println();
            }

            if (isWin(mineCopy)== mineNumber) {
                System.out.println("You win the game!!!");
                break;
            }
            }
        }


    }

}
