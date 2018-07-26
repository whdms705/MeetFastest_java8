package MeetFastest_java8.learing.practice05;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Predicate;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfWeek().getValue());
		LocalDate date =  today.with(next(w->w.getDayOfWeek().getValue()<3));
		System.out.println(date.toString());
	}

	public static TemporalAdjuster next(Predicate<LocalDate> localdate){
		return TemporalAdjusters.ofDateAdjuster(w->{
			LocalDate date = w;
			do{
				date = date.plusDays(1);
				System.out.println("date : "+date.toString());
			}while(localdate.test(date));
			return date;
		});
		
		
	}

}
