package MeetFastest_java8.learing.practice02;

import java.util.stream.IntStream;

/*
 * 스트림에 기반을 둔 한 행짜리 메서드로 작성하라
 * 한가지 접근법은 0 ~ length()-1 범위에서 정수 스트림을 만들어서 메서드 레퍼런스에 맵핑하는 것
 */
public class Practice02_6 {

	public static void main(String[] Practice02_6) {
		// TODO Auto-generated method stub
		 String s = "password123";

		 //일반적인 방법
		 /*Stream<Character> character = s.chars()
                .mapToObj(x -> (char) x);//Stream<Character>
         */
		 
		 //문제에서 제시한 방법
		 IntStream.rangeClosed(0,s.length()-1).mapToObj(s::charAt).forEach(System.out::println);;

		 /* range vs rangeClosed의 차이점   
		 IntStream result = IntStream.range(0, 5); 
		 IntStream result = IntStream.rangeClosed(1, 5);*/	
		 
		 /*01. range
		  * for (int i = startInclusive; i < endExclusive ; i++) { ... }
		  * 
		  */
		 
		 /*01. rangeClosed
		  * for (int i = startInclusive; i <= endExclusive ; i++) { ... }
		  * 
		  */
		 
	}
	
	

}
