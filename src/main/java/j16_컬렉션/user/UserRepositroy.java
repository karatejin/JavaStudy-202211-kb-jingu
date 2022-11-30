package j16_컬렉션.user;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor

public class UserRepositroy { /*사용자 등록 수정 등을 위한 클래스*/
	
	@Getter
	private List<Map<String, Object>> userList;
	
	/*Create*/
	public void registor(Map<String, Object>userMap) { /*userMap을 받는다. 누가? registor 가*/
		System.out.println("[사용자 등록]");
		userList.add(userMap);
	}
	/*Read*/
	public Map<String, Object> findUserByUsername(String username){ /*username 을 찾아줘 */
		Map<String, Object> userMap = null; /*못찾음?*/
		
		for(Map<String, Object> user : userList) { /*userList에서 하나씩 꺼내*/
			String _username = (String)user.get("username"); /*임시로 쓰는 변수명 _변수명*/ /*키값 username을 꺼내면 value도 가져오자. 위에 있는 거랑 다름.*/
			if(_username.equals(username)) { /*일차하면.*/
				userMap = user; /*내가 찾은 유저맵 아이디가 일치하는 겻 찾으면 멈춰라.*/
				break;
			}
		}
		return userMap; /*못찾으면 null*/
	}
	
	public void modifyPasswordByUsername(String username, String newPassword) {/*username을 찾아서 그놈의 비번을 바꿔라.*/ /*이게 호출되면*/
		Map<String, Object> userMap = findUserByUsername(username); /*아이디 찾기 */
		
		if(userMap == null) { /*userMap == null 이라면 (못찾았다면) */
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return; /*강제로 빠져 나간다.*/
		}
		
		 userMap.replace("password",newPassword);/*대체해라. 새거로*/
	}
	public void deleteUserByUsername(String username) {
		
		Map<String, Object> userMap = findUserByUsername(username); /*아이디 찾기 */
		
		if(userMap == null) { /*userMap == null 이라면 (못찾았다면) */
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return; /*강제로 빠져 나간다.*/
		}
		
		int userIndex = userList.indexOf(userMap); /*해당 주소값을 찾아*/
		
		userList.remove(userIndex);/*해당 유저가 위치하고 있는 index == indexOf 로 찾자*/
	}

}
