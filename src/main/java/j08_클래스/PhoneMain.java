package j08_클래스;

public class PhoneMain {

    public static void main(String[] args) {
        Phone iPhone14 = new Phone();  /* 자료형 */  /* iPhone = 변수명*/ /*생성자는 오버로딩이 하나라로 되면 비활성화*/
        Phone galaxyS22 = new Phone("SAMSUNG","GalaxyS22"); /*new = 메모리 할당받자*/ /* 이값은 phone 의 자료값*/
        System.out.println(iPhone14);       /*주소*/
        System.out.println(galaxyS22);      /*주소*/

        iPhone14.company = "Apple"; /*여기에 애플*/


        iPhone14.printPhoneCompany();
        iPhone14.printPhoneModel();

        galaxyS22.printPhoneCompany();
        galaxyS22.printPhoneModel();
    }
}
/*
 Class: Stundent, StudentMain
 학생정보
    String school(학교명)
    String name(학생이름)
    int studentYear(학년)
    boolean gender (성별 true = 남, false = 여)

    showStudentInfo(){
    학교명: 부산대학교
    이름 : 홍길동
    학년 : 3
    성별 : 남
    }
*/
