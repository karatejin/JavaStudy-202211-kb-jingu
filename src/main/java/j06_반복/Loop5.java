package j06_반복;

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        /*
        1. 덧셈
        2. 뺼셈
        3. 곱셉
        4. 나눗셈
        5. 나머지
        q. 프로그램 종료
        (나머지 다른 입력은 " 잘못된 입력 ! 다시 입력하세요.")
        */
        Scanner sc = new Scanner(System.in);
        String select = null;
        while (true) {

            System.out.println("1. 덧셈");
            System.out.println("2. 뺄셈");
            System.out.println("3. 곱셈");
            System.out.println("4. 나눗셈");
            System.out.println("5. 나머지");
            System.out.println("q.  프로그램 종료");
            System.out.print("메뉴선택 : ");
            select = sc.nextLine();

            if(select.equals("1")){
                System.out.println(a + "+" + b + "="  + (a+b) );
            } else if (select.equals("2")) {
                System.out.println(a + "-" + b + "="  + (a-b) );
            } else if (select.equals("3")) {
                System.out.println(a + "x" + b + "="  + (a*b) );
            } else if (select.equals("4")) {
                System.out.println(a + "/" + b + "="  + (a/b) );
            } else if (select.equals("5")) {
                System.out.println(a + "%" + b + "="  + (a%b) );
            }else if (select.equals("q")){
                System.out.println("정말 프로그램을 종료하시겠습니까 (y/n)");
                select = sc.nextLine();
                if(select.equals("y")){
                    break;
                }
            }else{
                System.out.println("잘못된 입력! 다시 입력하세요");
            }
        }
    }
}