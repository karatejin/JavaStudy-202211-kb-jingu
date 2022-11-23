package j13_Object;

public class StringTest { /*모든 클래스는 오브젝트 클래스를 상속 받는다*/
    public static void main(String[] args) {
        String str = "A";
        String str2 = "A";
        String str3 = new String("A");

        System.out.println(str == str2); /*true*/

        System.out.println(str.equals(str2)); /*true*/

        System.out.println(str); /*값이 나옴*/
        System.out.println(str2); /*true*/
        System.out.println(str3);
        System.out.println(str==str3); /*이미 어딘가에 "A" 라는게  str 에 할당 받고 str2 에도 받았고 new 는 주소 할당을 받고 str3 에 갔기 때문*/

        System.out.println(str.toString()); /*오브젝트 클래스 안에 있는 toString메소드*/

    }
}
