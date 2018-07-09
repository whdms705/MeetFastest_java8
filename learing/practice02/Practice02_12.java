package MeetFastest_java8.learing.practice02;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/*
 * @Content :  "2.13 ���� ��Ʈ��" ������ ������ ��ó�� AtomicInteger �迭�� ������Ʈ�ϴ� ������� 
 * 				���� Stream<String>�� �ִ� ��� ª�� �ܾ��� ������ ����.
 * 				�� ī���͸� �����ϰ� ������Ű�� ���� ������ �޼����� getAndIncrement�� ����Ѵ�.
 * 
 */
public class Practice02_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<String> list = new ArrayList<String>();
		 list.add("qwwewewe");
		 list.add("qwwewewe233");
		 list.add("qww");
		 list.add("qwwwe");
		 list.add("qw2");
		 
		 Stream<String> words = list.stream();
		 AtomicInteger ai = new AtomicInteger();
		 words.parallel().forEach(s -> {
			 if(s.length()<4) ai.getAndIncrement();
		 });
		 
		 System.out.println(ai.get());
	}

}
