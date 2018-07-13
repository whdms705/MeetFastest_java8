package MeetFastest_java8.learing.learn03;

import java.util.function.Consumer;


/*
 * @Content : ���ٽĿ��� ����ó�� 
 * 				Sub08_3 ó���� handler�� �̿��� �ΰ��� �����尡 ��� ����ǵ��� ó��
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
