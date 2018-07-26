package MeetFastest_java8.learing.practice05;

import java.time.LocalDate;
import java.time.Period;

/*
 * @Content : LocalDate.of(2000,2,29)에 1년을 더하면 어떻게 되는가?
 * 한편 4년을 더할 때는 어떠한가? 마지막으로 1년을 4번 더하면 어떻게 되는가?
 * 
 */

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(2000,2,29);
		LocalDate date1 = date.plusYears(1);
		LocalDate date2 = date.plusYears(4);
		
		LocalDate date3 = date.plusYears(1);
		LocalDate date4 = date3.plusYears(1);
		LocalDate date5 = date4.plusYears(1);
		LocalDate date6 = date5.plusYears(1);
		
		System.out.println(date1.toString());
		System.out.println(date2.toString());
		
		System.out.println(date3.toString());
		System.out.println(date4.toString());
		System.out.println(date5.toString());
		System.out.println(date6.toString());

	}
	

}
