package j19_익명클래스;

@FunctionalInterface /*람다에 쓰이는 인터페이스에서는 무조건 달려 있는 것*/

public interface Calculator {
	
	public int calc(int a, int b);
	//public int calc2(int a, int b); 두개 쓰지 마라.
	
	/*자료형이 여러개일 경우
	 * 
	 * 리스트나 배열로 받아서 값이 들어오는 것 까지 */
	
	public default int a() { /*디폴트는 이미 정의된것이라 */
		return 10;
	}
	

}
