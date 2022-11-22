package j11_상속.동물;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();
        Tiger tiger = new Tiger();

        Animal hAnimal = human; /*형변환*/ /*업캐스팅*/
        Animal tAnimal = tiger;
        Animal [] animals = new Animal[5]; /*3개의 우리*/
        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();
        animals[4] = new Human();

        System.out.println("[업캐스팅]");
        for (int i =0; i < animals.length; i++){ /* animals[1] = new Tiger(); 재정의 된거만 쓰자.*/
            animals[i].move(); /*업캐스팅*/
        }

        System.out.println();

        System.out.println("[다운캐스팅]");
        for (int i =0; i < animals.length; i++) {
            if(animals[i] instanceof Human){ /*Human 으로 생성된 객체가 true 면 작동. 아니면 빠잉*/
                ((Human) animals[i]).readBooks(); /*다운캐스팅*/ /*명시해줘야 한다.*/ /*animal 을 휴먼으로*/

            } else if (animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).hunting(); /*animal 을 호랑이로*/

            }
        }
        //int a = (int)3.14; /*다운캐스팅*/
        //double d = (double)3; /*업캐스팅*/
    }
}
