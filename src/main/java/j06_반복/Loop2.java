package j06_반복;

public class Loop2 {

    public static void main(String[] args) {
        /*
         [2단]
         2x1 =2
         2x2 =4
         2x3 =6
         ...
         2x9 = 18
         */

        int dan = 2;

        for(int k =0; dan<10; dan++){
            System.out.println("["+dan+"단]");
            for( int i = 0; i <9; i++){
                int num = i + 1;
                System.out.println( dan +"x"+ num + "=" + (dan * num));
            }
        }

        /*for (int dan = 0; dan < 10; dan++) {
            System.out.println("[" + dan + "단]");
            for (int i = 0; i < 9; i++) {
                int num = i + 1;
                System.out.println(dan + "x" + num + "=" + (dan * num));
            }
        }*/
        System.out.println("=============================");
        /*for (int i = 0; i < 8; i++) {
            int dan = i + 2;
            System.out.println("[" + dan + "단]");
            for (int j = 0; j < 9; j++) {
                int num = j + 1;
                System.out.println(dan + "x" + num + "=" + (dan * num));
            }
        }*/


    }
}
