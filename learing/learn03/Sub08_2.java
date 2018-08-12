package MeetFastest_java8.learing.learn03;

/*
 * @Content : 람다식에서 예외처리 
 * 				Sub08_2는 스레드내에서 예외가 발생하며 예외처리가 안된다.
 */

public class Sub08_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		orderAsync(()->{
			String test1 = "qwer";
			int result = Integer.parseInt(test1);
			System.out.println(result);
		},()->{
			String test1 = "123";
			int result = Integer.parseInt(test1);
			System.out.println(result);
		});
	}
	
	public static void orderAsync(Runnable num1,Runnable num2) {
		// try 구문 내에 예외발생 경우가 없다.
		//first.run()을 하는건  스레드가 하는거지, orderAsync가 아니다.
		//출저 : http://ghksgp92.tistory.com/125
		
			Thread t = new Thread() {
				public void run() {
					num1.run();
					num2.run();
				}
			};
		
		
	}

}
