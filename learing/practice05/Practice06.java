package MeetFastest_java8.learing.practice05;

import java.time.LocalDate;
import java.time.Period;
import static java.time.temporal.TemporalAdjusters.*;

import java.time.DayOfWeek;
/*
 * @Content : 20������ ��� 13���� �ݿ��� ����
 * 1901�� 2000�⵵
 */
		

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1901;i<2001;i++){
			for(int j=1;j<13;j++){
				LocalDate date = LocalDate.of(i,j,13);
				if(date.getDayOfWeek().getValue()==5){
					System.out.println(date);
				}
			}
		}
	}

}
