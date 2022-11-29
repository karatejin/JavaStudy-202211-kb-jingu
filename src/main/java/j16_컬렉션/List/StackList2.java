package j16_컬렉션.List;


import java.util.ArrayList;
import java.util.List;

public class StackList2 {

    public static void main(String[] args) {
        ArrayList<String> stack2 = new ArrayList<>();

        stack2.add("임지현");
        stack2.add("신경수");
        stack2.add("고희주");
        stack2.add("문승주");
        stack2.add("장건년");
        stack2.add("박수현");
        stack2.add("확석민");
        stack2.add("박준현");

        // 순서대로 넣었을때 거꾸로 나오게
        int size = stack2.size();
        for(int i = 0; i < size; i++) {
            System.out.println(stack2.get(size - (i+1)));
            // System.out.println(stack2.remove(size - i - 1);
        }

        /*
        remove로 stack2의 사이즈가 계속 줄어들기 때문에
        size변수로 stack2의 사이즈를 고정시켜놓고 반복

        인덱스의 길이는 길이 - 1 이기 때문에 (i+1) 또는 i - 1 추가
         */
        System.out.println();

        List<String> copyList = new ArrayList<>();

        int copySize = stack2.size();
        for(int i = 0; i < size; i++) {
            copyList.add(0, stack2.remove(size-i-1));
        }

        System.out.println(copyList);

    }
}

