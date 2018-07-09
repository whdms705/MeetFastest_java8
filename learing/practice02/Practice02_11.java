package MeetFastest_java8.learing.practice02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * @Content : 여러 ArrayList를 병합하는 대신 리스트안에 스트림 결과들을 동시에 모을 수 있어야한다.
 * 				이는 떨어진 위치에는 병행 set 연산은 스레드에 안전하기 때문이다.
 * 				이 작업을 어떻게 할 수 있는가?
 */

public class Practice02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> i = Stream.of(1,2,3);
	      Stream<Integer> j = Stream.of(4,5,6);
	      
	      List<Integer> q = Stream.concat(i,j).collect(Collectors.toList());
	      List<Integer> q1 = Stream.of(i,j).reduce(Stream::concat).orElseGet(Stream::empty).collect(Collectors.toList());
	      List<Integer> q2 = Stream.of(i,j).flatMap(s->s).collect(Collectors.toList());
	      
	      q2.forEach(System.out::println);
	}

}
