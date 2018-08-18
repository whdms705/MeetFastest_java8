package MeetFastest_java8.learing.practice05;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Practice5_11 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		LocalDateTime localDateTime = LocalDateTime.of(2018,8,17,14,05,0,0);
		ZonedDateTime Berlin = localDateTime.atZone(ZoneId.of("Europe/Berlin"));
		//System.out.println("Berlin : "+Berlin.toLocalDateTime());
        ZonedDateTime losAngeles = Berlin.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));//ÇÁ¶ûÅ©Çª¸£Æ®·Î
        //System.out.println("losAngeles : "+losAngeles.toLocalDateTime());
        int dif = Math.abs(Berlin.toLocalDateTime().getHour()-losAngeles.toLocalDateTime().getHour());
        System.out.println("dif : "+dif);
        
        String time ="16:40";
        String[] times = time.split(":");
        
        int resultTime = Math.abs(losAngeles.toLocalDateTime().getHour()-Integer.parseInt(times[0]));
        int resultMinute = Math.abs(losAngeles.toLocalDateTime().getMinute()-Integer.parseInt(times[1]));
        System.out.println("resultTime : "+resultTime);
        System.out.println("resultMinute : "+resultMinute);
        
	}

}
