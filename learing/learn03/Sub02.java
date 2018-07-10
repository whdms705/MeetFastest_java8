package MeetFastest_java8.learing.learn03;

import java.util.function.IntConsumer;

public class Sub02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		repeat1(10,i -> System.out.println("Countdown : "+(9-i)));
		
		
		repeat2(10,()->System.out.println("hello, world! "));

	}
	
	public static void repeat1(int n , IntConsumer action) {
		for(int i=0;i<n;i++) action.accept(i);
	}
	
	
	public static void repeat2(int n,Runnable action) {
		for(int i=0;i<n;i++) action.run();
	}

}
