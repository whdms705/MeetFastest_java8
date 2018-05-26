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

}
