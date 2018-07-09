package MeetFastest_java8.learing.practice02;


import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

/*  
 * @Content : 연습문제 12를 다시 풀되 , 이번에는 짧은 문자열을 걸러내고 Collect 메서드를
 * 			Collectots.groupingBy, Collectors.counting과 조합해 사용하라.
 */

public class Practice02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("qwqwer");
		list.add("asdfqwer");
		list.add("sddswee");
		list.add("asd1");
		list.add("q123");
		
		//Function.identity()
		Map<String,Long> cnt = list.stream()
				.collect(Collectors.groupingBy(s -> { if(s.length()>4){
					return s;	
				}else{
					return "";
				}
				},Collectors.counting()));
		
		/*int n =list.stream()
		.filter(s -> s.length()>4)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.size();*/
		
		
		
		System.out.println(cnt);
	}

}
