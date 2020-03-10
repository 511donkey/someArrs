import java.util.Arrays;

public class Arr67 {
    public static void main(String[] args) {
        int[][] someArr = new int[6][7];

        //заполняем массив случайными числами из отрезка [0,9]
        for (int i = 0; i <someArr.length; i++) {
            for (int j = 0; j < someArr[i].length ; j++) {
                someArr[i][j] = (int) (Math.random()*10);
            }
        }
        System.out.println(Arrays.deepToString(someArr));

        int b = 1, a = 1, t = 1;
        for (int i = 0; i < someArr.length ; i++) {
            for ( a = 1; a < someArr[i].length ; a++) {
                for (b = someArr[i].length - 1; b >= a ; b--) {
                    if(someArr[i][b-1] < someArr[i][b]){

                        t = someArr[i][b-1];
                        someArr[i][b-1] = someArr[i][b];
                        someArr[i][b] = t;
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(someArr));
    }
}
