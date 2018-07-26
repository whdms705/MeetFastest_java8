package MeetFastest_java8.learing.practice05;

import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.*;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(2018,3,1);
		LocalDate start = date.with(firstDayOfMonth());
		LocalDate end = date.with(lastDayOfMonth());
		
		
		System.out.println(start+" :: >"+start.getDayOfWeek());
		
		int blank=0;
		int count=1;
		do{
			if(blank==0){
				for(int i=0;i<start.getDayOfWeek().getValue();i++){
					System.out.print("  ");
				}
				blank++;
			}else{
				if(start.getDayOfWeek().getValue()==1){
					System.out.println();
				}
				if(count<10){
					System.out.print("  "+count);
				}else{
					System.out.print(" "+count);
				}
				count++;
				start = start.plusDays(1);
			}
		}while(!start.equals(end));
		
	}

}
