package j13_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {

    public static void print(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {


        Student student = new Student(20220001, "양진구");
        Student student2 = new Student(20220001, "양진구");


        System.out.println(student); /*원래는 toString을 실행 시켜야 하지만 안해도 됨.*/
        System.out.println(student2);

        System.out.println(student == student2);
        System.out.println(student.equals(student2)); /*주소비교*/

        System.out.println();

        print(student); /*student의 주소값이 업캐스팅(Student클래스는 Object 클래스를 상속받음)해서 print()의 매개변수로 들어간것*/ /* 오브젝트 객체가 들어와야 하는데 학생이 오브젝트*/

        System.out.println(student.hashCode()==student2.hashCode()); /*실제주소*/
        System.out.println(student2.hashCode());

        Class c = student.getClass(); /*getClass 는 Objec5t6 4t*/
        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName()); /* 클래스 명만 가지고 옴*/

        Field[] fields = c.getDeclaredFields();
        for (int i= 0; i<fields.length; i++){
            System.out.println(fields[i].getName());
        }
        Method[]methods = c.getDeclaredMethods();
        for (int i= 0; i <methods.length; i++){
            System.out.println(methods[i].getName());
        }
    }
}
