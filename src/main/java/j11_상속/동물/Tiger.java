package j11_상속.동물;

public class Tiger extends Animal{

    public Tiger(){
        System.out.println("Tiger 객체 생성");
    }

    @Override
    public void move() {
        //super.move();/*부모의 메소드를 호출하라.*/ /*super는 부모의 주소*/
        System.out.println("호랑이가 달립니다.");
    }

    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
