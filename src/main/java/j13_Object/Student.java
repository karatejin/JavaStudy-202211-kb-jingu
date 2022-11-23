package j13_Object;

import java.util.Objects;

public class Student {

    private int code;
    private String name;

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override /* 매개변수 칸에 업캐스팅으로 모든 클래스(오브젝트 상속받음) 가 들어올수 있다*/
    public boolean equals(Object o) { /* 오버라이드 하면 매개변수를 바꿀수 있다, 자료형은 바꾸면 안된다.*/
        if (this == o) return true;
        if (o == null || getClass()/*자료형을 말한다.*/ != o.getClass()) return false; /* getClass() != o.getClass() == instanceof */       /*!(o instanceof Student) getClass() != o.getClass()*/
        Student student = (Student) o; /*다운캐스팅*/
        return code == student.code && Objects.equals(name, student.name/*뭐든 넣어도 됨*/); /* Objects = 유틸리티, String.equals 와 동일하게 사용*/
    }

    @Override /*나만의 주소값을 만들겠다?*/
    public int hashCode() {
        return Objects.hash(code, name);/*이 값들을 가지고 hash 를 만들지롱*/
    }

    @Override /*alt + insert*/
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
