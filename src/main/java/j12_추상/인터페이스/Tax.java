package j12_추상.인터페이스;
    /*
    연말정산
    */

public class Tax implements Calculator{ /*추상 메소드를 포함하기 때문에 추상클래스로 만들어야 한다.*/
                                        /* 또는 오버라이드*/

    @Override
    public int calc(int[] value) {
        System.out.println("연말정산을 진행합니다.");
        int result = 0;
        for (int i = 0; i < value.length; i++){
            result += (value[i]);
        }
        return result;
    }

}
