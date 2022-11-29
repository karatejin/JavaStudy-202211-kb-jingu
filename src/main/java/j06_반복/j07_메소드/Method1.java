package j06_반복.j07_메소드;

public class Method1 {

    public static void  method1(){ /*void return 이 없지롱*/
        System.out.println("메소드1 호출");
        System.out.println();
        method2(100);
    }
    
    public static void  method2(int a){ /*메소드 1 호출 뒤 메소드 2 호출*/
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a: " +a);
        System.out.println();
    }

    public static int  method3(int a, int b){
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a: " +a);
        System.out.println("매개변수 b: " +b);
        System.out.println("a+b = " + (a+b));
        System.out.println();
        return a+b;
    }
    public static int method4(int a, int b){
        int result = 0;

        if(a<b){
            result = b; /*리턴을 만나면 메소드 탈출 다음 문장은 실행 안됨*/
        }else{ /*a가 클떄 a 출력 및 탈줄*/
            result  = a;
        }
        return result;
    }


    public static void main(String[] args) { /*start here*/
        method1(); /*메소드 콜*/ /*먼저 입력한 메소드를 찾아간다.*/
        System.out.println("메소드1 호출 후 출력");
        method2(10);
        int result1=method3(3000,7000);
        System.out.println("result1 : " + result1);

    }
}
