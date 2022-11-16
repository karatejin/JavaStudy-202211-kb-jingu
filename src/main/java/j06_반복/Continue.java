package j06_반복;

public class Continue {
    public static void main(String[] args) {
        int count = 0;

        while(true) {
            count++;
            System.out.println("나무를" + count + "번 찍습니다.");
            if(count < 10){ /*10이 되면 거짓*/
                continue; /*if 참이면 다음 반복으로 넘어가라*/
            }
            System.out.println("나무가 넘어갑니다."); /*참인 동안 실행이 안된다.*/
            break; /*거짓 발동 반복 끝*/
        }
    }
}
