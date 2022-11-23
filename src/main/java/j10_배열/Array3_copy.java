package j10_배열;

import java.util.Random;
         /*
        random.Array 배열을 생성(10개)
        10, 2, 4, 5 ,3, 7, 1

        총합: ??
         */
public class Array3_copy {

    public static void main(String[] args) {
        Random random = new Random();
        int total = 0;
        int[] randomArray = new int[10];

        /*배열에 랜덤한 값 대입*/

        for (int i = 0; i < randomArray.length; i++) { /*배열 길이만큼 반복*/
            while (true) { /*무한반복*/

                int randomNumber = random.nextInt(10) + 1; /*랜덤숫자 생성*/
                int count = 0; /*배열 대입 여부 boolean 생성*/

                for (int j = 0; j < randomArray.length; j++) { /*배열 요소 전부 검수*/
                    if (randomArray[j] == randomNumber){ /*배열요소에 랜덤 숫자와 동일한 요소가 있을경우*/
                        count++; /*배열에 대입되지 않고*/
                        System.out.println("중복 인덱스 : " + i + "/중복 숫자 : " + randomArray[i]);
                        break;
                    }
                }
                /*found == ture*/
                if (count == 0){
                    randomArray[i] = randomNumber; /*i 번째 배열에 랜덤숫자가 대입됨*/
                    System.out.println(randomArray[i] + " - 대입성공");
                    break; /*while문 탈출 -->  for문 반복*/
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
    }
}
