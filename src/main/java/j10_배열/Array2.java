package j10_배열;

public class Array2 {
        /*
        names 라는 배열을 생성하고
        임지현,
        신경수
        고희주
        문승주
        장건녕
        위의 값을 순서대로 대입한다.

        이름1: 임지현
        이름2: 신경수
        이름3: 고희주
        이름4: 문승주
        이름5: 장건녕

         */
        public static void main(String[] args) {

            String[] names = new String [5]; /*[5]배열의 크기*/

            names[0] ="임지현";
            names[1] ="신경수";
            names[2] ="고희주";
            names[3] ="문승주";
            names[4] ="장건녕";

            for (int i=0; i< names.length; i++){  /*names.length; 배열의 크기 */
                System.out.println("이름"+(i+1)+": " + names[i]);
            }
    }
}
