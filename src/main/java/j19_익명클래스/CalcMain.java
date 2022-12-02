package j19_익명클래스; 

public class CalcMain {

	public static void main(String[] args) { /*람다.*/ /*무조건 인터페이스다 다른거 하지 말자. */
		
//		Calculator c1 = (x,y) -> x+y;	/*람다*/		
		
		Calculator c = new Calculator() {
			
			@Override
			public int calc(int x, int y) { /*자료형 메소드명만 안바꾸면 된다.*/
				
				return x+y;
			}
		};
		
//		Calculator c1 = (int x, int y) -> { /* 생락하고 화살표로*/ /*생성과 동시에 대입*/ /*대상이 있어야 한다 여기서는 Calculator */
//			return x+y; 
//			}; /*람다 해체*/ /*정의되어지고 생성한다*/ /*정의 밖에 없다.*/
			
			
		//	Calculator c1 = (x, y) -> 인터페이스 안에 정해져 있기 때문에 자료형 int 생략
		//		x+y; 다른 실행문이 없는경우 실행문이 바로 리턴할 경우 중괄호 생략 리턴 생략  (x, y) -> x+y; 무조건 int 로 리턴이 되어야 한다.
			
		Calculator c1 = ( x, y) -> { /*인터페이스 안에 추상메소드 하나만 있어야 한다.*/ /*메소드가 2개면 오류*/
			System.out.println("2");
			System.out.println("2");
			System.out.println("2");
			System.out.println("2");
			System.out.println("2");
			
			
			return x+y; 
			};		
		
		
		CalculatorSub cs = x -> x*x;//*매개변수 x 하나면 소괄호 생략 가능*/
		
		System.out.println(cs.calc(10));  /*계산 곱하기*/
		System.out.println(cs.a()); /*인터페이스 자료형 a 호출*/
		
		int r1 = c1.calc(10,20);
		System.out.println(r1);
		
		Calculator c2 = new Addition(); /*1회용이니까 클래스를 새로 만들어야 한다.*/ /*이거는 비교용 클래스 생성*/
		
		int r2 = c2.calc(20, 30);
		System.out.println(r2);		

	}

}
