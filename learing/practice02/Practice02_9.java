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
			parentList.add(childList);
		}
		Stream<ArrayList<Integer>> s = parentList.stream();
		
		
		//1�� ����
		Optional<ArrayList<Integer>> result1 = s.reduce((a,b) ->{
			Iterator<Integer> iterator = b.iterator();
		    while (iterator.hasNext()) {
		        a.add(iterator.next());
		    }
		    return a;
		});
		
		for(Integer i : result1.get()){
			System.out.println(i);
		}
		
		//2�� ����
		/*ArrayList<Integer> result2 = s.reduce(new ArrayList<Integer>(),(a,b) ->{
			Iterator<Integer> iterator = b.iterator();
		    while (iterator.hasNext()) {
		        a.add(iterator.next());
		    }
		    return a;
		});
		
		for(Integer i : result2){
			System.out.println(i);
		}*/
		
		
		//3�� ����  reduce(identity,accumulator,combiner)
		/*identity - �ʱⰪ
		accumulator - ���� �������� ��Ʈ���� ��ҿ� ������ ����
		combiner - ����ó���� ����� ��ġ�µ� ����� ����(���� ��Ʈ��)*/
		
		/*ArrayList<Integer> result3 = s.reduce(new ArrayList<Integer>(),(a,b) ->{
			a.addAll(b);
		    return a; },
		    (a,b) ->{
				a.addAll(b);
			    return a;
		});
		
		for(Integer i : result3){
			System.out.println(i);
		}*/
		

	}

}
