package j18_예외;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
class User{ /*서브클래스*/ /*default*/
	private String username;
	private String password;
}

public class UserListException { /*메인 클래스 는 이름이 같아야 함.*/

	public static void main(String[] args) {
		
		List<User> userList = new ArrayList<>();
		
		userList.add(new User("aaa", "1111"));
		userList.add(new User("bbb", "2222"));
		userList.add(new User("ccc", "3333"));
		userList.add(new User("ddd", "4444"));
		userList.add(null);
		
		int length = userList.size();
		
		try {
			
			for (int i = 0; i < length; i++) {
				System.out.println(userList.get(i));
			}
			for (int i = 0; i < length; i++) {
				System.out.println("username: " + userList.get(i).getUsername());
				System.out.println("password: " + userList.get(i).getPassword());
			} /*try 문에서 오류 발생하면 */
			
		} catch (IndexOutOfBoundsException indexOutOfBoundsException) { /*java.lang.IndexOutOfBoundsException 대입 해야한다.*/
			length -=1;
			System.out.println(indexOutOfBoundsException.getMessage());
			try {
				for (int i = 0; i < length; i++) { /*위에서 오류났기 때문에 한번더 실행 해야함. 이번에는 */ /*java.lang.NullPointerException:*/
					System.out.println("username: " + userList.get(i).getUsername());
					System.out.println("password: " + userList.get(i).getPassword());
				}
			} catch (NullPointerException nullPointerException) { 
				System.out.println( nullPointerException.getMessage());
			}		
				
		}
		catch (NullPointerException nullPointerException) {  /*NullPointerException 한번더 잡아 줘야함*/
			System.out.println( nullPointerException.getMessage());
		}
		catch (Exception e) { /*한방에 예외*/ /*위에서 else if 처럼 내려온다. 개발자가 예상하지 못한 예외를 처리하기 위해서. 마지막에 입력 log file*/
			e.printStackTrace(); /*어디에서 무엇이 잘못 되었는지 알 수 있다.*/
		}
		finally { /*무조건 마지막에 실행 되는 부분 예외가 발생했든 말든 간에*/ /*데이터 자동 백업*/
			System.out.println("무조건 실행"); 
		}
		
		System.out.println("프로그램 정상 종료"); 
		
	}

}
