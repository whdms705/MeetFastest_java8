package MeetFastest_java8.learing.learn03;

/*
 * @Content : ���ٽĿ��� ����ó�� 
 * 				Sub08_2�� �����峻���� ���ܰ� �߻��ϸ� ����ó���� �ȵȴ�.
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
		// try ���� ���� ���ܹ߻� ��찡 ����.
		//first.run()�� �ϴ°�  �����尡 �ϴ°���, orderAsync�� �ƴϴ�.
		//���� : http://ghksgp92.tistory.com/125
		
			Thread t = new Thread() {
				public void run() {
					num1.run();
					num2.run();
				}
			};
		
		
	}

}
