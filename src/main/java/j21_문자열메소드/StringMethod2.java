package j21_문자열메소드;

/*내가 한거*/

//roleArray[0] = roleStr.substring(0,roleStr.indexOf(","));
//System.out.println(roleArray[0]);
//
//roleArray[1] = roleStr.substring(roleStr.indexOf(", "), roleStr.lastIndexOf(","));
//System.out.println(roleArray[1]);
//
//roleArray[2] = roleStr.substring(roleStr.lastIndexOf(","));
//System.out.println(roleArray[2]);
public class StringMethod2 {

	public static void main(String[] args) {
		
		String roles = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN";
		
		String[] roleArray = new String[3];
		
		String tempRoles = roles;
		
		roleArray[0] = tempRoles.substring(0,tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());/*처음부터 쉼표까지*/
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") + 2); /*쉼표 위치를 찾아* 꺼내서 첫번째거 날려 tempRoles 에 받겠다.*/		
		roleArray[1] = tempRoles.substring(0,tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") + 2);		/*, 를 찾으면 -1을 찾는다.*/
		roleArray[2] = tempRoles.substring(0,tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		
		for(String role : roleArray) {
			System.out.println(role);		
		}
		
		System.out.println();
		
		String[] roleArray2 = roles.split(", "); /*쉼표를 기준으로 잘라서 배열을 만들어라.*/
		for(String role : roleArray2) {
			System.out.println(role);
		}
		
	}
}
