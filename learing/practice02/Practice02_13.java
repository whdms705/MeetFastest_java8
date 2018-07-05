package MeetFastest_java8.learing.practice02;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Practice02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		 list.add("qwwewewe");
		 list.add("qwwewewe233");
		 list.add("qww");
		 list.add("qwwwe");
		 list.add("qw2");
		 
		 Map<String,Long> cnt = list.stream()
				 				.filter(s -> s.length()>4)
				 				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 
		 System.out.println(cnt);
		 
		 
	}

}
