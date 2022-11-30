package j16_컬렉션.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMethod {

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
		
		Map<Integer, String> subject = new TreeMap<>(); /*키값이 인티져 면 List와 같다.*/ /*트리맵 하면 순서대로*/
		subject.put(100, "java");
		subject.put(200, "C#");
		subject.put(300, "python");
		subject.put(401, "python2");
		subject.put(403, "python3");
		subject.put(502, "python4");
		subject.put(604, "python5");
		
		map.put("subject", subject); /*뒤의 subject 는 map , map object로 업캐스팅*/
		
		System.out.println(map);
		
		System.out.println(((Map<Integer,String>)map.get("subject")).get(403)); /*python3*/
		//System.out.println(((Map<Integer,String>)/*다운캐스팅*/map.get("subject")/*이건 Object*/).get(403)); /*python3*/
		
		List<String> hobby = new ArrayList<>();
		
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		hobby.add("족구");
		
		map.put("hobby", hobby);
		
		System.out.println(hobby);
		
		System.out.println(((List<String>)map.get("hobby")).get(2)); /*야구*/
		
		System.out.println();
		
		Set<Entry<String, Object>> userEntry = map.entrySet(); /*둘이 같음*/ /*둘다 제네릭*/ /*묻지마*//*Entry 객체는 String 키값과 Object 밸류*/

		System.out.println(map);
		System.out.println(userEntry);
		
		Set<String> names = new HashSet<>(); /*키값 중복 xx 실제로 생성 되는 것 new HashSet<>(); */
		names.add("김준일");
		names.add("김준이");
		names.add("김준삼");
		names.add("김준사");
		names.add("김준오");
		
		System.out.println(names);
		for(String name : names) {
			System.out.println(name);
		}
		
		/*맵을 엔트리 값으로 바꿔라 하나의 엔트리로 묶어서 entrySet 으로 나오게 해라.*/
//		List<Map<String, Object>> listMap = new ArrayList<>(); /*둘이 같음*/ /*둘다 제네릭*/ /*이 리스트에는 맵을 답는다. 맵의 값은 키값 String, 밸류 Object*/
	
		for(Entry<String,Object> entry : userEntry){ /*userEntry == Set*/ /*하나 꺼냈더니 entry 객체다.*/
//			System.out.println(entry.getKey()); /* 키 값만 나온다.password address gender subject name email age username hobby*/ 
//			System.out.println(entry.getValue()); /*밸류 값만 나온다. */ /*엔트리를 하나씩 꺼낸다.*/
			System.out.println(entry.getKey() + " : " + entry.getValue()); /*키랑 밸류*/
		}
		System.out.println();
		
		/*배열 컬랙션 같은 자료형 끼리 묶어서 나열한다.*/
		Set<String>keys = map.keySet(); /*키값만 뽑자.*/ /*키값만 Set 으로 바꾸겠다.*/ /*반복을 통해서 get을 꺼내야 한다. 그래서 forEach*/
		
		for(String key : keys) {
			System.out.println(key);/*키값만 뽑자.*/			
			System.out.println(map.get(key)); /*map 에서 get key 값을 가지고 value를 나타내자*/
		}
		System.out.println("================================");
		System.out.println(map.values());
		System.out.println("================================");
		
		for(Object obj : map.values()) {
			System.out.println(obj);
		}
	}

}
