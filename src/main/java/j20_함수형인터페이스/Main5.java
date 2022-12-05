package j20_함수형인터페이스;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main5 {

	public static void main(String[] args) {

		Predicate<Integer> isEven = number -> number % 2 == 0; /*boolean*/
		
		Function<Integer, String> isEvenStr = number -> { /*function 은 무조건 리턴*/
			
			Predicate<Integer> isEven2 = num -> num % 2 == 0;
			
			return isEven2.test(number) ? "짝수" : "홀수";
		};
		
		System.out.println(isEven.test(100));	
		System.out.println(isEven.test(35));	
		System.out.println(isEven.test(1));	
		System.out.println(isEven.test(10));
		
		System.out.println(isEvenStr.apply(100));
		System.out.println(isEvenStr.apply(35));
		System.out.println(isEvenStr.apply(1));
		System.out.println(isEvenStr.apply(10));	

	}

}
