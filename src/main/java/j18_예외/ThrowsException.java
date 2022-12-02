package j18_예외;

public class ThrowsException {
	
	public static void printArray(int[] numbers) throws Exception { /*printArray 이 메소드를 예외 처리 할것이다.*/
			for (int i = 0; i < 6; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public static void main(String[]args) { /*main 에서 throws 를 써서 예외 처리를 미루면 jvm 까지 간다.*/
	
		int[]nums = new int [] {1,2,3,4,5};
		
		try { /*예외처리 해주자.*/
			printArray(nums);
		} catch (Exception e) { /*} catch (NullPointerException | ArrayIndexOutOfBoundsException e) { 둘중에 하나 문제가 생겼을 때 예외처리 하지롱*/
			
			e.printStackTrace(); /*어디가 문제인지 알려줘*/
		}
		System.out.println("프로그램 정상종료");
		
	}	
}
