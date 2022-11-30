package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethod {

	public static void printList(String listName, List<String> list) {
		System.out.println("[ " + listName + " ]");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i + "->\t");
			System.out.println(list.get(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>();
		List<String> nameList2 = new ArrayList<String>();

		/* add() -> 리스트에 값을 추가함 */
		nameList.add("임지현");
		nameList.add("신경수");
		nameList.add("고희주");
		nameList.add("문승수");
		nameList.add("장건녕");
		nameList.add("박수현");
		printList("nameList", nameList);

		/* addAll() 리스트에 다른 Collection의 값을 모두 추가함 */
		nameList2.addAll(nameList);
		printList("nameList2", nameList2);

		nameList2.addAll(3, nameList); /* 3번부터 다시 처음것이 나오게 해라 */
		printList("nameList2", nameList2);

		/* contains() 리스트에 해당 값이 있는 지를 확인 boolean 타입 반환 */
		boolean isContains = nameList.contains("장건녕"); /* 포함하는지를 확인 */
		System.out.println("이름 목록에 장건녕이 있나?" + (isContains ? "있다" : "없다"));
		System.out.println();

		/* indexOf() 리스트에서 해당 값을 인덱스 위치를 반환 (앞에서부터 탐색) */
		int index = nameList.indexOf("고희주");
		System.out.println("리스트에서 고희주의 인덱스 위치:" + index); /* 리스트에서 고희주의 인덱스 위치:2 */

		/* lastIndexOf() 리스트에서 해당 값의 인덱스 위치를 반환 (뒤에서 부터 탐색) */
		int lastIndex = nameList2.lastIndexOf("임지현");
		System.out.println("리스트에서 임지현의 인덱스 위치:" + lastIndex); /* 리스트에서 임지현의 인덱스 위치:3 */

		boolean isEmpty = nameList.isEmpty(); /* isEmpty 만으로도 참, 거짓이 출력 됨 */ /* is 이다. */
		System.out.println("해당 리스트가 비어잇는가?" + isEmpty); /* 해당 리스트가 비어잇는가?false */

		for (String name : nameList) {
			System.out.println(name);
		}
		System.out.println();

		Iterator<String> ir = nameList.iterator(); /* iterator = Iterator<String> 객체반환 */

		while (ir.hasNext()) { /* has 있다 없다. */
			/* ir 에서 다음이 있는가?? 있으니까 while 작동. Next 다음 값을 꺼내라. 1번 나오고 */ /* 다 꺼냈으면 false */
			System.out.println(ir.next()); // *false 가 될때까지 반복한다./ /* 꺼낸 적 없으니까 ir.next는 1*/
		}
		System.out.println();

		nameList.forEach(name -> {
			System.out.println(name);
		});		

	} // end of main

}// end of class
