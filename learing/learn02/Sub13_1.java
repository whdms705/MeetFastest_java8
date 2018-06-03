package MeetFastest_java8.learing.learn02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


/*
 * ���ɽ�Ʈ�� ���꿡�� ������ �� "���ر���"
 * ���� ��Ʈ������ ���� ������ ������ �� ��(parallel) �����ڿ�(�迭, ��ü)�� ���ÿ� ����� ������ ���� ����
 * ���� ���ϴ� ��찡 �����. 
 */
public class Sub13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ر��� Example
		List<String> wordList = new ArrayList<String>();
		wordList.add("aaaaaaaaaaaaaaaaa");
		wordList.add("xxxxxxxx");
		wordList.add("xxxxxxss");
		wordList.add("sssssssssssssss");
		wordList.add("ssssssss");
		wordList.add("qqqqqqqqqqqqqwqw");
		wordList.add("wsdsd");
		wordList.add("xc");
		wordList.add("dsdsdds");
		
		
		Stream<String> words = wordList.stream();
		//Case1 �������� ���
		/*wordList.add("End");
		Long n = words.distinct().count();
		System.out.println("result : "+n);*/
		
		//Case2 ���ر����� �ɸ��� ���
		words.forEach(
				s -> {
						if(s.length() < 12){
							wordList.remove(s);
					}
				}
			);
	}

}
