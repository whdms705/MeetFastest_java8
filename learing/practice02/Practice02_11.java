package MeetFastest_java8.learing.practice02;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
