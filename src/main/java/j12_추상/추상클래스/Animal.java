package j12_추상.추상클래스;

public abstract class Animal {

    /*
    추상메서드를 하나라도 포함하는 클래스
    추상클래스로 정의하여야 한다.
    */
    private String kind;

    public Animal(){ /*기본 생성자 정의하여야 상속 가능*/ /*생성자는 숨겨져 있다.*//*건드렸으면 다시 새로 만들어 줘야함*/

    }

    public Animal(String kind) {
        System.out.println(kind + "이(가) 생성되었습니다.");
        //this.name = name;
    }


    //추상메소드

    public abstract void move(); /*구현부 {}가 필요 없음*/ /*꼭 필요하지는 않다.*/ /*새로 new 할 수 없다.*/

    public void eat(){
        System.out.println("동물이 밥을 먹습니다.");
    }


}
