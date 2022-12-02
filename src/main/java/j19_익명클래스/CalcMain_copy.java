package j19_익명클래스; /*이름이 없는클래스 Calculator 인터페이스만 만들었다. */

public class CalcMain_copy {

	public static void main(String[] args) { /*인터페이스는 생성 할 수 없다.*/
		
		Calculator c1 = new Calculator() { /*c1 = new Calculator 의 주소값이 들어간다. 인터페이스는 생성 안되는까 implements*/
			/* 임시로 오버라이드 이 클래스 안에서만 */ /* 다른클래스에서는 안됨 */ /* 재사용할 필요가 없는 경우 *//* new 는 무조건 힙에 올라간다.*/

			@Override /* 인터페이스 implements 해서 오버라이드*/ /*직접 임시로 구현하였다. 1회용 틀 여기서 찍어내고 버린다.*/
			public int calc(int a, int b) {
				System.out.println("덧셈");
				return a+b;
			}
			
		};
		
		Calculator c3= new Calculator() {
			 /*한번더 재사용 하고 싶으면 다시 오버라이드.*/

			@Override /* 인터페이스 implements 해서 오버라이드*/ /*직접 임시로 구현하였다. 1회용 틀 여기서 찍어내고 버린다.*/
			public int calc(int a, int b) {
				System.out.println("덧셈");
				return a+b;
			}
			
		};
		
		
		
		
		
		
		int r1 = c1.calc(10,20);
		System.out.println(r1);
		
		Calculator c2 = new Addition(); /*1회용이니까 클래스를 새로 만들어야 한다.*/ /*이거는 비교용 클래스 생성*/
		
		int r2 = c2.calc(20, 30);
		System.out.println(r2);
		
		int r3 = c3.calc(30,70);
		System.out.println(r3);
	

	}

}
