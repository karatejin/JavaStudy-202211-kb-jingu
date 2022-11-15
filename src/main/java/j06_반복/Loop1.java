package j06_반복;

public class Loop1 {

    public static void main(String[] args) {

        int n = 10;
        //int j =20;

        for(int i = 0; i < n; i++){ /* 0 부터 9 까지 10번 반복해*/
            System.out.print(i);
            if(i < n-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        /*for(int k =10; k < j; k++){
            System.out.print(k);
            if (k < j-1){
                System.out.print(", ");
            }
        }*/
        System.out.println();

        for (int i =10; i > 0; i--){
            System.out.print(i);
            if (i < n +1){
                System.out.print(", ");
            }
        }
        System.out.println();

       /* for(int k =20; k > 10; k--){
            System.out.print(k);
            if (k < j+1){
                System.out.print(", ");
            }
        }*/
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<선생님꺼>>>>>>>>>>>>>>>");

        for(int i = 0; i < n; i++){
            System.out.print(i +10);
            if(i < n-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(n-i);
            if(i < n-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(n-i +10);
            if(i < n-1) {
                System.out.print(", ");
            }
        }


        System.out.println();
        for(int i = 0, j=n; i < n; i++, j--){
            System.out.println(i);
            System.out.println(j);
        }

    }
}
