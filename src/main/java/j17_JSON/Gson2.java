package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {
	
		User user = User.builder()
				.username("junil")
				.password("1234")
				.name("김준일")
//				.email("junil1218@gamil.com")
				.build();
		
		System.out.println(user);
		
		System.out.println("==========================");
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls()
				.excludeFieldsWithoutExposeAnnotation()
				.create();
		
		String userJson = gson.toJson(user); /* user 객체를 json 으로 변환*/
		
		System.out.println(userJson); /*java to json*/
		
		System.out.println("==========================");
		
		User userObj = null;
		
		userObj = gson.fromJson(userJson, User.class); /*json 을 user 객체로 변환*/
		
		System.out.println(userObj); /*user 객채로 변환 확인*/ /*json to java*/

	}

}
