package MeetFastest_java8.learing.practice05;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Practice07 {

	static LocalDate checkDate= LocalDate.now(); 
	static int[] timeArr = new int[24];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ð��� �Է��ϼ���");
		System.out.println("���۽ð��� �Է��ϼ���");
		//int sTime = sc.nextInt();
		
		System.out.println("�����ð��� �Է��ϼ���");
		//int eTime = sc.nextInt();
		
		LocalTime start1 = LocalTime.of(11, 00);
		LocalTime end1 = LocalTime.of(14, 00);
		
		LocalTime start2 = LocalTime.of(10, 00);
		LocalTime end2 = LocalTime.of(13, 00);
		
		TimeInternal(start1,end1);
		TimeInternal(start2,end2);
	}
	
	//(�־��� ��¥/�����ҷ��� �ð�)
	public static void TimeInternal(LocalTime start,LocalTime end){
		/*System.out.println(start.getHour());
		System.out.println(end.getHour());
		*/
		boolean check = false;
		for(int i=start.getHour()-1;i<end.getHour();i++){
			if(timeArr[i]==1){
				System.out.println("�̹̿����� ���� �ֽ��ϴ�.");
				check = true;
				break;
			}
		}
		
		if(check == false){
			for(int i=start.getHour()-1;i<end.getHour();i++){
				timeArr[i]=1;
			}
		}
		
		System.out.println("������ �����ѽð���");
		for(int i=0;i<timeArr.length-1;i++){
			
			if(timeArr[i]==0){
				System.out.println(LocalTime.of(i, 00)+" ~ "+LocalTime.of(i+1, 00));
			}
		}
		
		
		
	}

}
