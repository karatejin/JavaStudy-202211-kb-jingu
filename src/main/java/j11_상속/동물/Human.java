package j11_상속.동물;

public class Human extends Animal{

    public Human(){
        super();
        System.out.println("Human 객체 생성");
    }

    @Override /*어노테이션*/
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBooks(){
        System.out.println("사람이 책을 읽습니다.");
    }

}
