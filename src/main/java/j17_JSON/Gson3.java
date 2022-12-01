package j17_JSON;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Gson3 {

	public static void main(String[] args) {
		
		JsonObject jsonObject = new JsonObject();
		
		jsonObject.addProperty("username", "junil");
		jsonObject.addProperty("password", "1234");

		System.out.println(jsonObject); /*json 형태로 바로 들어간다.*/ /*맵을 거칠 팔요가 없다.*/
		
		JsonArray jsonArray = new JsonArray(); /*JsonElement(); 추상클래스 생성 안된다 */
		jsonArray.add("java");
		jsonArray.add("python");
		jsonArray.add("javascript");
		jsonArray.add("c#");
		
		System.out.println(jsonArray);
		
		jsonObject.add("subject", jsonArray); /*json 은 키와 밸류를 가진다.*/ /*json 안에 배열 을 추가한것*/
		
		System.out.println(jsonObject);
	}

}
