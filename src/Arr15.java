import java.util.Arrays;

public class Arr15 {
    public static void main(String[] args) {
        int[] someArr = new int[15];

        for (int i = 0; i < someArr.length; i++) {
            someArr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(someArr));
        int a= 0, b = 0;
        for (int i = 0; i <someArr.length; i++) {
            if(someArr[i] % 2 == 0){
                a++;
            }
        }
        System.out.println("Количество четных элементов массива " + a);
    }
}
