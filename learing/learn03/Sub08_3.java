package MeetFastest_java8.learing.learn03;

import java.util.function.Consumer;


/*
 * @Content : 람다식에서 예외처리 
 * 				Sub08_3 처리기 handler를 이용해 두개의 스레드가 모두 싱행되도록 처리
 */

public class Sub08_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		orderAsyncSoltion(()->{
			String test1 = "qwer";
			int result = Integer.parseInt(test1);
			System.out.println(result);
		},()->{
			String test1 = "123";
			int result = Integer.parseInt(test1);
			System.out.println(result);
		},(e)->{
			System.out.println("Exception : "+e);
		});
	}
	
	public static void orderAsyncSoltion(Runnable num1,Runnable num2,Consumer<Throwable> handler) {
		Thread t = new Thread() {
			public void run() {
				try {
					num1.run();
				}catch(Exception e) {
					handler.accept(e);
				}
				
				try {
					num2.run();
				}catch(Exception e) {
					handler.accept(e);
				}
			}
			
		};
		
		t.start();
		
	}

}
