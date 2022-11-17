package j08_클래스;

public class StudentMain {

    public static void main(String[] args) {

        Student st = new Student("부산대학교","홍길동",3,true);

        Student st1 = new Student();

        st1.school = "서울대학교";
        st1.name = "고길동";
        st1.studentYear = 2;
        st1.gender = false;

        st.showStudentInfo();
        System.out.println();
        st1.showStudentInfo();
    }
}
