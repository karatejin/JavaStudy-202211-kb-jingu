package j14_스태틱.빌더;

public class UserMain { /* 내가 원하는 것만 추려서 출력, 순서도 상관 없다.*/
    public static void main(String[] args) {
        User user = User.builder(/*static method*/).username("jingu").password("1234").email("junsyang@naver.com").name("양진구").build();

        System.out.println(user);
    }
}
