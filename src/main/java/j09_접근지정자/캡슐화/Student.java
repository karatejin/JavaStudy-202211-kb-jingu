package j09_접근지정자.캡슐화;

public class Student {
    private  String name;
    private String gender;

    public Student(){}

    public Student (String name, String gender) {
        this.name = name; /*얘가 대신 넣기*/
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
}
}
