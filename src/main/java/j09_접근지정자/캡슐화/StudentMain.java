package j09_접근지정자.캡슐화;

public class StudentMain {
    public static void main(String[] args) {

        Student st1 = new Student("김기동","남"); /*간접적으로부탁*/

        st1.printInfo();
    }
}
