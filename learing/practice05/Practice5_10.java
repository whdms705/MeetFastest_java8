package MeetFastest_java8.learing.practice05;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//참고사이트 ->(withZoneSameInstant) https://wickso.me/2018/02/20/time-zone-with-java8/

public class Practice5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Set<String> set = ZoneId.getAvailableZoneIds();
		System.out.println(set.toString());*/
		
		  LocalDateTime localDateTime = LocalDateTime.of(2018,8,17,15,5,0,0);
	        ZonedDateTime losAngeles = localDateTime.atZone(ZoneId.of("America/Los_Angeles"));
	        ZonedDateTime Berlin = losAngeles.withZoneSameInstant(ZoneId.of("Europe/Berlin"));//프랑크푸르트로
	        System.out.println(Berlin.plusHours(10).plusMinutes(50).toLocalDateTime());
	        
	}

}
