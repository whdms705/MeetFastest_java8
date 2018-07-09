package MeetFastest_java8.learing.practice02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * @Content : Stream<ArrayList<T>>에 있는 모든 요소들을 ArrayList<T>하나로 결합
 * 				reduce의 세가지 형태를 이용해 작업을 수행하는 방법을 보여라.
 * 
 */

public class Practice02_9 {

	public static void main(String[] args) {
		// TODO Auto-generaArrayList<E>d stub
		//1. list setting
		ArrayList<ArrayList<Integer>> parentList = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<5;i++){
			ArrayList<Integer> childList = new ArrayList<Integer>();
			childList.add(i);
			System.out.println(i);
			childList.add(i+1);
			System.out.println(i+1);
			parentList.add(childList);
		}
		System.out.println("============================");
		//2. reduce setting
		Stream<ArrayList<Integer>> s = parentList.stream();
		
		/*Optional<ArrayList<Integer>> result = s.reduce((a,b) -> {
			a.addAll(b);
			return a;
		});
		
		
		for(Integer i : result.get()){
			System.out.println(i);
		}*/
		
		/*ArrayList<Integer> result = s.reduce(new ArrayList<Integer>(),(a,b) ->{
			
			Iterator<Integer> iterator = b.iterator();
		    while (iterator.hasNext()) {
		        a.add(iterator.next());
		    }
		    return a;
		});
		
		for(Integer i : result){
			System.out.println(i);
		}
		
		*/
		
		ArrayList<Integer> result = s.reduce(new ArrayList<Integer>(), (a,b) -> {a.addAll(b); return a;},(a,b) -> {a.addAll(b); return a;});
		
		for(Integer i : result){
			System.out.println(i);
		}
		
		
		

	}

}
