package MeetFastest_java8.learing.learn03;


/*
 * @Content : ���ٽĿ��� ����ó�� 
 * 				Sub08_1�� ������ ���� �����峻���� ���ܹ߻��� �Ȱ��� �ƴ�(ȣ���ڰ� ó���� �� �ֱ� ������)
 * 				���������� ����ó���� ������ ���
 * 				(Sub08_2)���������� ���� �����峻������ ����ó���� �ȵȴ� �����ϸ� ����
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
