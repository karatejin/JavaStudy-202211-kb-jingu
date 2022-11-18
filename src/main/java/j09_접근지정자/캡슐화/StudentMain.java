package j09_접근지정자.캡슐화;

public class StudentMain {
    public static void main(String[] args) {

        Student st1 = new Student("김기동","남"); /*간접적으로부탁 메소드를 통해서*/

        st1.printInfo();

        st1.setName("김기둥"); /*대입*/
        st1.printInfo();

        st1.gender = "여";
        st1.printInfo();

        System.out.println(st1.getName()); /*리턴 값을 출력해라*/
        System.out.println(st1.gender);


    }
}
