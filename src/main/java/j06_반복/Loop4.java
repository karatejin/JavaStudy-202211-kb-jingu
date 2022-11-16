package j06_반복;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String select = null;
       boolean loopFlag1 = true;
       boolean loopFlag2 = true;

        while(loopFlag1){
            System.out.println("[폴더 선택]");
            System.out.println("1. 문서");
            System.out.println("2. 음악");
            System.out.println("3. 사진");
            System.out.println("4. 동영상");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴선택 : ");
            select = sc.nextLine();

            if(select.equals("1")){ /*equals 문자열 비교*/ /*이런것이 뭐다? 콘솔 프로그램*/
                while (loopFlag2) {
                    System.out.println("[1. 문서]");
                    System.out.println("1.대학서류");
                    System.out.println("2.개인자료");
                    System.out.println("3.기업정보");
                    System.out.println("b.뒤로가기");
                    System.out.println("q. 프로그램 종료");
                    System.out.print("메뉴선택 : ");
                    select = sc.nextLine();

                    if(select.equals("1")){

                    }else if(select.equals("2")){

                    } else if (select.equals("3")) {

                    }else if (select.equals("b")) {
                        break;
                    } else if (select.equals("q")) {
                        System.out.println("정말 프로그램을 종료하시겠습니까(y/n)");
                        select =sc.nextLine();
                        if (select.equals("y")){
                            loopFlag1 = false; /*여기서 거짓을 설정하면*/
                            loopFlag2 = false; /* 상위로 가지 않고 바로 종료 빠잉 짜이찌엔*/
                        }
                    }else{
                        System.out.println("다시 입력하세요");
                    }
                }

            } else if (select.equals("2")) {

            } else if (select.equals("3")) {

            } else if (select.equals("4")) {

            } else if (select.equals("q")) {
                System.out.println("정말 프로그램을 종료 하시겠습니까?(y/n)");
                select = sc.nextLine();
                if(select.equals("y")){ /*y 눌르면*/
                    break; /*멈춤*/
                }
            }else{
                System.out.println("다시 입력하세요");
            }
        }
        /*while 문을 빠져 나가자*/
    }
}
