package j10_배열;

import java.util.Random;

         /*
        random.Array 배열을 생성(10개)
        10, 2, 4, 5 ,3, 7, 1

        총합: ??
         */

public class Array3 {
    public static void main(String[] args) {
        Random random = new Random();
        int add = 0;
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(10)+1;
            System.out.print((numbers[i]+ ", "));
            if(i+1 == numbers.length) System.out.println(numbers[i]);
            add += numbers[i];
        }
        System.out.println("총합: " + (add));


    }
}
