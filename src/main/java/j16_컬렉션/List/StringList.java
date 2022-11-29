package j16_컬렉션.List;

import java.util.ArrayList;

public class StringList {
    public static void main(String[] args) {
        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "JSP";
        strArray[2] = "Servlet";

        // 일반 반복
        System.out.println("<<<<<<<<<<<<<<<일반반복>>>>>>>>>>>>>>>");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        // foreach
        System.out.println("<<<<<<<<<<<<<<<foreach>>>>>>>>>>>>>>>");
        for (String str : strArray) {
            System.out.println(str);
        }

        ArrayList<String> strList = new ArrayList<>();

        /*
        List 값 추가 (Create) -> add(값), add(index, 값)
         */

        strList.add("Java");
        strList.add("JSP");
        strList.add("Servlet");
        strList.add(1, "C++"); // 1번 인덱스에 요소 추가
        // add는 값을 바꾸는 메소드가 아니라 값을 추가하는 메소드
        // 중간에 값을 넣으면 요소들이 한칸씩 밀림
        // 그러면서 공간도 자동으로 늘어남

        strList.add(0, "HTML");

        System.out.println("-" + strList.size());

        System.out.println("<<<<<<<<<<<<<<<list foreach>>>>>>>>>>>>>>>");
        for (String str : strList) {
            System.out.println(str);
        }

        /*
        List 값 조회 (Read) -> get(index)
         */
        System.out.println("<<<<<<<<<<<<<<<list 일반반복>>>>>>>>>>>>>>>");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i)); // 리스트에서 i번째에 있는 값을 get
            // get() 메서드는 Set에는 존재하지 않음 (Collection에는 get() 메서드가 없음)
            // 키값이 없는 경우 get()메서드가 없음
        }

        System.out.println();
        /*
        List 값 수정(Update) -> set(index, 값)
         */
        strList.set(0, "HTML5");
        System.out.println(strList);    // toString() 메소드

        System.out.println();
        /*
        List 값 삭제 (Delete) -> remove(index)
         */
        strList.remove(2);
        System.out.println(strList);

        int[] array = new int[10];
        System.out.println("-" + array.length);  //?


    }
}