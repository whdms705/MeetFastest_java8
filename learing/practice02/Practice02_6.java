package MeetFastest_java8.learing.practice02;

import java.util.stream.IntStream;

/*
 * ��Ʈ���� ����� �� �� ��¥�� �޼���� �ۼ��϶�
 * �Ѱ��� ���ٹ��� 0 ~ length()-1 �������� ���� ��Ʈ���� ���� �޼��� ���۷����� �����ϴ� ��
 */
public class Practice02_6 {

	public static void main(String[] Practice02_6) {
		// TODO Auto-generated method stub
		 String s = "password123";

		 //�Ϲ����� ���
		 /*Stream<Character> character = s.chars()
                .mapToObj(x -> (char) x);//Stream<Character>
         */
		 
		 //�������� ������ ���
		 IntStream.rangeClosed(0,s.length()-1).mapToObj(s::charAt).forEach(System.out::println);;

		 /* range vs rangeClosed�� ������   
		 IntStream result = IntStream.range(0, 5); 
		 IntStream result = IntStream.rangeClosed(1, 5);*/	
		 
		 /*01. range
		  * for (int i = startInclusive; i < endExclusive ; i++) { ... }
		  * 
		  */
		 
		 /*01. rangeClosed
		  * for (int i = startInclusive; i <= endExclusive ; i++) { ... }
		  * 
		  */
		 
	}
	
	

}
