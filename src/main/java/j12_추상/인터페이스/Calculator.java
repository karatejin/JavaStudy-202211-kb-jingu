package j12_추상.인터페이스;
/*
    1. 모든 메소드 는 기본적으로 추상메서드 이다.
    2. 변수는 선언할 수 없다.
    3. 상수는 선언할 수 있다. (기본적으로 모든 변수선언은 상수로 선언된다)
    4. 일반 메소드를 선언하고 싶으면 abstract 대신에 default 키워드를 사용한다.
     */

public interface Calculator { /* 인터페이스 추상클래스와는 다르다. */

        public int ERROR_CODE= -9999999;
        public int calc(int[]value);

        //public  Calculator(){} /*생성자 불가*/

        public default void setErrorCode(){
           /*ERROR_CODE= 10; 이런식을 못한다.*/

        }

}
