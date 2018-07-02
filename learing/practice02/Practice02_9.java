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
		ArrayList<ArrayList<Integer>> parentList = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<5;i++){
			ArrayList<Integer> childList = new ArrayList<Integer>();
			childList.add(i);
			childList.add(i+1);
			parentList.add(childList);
		}
		Stream<ArrayList<Integer>> s = parentList.stream();
		
		
		//1번 형태
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
		
		//2번 형태
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
		
		
		//3번 형태  reduce(identity,accumulator,combiner)
		/*identity - 초기값
		accumulator - 이전 연산결과와 스트림의 요소에 수행할 연산
		combiner - 병렬처리된 결과를 합치는데 사용할 연산(병렬 스트림)*/
		
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
