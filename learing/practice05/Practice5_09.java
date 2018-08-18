package MeetFastest_java8.learing.practice05;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Practice5_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Set<String> set = ZoneId.getAvailableZoneIds();
		set.stream()
		.forEach(a ->{
			System.out.println(ZonedDateTime.of(LocalDateTime.now(),ZoneId.of(a)).getOffset().toString().indexOf("Z"));
		});*/
		
		ZoneId.getAvailableZoneIds().stream().filter(a->
			ZonedDateTime.of(LocalDateTime.now(),ZoneId.of(a)).getOffset().toString().indexOf("Z")==-1
		).forEach(a ->{
			ZoneId zone = ZoneId.of(a);
			LocalDateTime date =LocalDateTime.now(zone);
			if(date.getHour()!=0&date.getMinute()!=0){
				System.out.println(date);
			}
		});
		
	/*	ZoneId.getAvailableZoneIds().stream().forEach(x->{
	         ZonedDateTime z = ZonedDateTime.of(LocalDateTime.now(),ZoneId.of(x));
	         System.out.println(z.getOffset());
	         if(!z.getOffset().equals("Z")) System.out.println(z);
	      });*/
		
		
		
	}

}
