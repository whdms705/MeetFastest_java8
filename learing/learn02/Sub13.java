package MeetFastest_java8.learing.learn02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


/*
 * 병령스트림 연산에서 주의할 점 "경쟁조건"
 * 병령 스트림에서 다중 스레드 연산을 할 때(parallel) 공유자원(배열, 객체)을 동시에 변경시 원하지 않은 값을
 * 얻지 못하는 경우가 생긴다. 
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

		
		
		// 원하는 결과가 나오지 않은 경우를 재현하기 위해 200번 돌림!
		int count = 0;
		while(count<200){
			int[] shortWords = new int[12];//공유자원
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
