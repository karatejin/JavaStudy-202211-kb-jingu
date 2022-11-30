package j16_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManagement {
	
	public static void main(String[] args) {
		
		List<Map<String, Object>> userList = new ArrayList<>(); /*종속성 주입*/ /*얘를 */
		
		UserRepositroy userRepository = new UserRepositroy(userList); /*여기로*/
		
		Map<String, Object> user1 = new HashMap<>();
		user1.put("username", "a1");
		user1.put("password", "1111");
		
		Map<String, Object> user2 = new HashMap<>();
		user2.put("username", "b1");
		user2.put("password", "2222");
		
		Map<String, Object> user3 = new HashMap<>();
		user3.put("username", "c1");
		user3.put("password", "3333");
		
		Map<String, Object> user4 = new HashMap<>();
		user4.put("username", "d1");
		user4.put("password", "4444");
		
		userRepository.registor(user1);
		userRepository.registor(user2);
		userRepository.registor(user3);
		userRepository.registor(user4);
		
		System.out.println(userRepository.getUserList());
		
		System.out.println(userRepository.findUserByUsername("b1")); /*b1을 가져와*/
		System.out.println(userRepository.findUserByUsername("f1"));
		
		userRepository.modifyPasswordByUsername("b1", "1234");
		System.out.println(userRepository.findUserByUsername("b1"));
		
		userRepository.deleteUserByUsername("b1");
		System.out.println(userRepository.getUserList());
		
	}

}
