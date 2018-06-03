package MeetFastest_java8.learing.learn02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


/*
 * ���ɽ�Ʈ�� ���꿡�� ������ �� "��������"
 * ���� ��Ʈ������ ���� ������ ������ �� ��(parallel) �����ڿ�(�迭, ��ü)�� ���ÿ� ����� ������ ���� ����
 * ���� ���ϴ� ��찡 �����. 
 */
public class Sub13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		
		
		// ���ϴ� ����� ������ ���� ��츦 �����ϱ� ���� 200�� ����!
		int count = 0;
		while(count<200){
			int[] shortWords = new int[12];//�����ڿ�
			Stream<String> words = wordList.stream();
			words.parallel().forEach(
						s -> {
								if(s.length() < 12){
									shortWords[s.length()]++;
							}
						}
					);
			count++;
			System.out.println(Arrays.toString(shortWords));
		}
		
		

	}

}
