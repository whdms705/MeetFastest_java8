package MeetFastest_java8.learing.practice02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * 처음5개 긴 단어를 요청했을 때 일단 긴 단어를 5번 발견하고 나면 filter 메서드를 호출하지 않음을 확인
 * 간단하게 각 메서드 호출을 기록하라.
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
