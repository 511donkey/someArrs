import java.util.Arrays;

public class Arr11 {
    public static void main(String[] args) {
        int[] someArr = new int[11];

        int i = 0;
        for (i = 0; i < someArr.length ; i++) {
            someArr[i] = (int) (Math.random() * 3) -1;
        }

        System.out.println(Arrays.toString(someArr));

        int a = 0, b = 0, c = 0;
        for (i = 0; i < someArr.length; i++) {

            switch (someArr[i]) {
                case -1:
                    a++;
                    break;
                case 0:
                    b++;
                    break;
                case 1:
                    c++;
                    break;
            }
        }

        if (a > b && a > c){
            System.out.println("-1 больше всего");
        } else if (b > a && b > c){
            System.out.println("0 больше всего");
        } else if (c > a && c > b){
            System.out.println("1 больше всего");
        }else if(a == b && a==c){
            System.out.println("ничего");
        }else System.out.println("ничего");
    }
}
