package MeetFastest_java8.learing.practice02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * @Content : ���� ArrayList�� �����ϴ� ��� ����Ʈ�ȿ� ��Ʈ�� ������� ���ÿ� ���� �� �־���Ѵ�.
 * 				�̴� ������ ��ġ���� ���� set ������ �����忡 �����ϱ� �����̴�.
 * 				�� �۾��� ��� �� �� �ִ°�?
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
		
		//�̴� ������ ��ġ���� ���� set ������ �����忡 �����ϱ� �����̴�. �̰� ���� ���ϱ�?
		//01. concat�� �̿��ؼ� ��ġ��
		List<String> result1 = Stream.concat(arrList1, arrList2).collect(Collectors.toList());
		//02. flatMap�� �̿��ؼ� ��ġ��
		List<String> result2 = Stream.of(arr1,arr2,arr3).flatMap(Arrays::stream).collect(Collectors.toList());
		
		
		for(String s : result2){
			System.out.format("%s", s);
			System.out.println();
		}
		
	}

}
