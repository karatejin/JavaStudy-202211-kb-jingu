package j03_연산자;

public class LeapMonth {

    public static void main(String[] args) {

        int year =2000;

        String result = null;

        result = year % 4 ==0 && year % 100 != 0 || year % 400 == 0 ? "윤달입니다." : "윤달이 아닙니다.";

        System.out.println(year + ": " + result);

        /* 삼항연산자
        윤달의 조건
        4의 배수이고(and, &&) 100의 배수는 아니거나(!= 부정 || 이거나) 400의 배수(나누어 떨어진다)여야 윤달이다.
        
        2000 : 윤달입니다.
        1999 : 윤달이 아닙니다.
        */


    }
}
