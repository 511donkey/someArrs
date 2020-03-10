import java.util.Arrays;

public class Arr85 {
    public static void main(String[] args) {

        int[][] someArr = new int[8][5];
        for (int i = 0; i < someArr.length ; i++) {
            for (int j = 0; j < someArr[i].length ; j++) {
             someArr[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
        System.out.println(Arrays.deepToString(someArr));
    }
}
