package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor /*빌더 안쓰고 만든것*/
public class Student {
    private int studentCode;
    private String name;
    private String address;

    public static StudentBuilder builder(){ /*스테틱으로 했으면 다른것도 스테틱*/
        return new StudentBuilder();  /*객체 주소 생김. Student 아니고 StudentBuilder*/
    }

    /*public class StudenmtBuilder라면 return new Student().new StudentBuilder();= 이렇게 해야하는데 메모리 낭비. 빠잉 안써 */

    public static class StudentBuilder{ /* 내부 클래스 InnerClass */
        private int studentCode; /*내부클래스는 바깥 클래스와 같이 세팅*/
        private String name;
        private String address;

        public StudentBuilder studentCode(int studentCode){ /*변수명과 메서드 일치하게 매개변수까지 일치*/
            this.studentCode = studentCode;
            return this; /*자기 자신의 주소를 리턴 */
        }
        public StudentBuilder name(String name){ /*변수명과 메서드 일치하게 매개변수까지 일치*/
            this.name = name;
            return this; /*자기 자신의 주소를 리턴 */
        }
        public StudentBuilder address(String address){ /*변수명과 메서드 일치하게 매개변수까지 일치*/
            this.address = address;
            return this; /*자기 자신의 주소를 리턴 */
        }
        public Student build(){
            return new Student(studentCode, name, address);/*빌더 안에 있는것*/
        }
    }
}
