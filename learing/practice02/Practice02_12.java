package MeetFastest_java8.learing.practice02;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/*
 * @Content :  "2.13 병렬 스트림" 절에서 설명한 것처럼 AtomicInteger 배열을 업데이트하는 방법으로 
 * 				병렬 Stream<String>에 있는 모든 짧은 단어의 개수를 세라.
 * 				각 카운터를 안전하게 증가시키기 위해 원자적 메서드인 getAndIncrement를 사용한다.
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
