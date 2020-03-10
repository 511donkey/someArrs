import java.util.Arrays;

public class Arr4 {
    public static void main(String[] args) {
        int[] someArr = new int [4];

        for (int i = 0; i < someArr.length ; i++) {
            someArr[i] = (int)(Math.random() * 90) + 10;
        }

        System.out.println(Arrays.toString(someArr));

        boolean a = true;
        for (int i = 0; i < someArr.length ; i++) {
            if(someArr[i+1] <= someArr[i]){
                a = false;
                break;
            }
        }
        if(a) {
            System.out.println("Массив является " +
                    "строго возрастающей последовательностью");
        }
        else {
            System.out.println("Массив не является" +
                    "строго возрастающей последовательностью");
        }
    }
}
