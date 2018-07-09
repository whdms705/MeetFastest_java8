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
		String[] arr1 = {"3232","sdsdsd","ddw","12sdsd","123ccxxc"};
		String[] arr2 = {"1111","zxzx","bgbg","dddd","32972397"};
		String[] arr3 = {"33333","332","33212","3326565","33244444"};
		Stream<String> arrList1 = Stream.of(arr1);
		Stream<String> arrList2 = Stream.of(arr2);
		
		//List<String[]> list = Stream.of(arr1,arr2).collect(Collectors.toList());
		
		//이는 떨어진 위치에는 병행 set 연산은 스레드에 안전하기 때문이다. 이게 무슨 말일까?
		//01. concat을 이용해서 합치기
		List<String> result1 = Stream.concat(arrList1, arrList2).collect(Collectors.toList());
		//02. flatMap을 이용해서 합치기
		List<String> result2 = Stream.of(arr1,arr2,arr3).flatMap(Arrays::stream).collect(Collectors.toList());
		
		
		for(String s : result2){
			System.out.format("%s", s);
			System.out.println();
		}
		
	}

}
