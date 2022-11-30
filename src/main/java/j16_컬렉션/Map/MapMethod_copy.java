package j16_컬렉션.Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethod_copy {

	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("username", "junil");
		map.put("password", "1234");
		map.put("name", "김준일");
		map.put("email", "junil@gamail.com");
		map.put("age", "29");
		map.put("gender", true);
		
		Map<String, String> address = new HashMap<>(); /*Hash 값에 따라서 순서대로 나온다. 완전 무작위 는 아니다.*/
		/* Map은 키와 밸류값.*/
		address.put("address1", "부산광역시");
		address.put("address2", "동래구");
		address.put("address3", "중앙대로 1285");
		
		map.put("address", address);
		
		Map<Integer, String> subject = new HashMap<>(); /*키값이 인티져 면 List와 같다.*/
		subject.put(100, "java");
		subject.put(200, "C#");
		subject.put(300, "python");
		subject.put(401, "python2");
		subject.put(403, "python3");
		subject.put(502, "python4");
		subject.put(604, "python5");
		
		map.put("subject", subject);
		
		System.out.println(map);
		

	}

}
