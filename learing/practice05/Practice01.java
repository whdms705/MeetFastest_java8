package MeetFastest_java8.learing.practice05;

import java.time.LocalDate;
import java.time.Period;

/*
 * @Content : ���α׷����� ���� ����϶�(9�� 13)
 */

public class Practice01 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.now();
//		//LocalDate date1 = LocalDate.of(1972, 1, 10);
		LocalDate date2 = date1.withMonth(9);
		LocalDate date3;
		
		if(date1.isLeapYear()){//09.12 ������ ���
			date3 = date2.withDayOfMonth(12);
		}else{//09.13
			date3 = date2.withDayOfMonth(13);
		}
		
		System.out.println(date3.toString());
		
	}
	

}
