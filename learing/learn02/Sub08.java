package MeetFastest_java8.learing.learn02;

import java.util.Optional;

class Person1{
	private Optional<Car> car;
	public Optional<Car> getCar(){return car;}
}

class Car {
	private Optional<Insurance> insurance;
	public Optional<Insurance> getInsurance(){return insurance;}
}

//Insurance 클래스에 name은 Optional로 감싸지 않은 것은 name은 필수값이기 때문이다.
//필수값까지 Optional감싸는 것은 문제점의 발견가능성까지 감추는것이기 때문에 좋지 않다.
//Optional는 있을수도 없을수도 있는 값에!!
class Insurance {
	private String name;
	public String getName(){return name;}
}


//java8 optional example
//자세한 예제 소스를 위해 "java8 in action" 내용으로 정리함
public class Sub08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
