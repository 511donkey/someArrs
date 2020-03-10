import java.util.Arrays;

public class Decrease {
    public static void main(String[] args) {
        int[] someArr = new int[10];

        for (int i = 0; i < someArr.length ; i++) {
            someArr[i] = (i+1)*2;
        }
        System.out.println(Arrays.toString(someArr));

        for (int i = someArr.length - 1; i > 0 ; i--) {
            System.out.println(someArr[i] + " ");
        }
    }

}


