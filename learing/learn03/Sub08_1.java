package MeetFastest_java8.learing.learn03;


/*
 * @Content : 람다식에서 예외처리 
 * 				Sub08_1의 예제의 경우는 스레드내에서 예외발생이 된것이 아닌(호출자가 처리할 수 있기 때문에)
 * 				정상적으로 예외처리가 가능한 경우
 * 				(Sub08_2)다음예제를 보고 스레드내에서는 예외처리가 안된다 생각하면 편함
 */

public class Sub08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			order(()->{
				String test1 = "qwer";
				int result = Integer.parseInt(test1);
				System.out.println(result);
			},()->{
				String test1 = "123";
				int result = Integer.parseInt(test1);
				System.out.println(result);
			});
		}catch(Exception e) {
			System.out.println(e);
		}

	}
	
	public static void order(Runnable num1,Runnable num2) {
		num1.run();
		num2.run();
	}

}
