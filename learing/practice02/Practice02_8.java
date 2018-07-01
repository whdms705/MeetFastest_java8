package MeetFastest_java8.learing.practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class User{
	String data;

	public User(String data){
		this.data=data;
	}
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}

public class Practice02_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> myList1 = new ArrayList<User>();
		myList1.add(new User("a1"));
		myList1.add(new User("a2"));
		myList1.add(new User("a3"));
		myList1.add(new User("a4"));
		myList1.add(new User("a5"));
		
		ArrayList<User> myList2 = new ArrayList<User>();
		myList2.add(new User("b1"));
		myList2.add(new User("b2"));
		myList2.add(new User("b3"));
		
		Stream<User> first = myList1.stream();
		Stream<User> second = myList2.stream();
		Stream<User> result = zip(first,second);
		//result.forEach(User::getData);
	}
	
	public static Stream<User> zip(Stream<User> first,Stream<User> second){//second.iterator().next().data
		
		/*List<User> temp = */first
								.map(f -> second.iterator().next().getData())
								.forEach(System.out::print);

		//temp.stream().forEach(System.out::print);
		return null;
	}

}
