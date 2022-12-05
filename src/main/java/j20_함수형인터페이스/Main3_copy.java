package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class Main3_copy {
	
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
			
		System.out.println();
		
		forEachTest(n -> {System.out.println(n);}, names); /* consumer 객체에 구현과 생성이 이루어짐*/ /*for each 돌면서 이름을 출력한다. */
		
		
		Map<String, String> subject = new HashMap<>();
		
		subject.put("java", "자바");
		subject.put("python", "파이썬");
		subject.put("javascript", "자바스크립트");
		subject.put("C", "씨언어");
		subject.put("Node.js", "노드제이에스");
		
		Set <String> keySet = subject.keySet();
		keySet.forEach(key -> {
			System.out.println(subject.get(key));
		});
		
		Set<Entry<String,String>> entrySet = subject.entrySet();
		entrySet.forEach(entry-> {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		});
		
		subject.forEach((key,value) ->{
			System.out.println(key + ": " + value);
		});
		

	}

}
