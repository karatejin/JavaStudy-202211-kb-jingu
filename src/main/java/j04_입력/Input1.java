package j04_입력;

import java.util.Scanner;

public class Input1 {

    public static void main(String[] args) {
        String name = null;
        int age = 0;
        String phone = null;
        String address = null;

        Scanner scanner = new Scanner(System.in); /*Scanner 참조 자료형  scanner 변수명   */

        /* 입력 중 nextLine()은 엔터를 기준으로 다음줄로 날리기 때문*/
        /* nextInt()메소드를 실행 할 때 입력값을 콘솔에 입력하고 엔터를 누를때 입력값을 리턴시켰지만 Enter값은 그대로 남아있다.
        nextLine() 메소드는 Enter값을 기준으로 메소드를 종료시키기
        때문에 nextLine()메소드가 실행될 때 남아있는 Enter값을 그대로 읽어 바로 종료된 것이다.*/

        name = scanner.nextLine(); /*한줄 한줄이 입력 받는다.*/ /*nextLine 띄어쓰기 엔터 허용한다. next는 그런거 없다.*/
        age = scanner.nextInt();
        scanner.nextLine(); // 허공에 하나 날린다.
        phone = scanner.nextLine();
        address = scanner.nextLine();


        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + phone);
        System.out.println("주소: " +address);
    }

}
