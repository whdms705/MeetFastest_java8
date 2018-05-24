package MeetFastest_java8.learing.learn02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Person{
	Integer id;
	String name;
	public Person(String name,Integer id) {
		this.id=id;
		this.name=name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}


public class Sub10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(new Person("John", 20), new Person("Sara", 22),new Person("Jane", 21), new Person("Greg", 35));
		
		/*Arrays.asList("a", "b", "c")
        .stream()
        .map(Function.identity()) // <- This,
        .map(str -> str)          // <- is the same as this.
        .collect(Collectors.toMap(
                     Function.identity(), // <-- And this,
                     str -> str));      
*/
		
		
		Map<Integer, String> map1 = people.stream().collect(
				Collectors.toMap(Person::getId, Person::getName)
				);
		
		System.out.println(map1.toString());
		//output: {35=Greg, 20=John, 21=Jane, 22=Sara}   
		
		
		//Function.identity()는 실제 요소값을 가져온다는데 확인해봄
		Map<Integer, Person> map2 = people.stream().collect(
				Collectors.toMap(Person::getId, Function.identity())
				);
		
		System.out.println(map2.toString());
		//output: {35=MeetFastest_java8.learing.learn02.Person@214c265e, 20=MeetFastest_java8.learing.learn02.Person@448139f0, 21=MeetFastest_java8.learing.learn02.Person@7cca494b, 22=MeetFastest_java8.learing.learn02.Person@7ba4f24f}
				

	}

}

//참고사이트 
//https://pparkhyung.gitbooks.io/2016/content/java8_functional.html
//Function.identity ()
//https://code.i-harness.com/ko/q/1abbf3b