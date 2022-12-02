package j19_익명클래스;

@FunctionalInterface 

public interface CalculatorSub {
	
	public int calc(int a);	
	
	public default int a() { /*인터페이스에서는 일반메소드를 디폴트 메소드로 말함.*/
		return 10;
	}
	

}
