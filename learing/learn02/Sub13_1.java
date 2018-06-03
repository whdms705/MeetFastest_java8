package MeetFastest_java8.learing.learn02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


/*
 * 병령스트림 연산에서 주의할 점 "방해금지"
 * 병령 스트림에서 다중 스레드 연산을 할 때(parallel) 공유자원(배열, 객체)을 동시에 변경시 원하지 않은 값을
 * 얻지 못하는 경우가 생긴다. 
 */
public class Sub13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 방해금지 Example
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
		//Case1 정상적인 경우
		/*wordList.add("End");
		Long n = words.distinct().count();
		System.out.println("result : "+n);*/
		
		//Case2 방해금지에 걸리는 경우
		words.forEach(
				s -> {
						if(s.length() < 12){
							wordList.remove(s);
					}
				}
			);
	}

}
