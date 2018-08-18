package MeetFastest_java8.learing.practice05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

public class Practice5_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = ZoneId.getAvailableZoneIds();
		//System.out.println(set.toString());
		
		set.stream().forEach(a ->{
			ZoneId zone = ZoneId.of(a);
			LocalDateTime date =LocalDateTime.now(zone);
			System.out.println(date);
			});
		
       /* Optional<String> parisId = set.stream().filter(a -> a.indexOf("Paris") > 0 ).findFirst();
        System.out.println( " Key for Paris : " + parisId .get());*/
	}

}
