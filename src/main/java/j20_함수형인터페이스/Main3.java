package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class Main3 {
	
	public static void forEachTest(Consumer<String> consumer, List<String> list) { /*foreEach 해체*/
		for(String s : list) {
			consumer.accept(s);
		}
	}

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>(); /*String 으로*/
		
		names.add("임지현");
		names.add("신경수");
		names.add("고희주");
		names.add("문승주");
		names.add("장건녕");
		
		names.forEach(n -> {System.out.println(n); }); /*오버라이드 된 메서드*/ /*매개변수로  n을 받고 자료형은 Consumer 자기자신과 부모 까지.*/
		/* forEach가 Consumer 라는 인터페이스를 매개변수로 받는다. */ /* Consumer반환값 없다  출력*/
		/*forEach 가 메소드  이 안에 값이 들어간다. forEach() 괄호안에는 Consumer 라는 객체가 들어간다. 구현된 객체 가 들어와야한다. 업캐스팅*/
		/*구현과 생성이 동시에*/
		/*n 은 String 이다. List <String> 이 n이 된다. */
		/*default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action); null 이 아닌 것이 필수다.
        for (T t : this) { 나 자신 여기서는 names. <Stirng> 을 꺼내서 대입
            action.accept(t);
        }
    }*/
		
		System.out.println();
		
		forEachTest(n -> {System.out.println(n);}, names); /* consumer 객체에 구현과 생성이 이루어짐*/ /*for each 돌면서 이름을 출력한다. */		

	}

}
