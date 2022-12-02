package j20_함수형인터페이스;

public class Main1 {

	public static void main(String[] args) {
		int a = 10;
		
		Runnable application1 = (/*매개변수를 주지 않았다*//*매개변수가 없기때문에 괄호 생략 불가. 하나 있을때만 생략가능*/) -> { /*메소드 안에서 메소드를 정의*/ /*메소드 정의하는 부분*/
			System.out.println("프로그램을 시작합니다.");
			System.out.println("a:" + a);
		};
		
		application1.run();
		
		
//		Runnable timer = () -> {
//			for(int i =0; i<100; i++) {
//				try {
//					System.out.println(i + " : " + (i+1));
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {					
//					e.printStackTrace();
//				}				
//			}
//		};
		
		Thread t1 = new Thread(() -> {
			for(int i =0; i<100; i++) {
				try {
					System.out.println("채팅기능");
					System.out.println(i + " : " + (i+1));
					Thread.sleep(100);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}				
			}
		});

		Thread t2 = new Thread(() -> {
			for(int i =0; i<100; i++) {
				try {
					System.out.println("알림기능");
					System.out.println(i + " : " + (i+1));
					Thread.sleep(100);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}				
			}
		});
		
		t1.start();/*run메소드 실행*/ /*실행문을 던지고*/
		t2.start(); /*여기로 온다.*/  /*비동기 처리*/ /*비동기 처리를 해야할때와 안해야 할때를 알고 사용해야한다.*/
		
	}

}
