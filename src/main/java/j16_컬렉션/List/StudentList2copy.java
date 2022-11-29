package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList2copy {
    public static void main(String[] args) {
        List<Hobby> hl = Arrays.asList (new Hobby[] {
                new Hobby(1,"축구"),
                new Hobby(2,"농구"),
                new Hobby(3,"골프"),
                new Hobby(4,"음악감상")});

        Student s1 = Student.builder()
                .studentId(20220001)
                .name("고동현")
                .age(21)
                .hobbyList(Arrays.asList(new Hobby[]{hl.get(0),hl.get(2)}))
                .build();

        Student s2 = Student.builder()
                .studentId(20220002)
                .name("강동욱")
                .age(22)
                .hobbyList(Arrays.asList(new Hobby[]{hl.get(1),hl.get(3)}))
                .build();

        Student s3 = Student.builder()
                .studentId(20220003)
                .name("정진호")
                .age(23)
                .hobbyList(Arrays.asList(new Hobby[]{hl.get(0),hl.get(3)}))
                .build();


        System.out.println(s1);

        List<Student> sl = new ArrayList<Student>(); /*인터페이스로 구현된 implements 클래스*/
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        for(Student s : sl) {
            System.out.println("<학생정보>");
            System.out.println(s);
            System.out.println("<"+s.getName() + "학생취미>");
            for(Hobby h:s.getHobbyList()){ /*Studednt 클래스에 있는 private List<Hobby> hobbyList; 배열을 List 로 바꾸기 */
                System.out.println(h);
            }
            System.out.println();
        }
    }
}
