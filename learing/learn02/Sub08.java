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
	
	//Optional로 자동차 보험회사 이름 찾기 example01
	public String getCarInsuranceName(Optional<Person1> person){
		return person.flatMap(Person1::getCar)
					.flatMap(Car::getInsurance)
					.map(Insurance::getName)
					.orElse("Unknown");
	}
	
	//두 Optional 합치는 example02
	
	//Person과 Car 정보를 이용하여 가장 저렴한 보험료를 제공하는 메서드있다고 가정(findCheeapestInsurance)
	public Insurance findCheeapestInsurance(Person1 person,Car car){
		//... 비지니스 로직이 있다고 가정	
		return null;
	}
	
	//두 Optional 합치는 방식 01
	//전달한 값중에 하나라도 빈값이 있으면 빈 Optional 리턴
	public Optional<Insurance> nullSafeFindCheapestInsurance01(Optional<Person1> person,Optional<Car> car){
		if(person.isPresent() && car.isPresent()){
			return Optional.of(findCheeapestInsurance(person.get(),car.get()));
		}else{
			return Optional.empty();
		}
	}
	
	//두 Optional 합치는 방식 02
	//전달한 값중에 하나라도 빈값이 있으면 빈 Optional 리턴
	public Optional<Insurance> nullSafeFindCheapestInsurance02(Optional<Person1> person,Optional<Car> car){
		return person.flatMap(p -> car.map(c ->findCheeapestInsurance(p,c) ));
	}

}
