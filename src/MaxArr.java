import javax.swing.*;
import java.util.Arrays;

public class MaxArr {
    public static void main(String[] args) {
        int[][] someArr = new int[7][4];
        int[] someArr1 = new int[someArr.length];

        for (int i = 0; i < someArr.length; i++) {
            for (int j = 0; j < someArr[i].length ; j++) {
            someArr[i][j] = (int) (Math.random() *11) - 5;
            }
        }
        System.out.println(Arrays.deepToString(someArr));

        int k = 0;
        for (int i = 0; i < someArr.length ; i++) {
            for (int j = 0; j < someArr[i].length ; j++) {
                for (k = 0; k < someArr[i][j]; k++) {

                someArr[i][j] *= someArr[i][j];
                k = Math.abs(someArr[i][j]);
                }
            }
            System.out.print(k);
        }


    }
}
