package j06_반복;

public class Continue2 {
    public static void main(String[] args) {

        for (int i = 0; i <100; i++) {
            if(i % 2 == 0) {
                continue; /*for 문은 후처리 하고 조건으로 간다.*/
            }
            System.out.println(i);
        }
    }
}
