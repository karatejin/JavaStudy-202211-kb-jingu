package j16_컬렉션.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {

	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();

		nameSet.add("김준일");
		nameSet.add("김수현");
		nameSet.add("문경원");
		nameSet.add("권용범");
		nameSet.add("이영인");

		System.out.println(nameSet); /* nameSet은 순서대로 안나온다. */ /* Set은 하나만 가져올수 없다. get 사용이 불가. */

		/* Set 은 무조건 foreach로 해야한다. */
		for (String s : nameSet) {
			if (s.equals("김준일")) {
				System.out.println(s);
				break;
			}
		}
		List<String> nameList = Arrays
				.asList(new String[] { "김준일", "권용범" }); /* List던 Set이던 addAll 하면 List를 Set으로 옮긴다. */

		System.out.println(nameList);

		Set<String> listToSet = new HashSet<String>();
		listToSet.addAll(nameList); /* 컬렉션을 매개변수로 받는다. */ /* Map은 컬렉션 인터페이=스를 상속받지 않기 떄문에 addAll을 쓸수 없다. */

		System.out.println(listToSet);

		nameSet.remove("김준일"); /* 직접 내가 원하는 값을 지워야 한다. */

		System.out.println(nameSet); /* 지정한 값만 지워진다. */ /* [권용범, 김수현, 이영인, 문경원] */ /* 업데이트 없다. remove와 add를 추가 */
	}
}
