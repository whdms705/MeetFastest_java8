package MeetFastest_java8.learing.practice02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * ó��5�� �� �ܾ ��û���� �� �ϴ� �� �ܾ 5�� �߰��ϰ� ���� filter �޼��带 ȣ������ ������ Ȯ��
 * �����ϰ� �� �޼��� ȣ���� ����϶�.
 */
public class Practice02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("sccs");
		list.add("css");
		list.add("sdsddssd");
		list.add("dssdsdsdsdsd");
		list.add("dssdsdsdsdsdssss");
		list.add("dssdsdsdsdsddssdsdsd");
		
		Stream<String> words = list.stream();
		System.out.println();
		
		
		long total = words.filter(w -> w.length()>6).limit(3)
									.peek(w -> System.out.println("mid : "+w))
										.count();
		

	}

}
