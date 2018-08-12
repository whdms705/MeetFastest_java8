package MeetFastest_java8.learing.learn03;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Sub08_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		orderAsyncSoltion2(()->{
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
	
	public static void orderAsyncSoltion2(Supplier<T> num1,Consumer<T> num2,Consumer<Throwable> handler) {
		Thread t = new Thread() {
			public void run() {
				try {
					T result = 
					num1.run();
					num2.run();
				}catch(Throwable e) {
					handler.accept(e);
				}
				
			}
			
		};
		
		t.start();
		
	}

}
