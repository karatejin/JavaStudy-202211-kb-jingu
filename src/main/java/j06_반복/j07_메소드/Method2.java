package j06_반복.j07_메소드;

public class Method2 {
    /*
    메소드 오버로딩
    */

    public static void print(String name) {
        System.out.println("이름: " + name);
    }
    public static void print(int age) {
        System.out.println("나이: " + age);
    }
    public static void print(String name, int age) {
        System.out.println("이름: " + name + " 나이: " + age);
    }
    public static void print(int age, String name) {
        System.out.println("이름: " + name + " 나이: " + age);
    }

    public static void main(String[] args) {

        print("양진구");/*String = string 찾아가자*/
        print(34); /*int = int 찾아가자*/
        print("양진구", 34);
        print(34, "양진구");
    }
}
