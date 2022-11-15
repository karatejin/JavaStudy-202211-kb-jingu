package j02_변수;

/**
 * 클래스 주석
 */
public class Variavle {

    /**
     * 
     * 메소드에 대한 설명 explain about method
     */
    
    public static void main(String[] args) {
        boolean checkFlag = false;
        System.out.println("논리자료형 : " + checkFlag);
        checkFlag = true;
        System.out.println("논리자료형 : " +checkFlag);
        
        char name1 = '김'; /*캐릭터 자료형 작은 따옴표, 한글자만 가능*/
        char name2 = '준';
        System.out.println("" + name1 + name2); /* "" 없이 하면 유니코드(10진수)가 나온다  캐릭터 자료형은 + 하면 숫자 연산이 된다.*/
        System.out.println(name1); /* 글자 나온다*/
        System.out.println(Integer.toHexString(name1)); /*16진수*/
        System.out.println("\uae40");

        int width = 100;
        int width2 = 200;

        System.out.println(width+width2);
        String sWidth = "100";
        String sWidth2 = "200";

        System.out.println(sWidth+sWidth2); /*문자열 덧셈 연산 물가*/

        double dNum = 2.1;
        double dNum2 = 3.5;
        System.out.println(dNum+dNum2); /*더블 연산 가능*/

        System.out.println("<<<< 형변환 >>>>");
        // 업캐스팅
        // 문자 -> 정수 -> 실수
        char c1 ='a';
        System.out.println(c1);
        System.out.println(((int)c1) + 10); /*정수로 바꾼다 , 연산 가능*/
        int n1 = (int) c1;
        System.out.println(n1);
        double d1 = (double) n1; /*회색 처리는 생략이 가능하다 , 묵시적 형변환*/
        System.out.println(d1); /*실수로 변환*/

        System.out.println("<<<<<>>>>>>");
        // 다운캐스팅
        // 실수 - 정수 ->문자
        int n2 = (int) d1;
        System.out.println(n2); /*실수*/

        char c2 = (char) n2; /*명시적 형 변환*/
        System.out.println(c2);
    }
}
