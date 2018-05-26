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

//Insurance Ŭ������ name�� Optional�� ������ ���� ���� name�� �ʼ����̱� �����̴�.
//�ʼ������� Optional���δ� ���� �������� �߰߰��ɼ����� ���ߴ°��̱� ������ ���� �ʴ�.
//Optional�� �������� �������� �ִ� ����!!
class Insurance {
	private String name;
	public String getName(){return name;}
}


//java8 optional example
//�ڼ��� ���� �ҽ��� ���� "java8 in action" �������� ������
public class Sub08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	//Optional�� �ڵ��� ����ȸ�� �̸� ã�� example01
	public String getCarInsuranceName(Optional<Person1> person){
		return person.flatMap(Person1::getCar)
					.flatMap(Car::getInsurance)
					.map(Insurance::getName)
					.orElse("Unknown");
	}
	
	//�� Optional ��ġ�� example02
	
	//Person�� Car ������ �̿��Ͽ� ���� ������ ����Ḧ �����ϴ� �޼����ִٰ� ����(findCheeapestInsurance)
	public Insurance findCheeapestInsurance(Person1 person,Car car){
		//... �����Ͻ� ������ �ִٰ� ����	
		return null;
	}
	
	//�� Optional ��ġ�� ��� 01
	//������ ���߿� �ϳ��� ���� ������ �� Optional ����
	public Optional<Insurance> nullSafeFindCheapestInsurance01(Optional<Person1> person,Optional<Car> car){
		if(person.isPresent() && car.isPresent()){
			return Optional.of(findCheeapestInsurance(person.get(),car.get()));
		}else{
			return Optional.empty();
		}
	}
	
	//�� Optional ��ġ�� ��� 02
	//������ ���߿� �ϳ��� ���� ������ �� Optional ����
	public Optional<Insurance> nullSafeFindCheapestInsurance02(Optional<Person1> person,Optional<Car> car){
		return person.flatMap(p -> car.map(c ->findCheeapestInsurance(p,c) ));
	}

}
