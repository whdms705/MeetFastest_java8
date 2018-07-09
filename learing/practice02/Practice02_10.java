package MeetFastest_java8.learing.practice02;

import java.util.ArrayList;

public class Practice02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(1.12);
		list.add(2.42);
		list.add(6.12);
		list.add(10.11);
		
		long count = list.stream().count();
		Double result = list.stream().reduce(0.0, (a,b) -> a+b);
		System.out.println("result : "+result/list.size());
		//https://stackoverflow.com/questions/23658956/finding-average-using-reduce-and-collect
	}

}
