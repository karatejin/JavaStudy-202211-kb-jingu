package j18_예외;

public class ArrayException {
	
	public static void main(String[] args) {
		Integer[] numberArray = new Integer[] {1,2,3,4,5};
		
		try {
			/*예외가 예상되는 부분*/
			for(int i = 0; i<6; i ++) {
				System.out.println(numberArray[i]);
			}			
		} catch (ArrayIndexOutOfBoundsException e) { /*예상되는 예외부분을 받는다. 매개변수 e 에 대입한다.*/
			System.out.println(e); /*예외 메세지*/ /*java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5*/
			e.printStackTrace(); /*예외의 문제점, *//*어디에서 나왔는 지 알려줌*/
			/*java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at j18_예외.ArrayException.main(ArrayException.java:11)*/
			System.out.println(e.getMessage()); /*Index 5 out of bounds for length 5*/
			System.out.println("예외가 생성됨");
			
		}		
		System.out.println("프로그램 정상 종료");
	}

}
