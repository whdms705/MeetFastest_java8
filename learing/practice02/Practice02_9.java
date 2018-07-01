package MeetFastest_java8.learing.practice02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * @Content : Stream<ArrayList<T>>�� �ִ� ��� ��ҵ��� ArrayList<T>�ϳ��� ����
 * 				reduce�� ������ ���¸� �̿��� �۾��� �����ϴ� ����� ������.
 * 
 */

public class Practice02_9 {

	public static void main(String[] args) {
		// TODO Auto-generaArrayList<E>d stub
		ArrayList<ArrayList<Integer>> parentList = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<5;i++){
			ArrayList<Integer> childList = new ArrayList<Integer>();
			childList.add(i);
			childList.add(i+1);
			//childList.add
			parentList.add(childList);
		}
		
		Stream<ArrayList<Integer>> s = parentList.stream();
		ArrayList<Integer> result = s.reduce(new ArrayList<Integer>(),(a,b) ->{
			Iterator<Integer> iterator = b.iterator();
		    while (iterator.hasNext()) {
		        a.add(iterator.next());
		    }
		    return a;
		});
		
		for(Integer i : result){
			System.out.println(i);
		}
		
		
		
		

	}

}
