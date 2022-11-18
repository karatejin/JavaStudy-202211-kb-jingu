package j09_접근지정자.캡슐화;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 6; i++) { /*10개의 랜덤값*/
            System.out.println(random.nextInt(45)+1);
        }


    }
}
