package j10_배열;

import java.util.Random;

public class Array3_copy1 {
    public static int foundMinNumber(int[]numbers){
        int min = numbers[0];


        for(int i = 0; i < numbers.length; i++) {

            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;

    }
    public static int foundMaxNumber(int[]numbers){
        int max = numbers[0];


        for(int i = 0; i < numbers.length; i++) {

            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;

    }

public static void main(String[] args) {
Random random = new Random();
int total = 0;
int[] randomArray = new int[10];

/*배열에 랜덤한 값 대입*/

for (int i = 0; i < randomArray.length; i++) {
   while (true) { /**/

       int randomNumber = random.nextInt(10) + 1;
       int count = 0;

       for (int j = 0; j < randomArray.length; j++) { /**/
           if (randomArray[j] == randomNumber){
               count++;
               break;
           }
       }
       if (count == 0){
           randomArray[i] = randomNumber;
           break; /*while 의 break*/
           }
   }

}

/*배열에서 값을 하나씩 꺼내어 total 에 더한다.
 배열의 값을 하나씩 꺼내어 출력한다.( 단 마지막 쉼표를 찍지 않는다.*/
for (int i = 0; i < randomArray.length; i++) {
   total += randomArray[i];

   System.out.print(randomArray[i]);

   if(i != randomArray.length-1){
       System.out.print(", ");
}

}
System.out.println();
System.out.println("총합 : " + total);

    System.out.println("최소값: "+foundMinNumber(randomArray));
    System.out.println("최대값: "+foundMaxNumber(randomArray));

}
}
