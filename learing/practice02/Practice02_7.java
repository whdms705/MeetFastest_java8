package MeetFastest_java8.learing.practice02;

import java.util.stream.IntStream;



/*
 * 
 * 
 */

public class Practice02_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ��Ʈ�� ����
		IntStream.iterate(0, i -> i + 1)
        .forEach(System.out::println);
	}

}
