package MeetFastest_java8.learing.practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Stream.of(values)�� �����?
 * int ��Ʈ���� ��� ������ �ִ���
 */
public class Practice02_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {1,4,9,16};
		Stream<int[]> s1 = Stream.of(values);
		
		List<int[]> l = new ArrayList<int[]>();
		
		//int Stream���� �ޱ�
		IntStream s2 = IntStream.of(values);
		System.out.println("s1 : "+s1);
		s2.forEach(s -> System.out.println(s));
		
	}

}
