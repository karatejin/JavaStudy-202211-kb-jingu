package j14_스태틱.싱글톤;

import lombok.Getter;

import java.util.Scanner;

public class ScannerSingleton {
    /*2. 자기 자신을 static 변수로 가지고 있어야한다.*/
    private static ScannerSingleton instance = null;


    @Getter /*Scanner에만 Getter 주고싶으면 여기에 쓴다. 잠온다.*/
    private Scanner scanner;

    /*1.생성자가 private 접근지정자여야 한다.*/
    private ScannerSingleton() { /* private 외부접근 불가. */
        scanner = new Scanner(System.in);

    }

    public static ScannerSingleton getInstance() {
        if (instance == null) { /*결과적으로 한번만 만든다.*/ /* null 이 아니면 객체 생성 안할 거야.*/
            instance = new ScannerSingleton(); /*여기서 생성*/
        }
        return instance;
    }
    /*instance 변수는 ScannerSingleton의 주소값*/
}
