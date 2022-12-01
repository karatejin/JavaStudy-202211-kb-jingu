package j17_JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {

	public static void main(String[] args) {
		Gson gson = new Gson();

		GsonBuilder gsonBuilder = new GsonBuilder(); /* gson 쓰는 방법2가지. */
		Gson gson2 = gsonBuilder.setPrettyPrinting()
				.create(); /* GsonBuilder 클래스가 있고 그 안에 create() 가 있음. create 호출될때 Gson 생성 */

		Map<String, Object> map = new HashMap<>();
		map.put("name", "김준일");
		map.put("email", "junil@gmail.com");
		map.put("address", "부산 동래구");
		map.put("phone", "01099881916");

		List<String> hobby = new ArrayList<>();
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");

		map.put("hobby", hobby);

		System.out.println(map);

		String json = gson2.toJson(map); /* json 형태로 바꾼다. */
		System.out.println(json);

		Map<String, Object> jsonMap = gson2.fromJson(json, Map.class); /* json 에서 내가 보려고 하는 형태 (여기서는 Map) */

		System.out.println(jsonMap); /* 맵으로 바꾸자 */

	}

}
