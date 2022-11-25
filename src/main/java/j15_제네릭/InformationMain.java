package j15_제네릭;

public class InformationMain {
    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(20220001)
                .name("박준현")
                .build();
        Teacher teacher = Teacher.builder()
                .teacherCode(200)
                .name("김준일")
                .build();

        Information<Student> studentInformation /*<Student> 없다면 클래스를 더 만들어야 한다.*/
                = new Information<Student>(student); /*<Student>넣으면 T자리에 <Student>간 들어간다.*/

        Information<Teacher> teacherInformation
                = new Information<Teacher>(teacher);
        Information2 i1 = new Information2(student);
        Information2 i2 = new Information2(teacher);

        studentInformation.printInfo();
        teacherInformation.printInfo();

        System.out.println("학생이름: " +  studentInformation.getTarget().getName()); /*getTarget() = student*/
        System.out.println("학생이름2: " +  ((Student)i1.getTarget()).getName()); /*Student로 다운캐스팅 해줘야 됨 Object 니까*/
    }
}
