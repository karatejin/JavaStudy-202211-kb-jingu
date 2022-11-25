package j14_스태틱.빌더;

public class StudentMain {
    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(20220001)
                .name("양진구")
                .address("김해시 삼계로223")
                .build();
        System.out.println(student);

        Student.StudentBuilder sb = new Student.StudentBuilder(); /*StudentBuilder 의 생성*/
    }
}
