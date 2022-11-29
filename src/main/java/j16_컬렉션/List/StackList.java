package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Scanner;

public class StackList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 임지현, 신경수, 고희주, 문승주, 장건년, 박수현, 확석민, 박준현

        ArrayList<String> stack = new ArrayList<>();
        // foreach를 돌렸을때 거꾸로 나오게


//        stack.add(0,"임지현");
//        stack.add(0, "신경수");
//        stack.add(0, "고희주");
//        stack.add(0, "문승주");
//        stack.add(0, "장건년");
//        stack.add(0, "박수현");
//        stack.add(0, "확석민");
//        stack.add(0, "박준현");

        for (int i = 0; i < stack.size() + 1; i++) {
            String name = scanner.nextLine();
            if (name.isBlank()) {
                break;
            }
            stack.add(0, name);
        }

        for (String name : stack) {
            System.out.print(name);
            if (!name.equals(stack.get(stack.size() - 1))) {
                System.out.print(", ");
            }
        }


    }
}
