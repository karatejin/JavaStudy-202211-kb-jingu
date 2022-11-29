package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();     /*업캐스팅*/

        Student student = new Student(2022001, "김준일", 2,null);
        students.add(student);

        /*변수에 안 담고 바로도 가능*/
        students.add(new Student(2022002, "이승아", 21,null));
        students.add(new Student(2022003, "김수현", 22,null));
        students.add(new Student(2022004, "문경원", 23,null));
        students.add(new Student(2022005, "홍지혜", 24,null));
        students.add(new Student(2022006, "고동현", 25,null));

        Student student2 = students.get(4);

        System.out.println(student2);

        /*이름이 문경원인 학생의 나이를 26세로 바꾸기*/

        for (Student st : students) {
            if (st.getName().equals("문경원")) {
                st.setAge(26);
                break;
            }
        }
        student2 = students.get(3);
        System.out.println(student2);

        //////////////////////////////////////////////////////

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getName().equals("문경원")) {
                s.setAge(28);
                break;
            }
        }

        System.out.println(students.get(3));


        // 0번 인덱스 학생의 이름을 다음 인덱스의 학생 이름으로 변경
        // 제일 마지막 인덱스의 학생 이름으로 0번 인덱스로 이동

        String lastName = null;
        for(int i = 0; i< students.size(); i++) {    // size 6. i가 5일때까지
            int nowIndex = students.size()-1 -i; // 인덱스 순서 5,4,3,2,1,0
            int perIndex = nowIndex -1;  // 현재요소의 앞  (인덱스가 5면 4)
            Student s = students.get(nowIndex);  // 인덱스의 요소를 뒤에서부터 가져옴

            if(nowIndex == 0) {  // 인덱스가 0일때
                s.setName(lastName); // lastName으로 수정
                break;   // 반복문 탈출

               /*
               break;를 걸어주지 않으면
               인덱스0 --> 에 인덱스 -1의 이름을 넣어주려하기때문에
               오류 발생
                */
            }
            if(nowIndex == students.size() - 1) {    // 마지막인덱스일때(5) lastName값 넣기 (제일 처음 실행되고 그 뒤로는 실행 안됨)
                lastName = s.getName();
            }
            s.setName(students.get(perIndex).getName());
           /*
           인덱스 5 --> 인덱스4 이름 넣기
           인덱스 4 --> 인덱스3 이름 넣기
           인덱스 3 --> 인덱스2 이름 넣기
           인덱스 2 --> 인덱스1 이름 넣기
           인덱스 1 --> 인덱스0 이름 넣기
           인덱스 0 --> lastName 이름 넣기
            */
        }
        System.out.println(students);
    }
}
