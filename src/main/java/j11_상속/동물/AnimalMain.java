package j11_상속.동물;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();
        Tiger tiger = new Tiger();

        Animal hAnimal = human; /*형변환*/ /*업캐스팅*/
        Animal tAnimal = tiger;
        Animal [] animals = new Animal[3]; /*3개의 우리*/

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Animal();

        for (int i =0; i < animals.length; i++){ /* animals[1] = new Tiger(); 재정의 된거만 쓰자.*/
            animals[i].move();
        }

        for (int i =0; i < animals.length; i++) {
            if(animals[i] instanceof Human){ /*Human 으로 생성된 객체가 true 면 작동. 아니면 빠잉*/
                Human h = (Human) animals[i]; /*다운캐스팅*/ /*명시해줘야 한다.*/
                h.readBooks();
            } else if (animals[i] instanceof Tiger) {
                Tiger t = (Tiger) animals[i];
                t.hunting();
            }else {
                System.out.println("다운캐스팅 불가");
            }
        }
        //int a = (int)3.14; /*다운캐스팅*/
        //double d = (double)3; /*업캐스팅*/
    }
}
