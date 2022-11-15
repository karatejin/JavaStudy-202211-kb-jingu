package j01_출력;

public class UserInfo {

    public static void main(String[] args) {

        String name = "양진구"; /*변수의 선언과 동시에 초기화*/
        String address = "부산 동래구 사직동";
        String phone = "010-9988-1916"; /* 0을 표현할 수 없기 때문에  String 문자열로 표현해라*/
        int age = 34; /* 음수 양수 가능하지롱 */

        System.out.println(name+"의 주소는 " + address + " 입니다.");
        System.out.println(name+"의 연락처는 " + phone + " 입니다.");
        System.out.println(name+"의 나이는 " + age + " 살입니다.");
        
    } // end of main
} // end of class
