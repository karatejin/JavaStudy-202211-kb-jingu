package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList2 {
    public static void main(String[] args) {
        List<Hobby> hobbyList = Arrays.asList (new Hobby[] {
                new Hobby(1,"축구"),
                new Hobby(2,"농구"),
                new Hobby(3,"골프"),
                new Hobby(4,"음악감상")});

       // String[]names = new String []{"김준일","김준이","김준삼"};

        List<String> nameList = Arrays.asList(new String[]{ /*배열을 ArrayList로 변환 그것이 asList*/
                "김준일",
                "김준이",
                "김준삼"});

        for(Hobby h : hobbyList){
            System.out.println(h);
        }

        Object[] nameArray = nameList.toArray(); /*배열을 통으로 다운 캐스팅 하는 것이 아니다.*/

        System.out.println((String)nameArray[0]); /*안에서 해라.*/

       // nameList = Arrays.asList(names); /*이름을 넣으면 asList로 바꿔준다.*/

    }
}
