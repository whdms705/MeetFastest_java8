package MeetFastest_java8.learing.learn02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Locale{
	String country;//국가코드
	String language;//언어코드
	
	public Locale(String language,String country){
		this.language=language;
		this.country=country;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}


class City{
	String state;
	String city;
	
	public City(String state,String city){
		this.state=state;
		this.city=city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}


public class Sub11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Person> people = Arrays.asList(new Person("John", 20), new Person("Sara", 22),new Person("Jane", 21), new Person("Greg", 35));
		// 국가코드에 해당하는 모든 로케일
		List<Locale> locales =  Arrays.asList(
										new Locale("a_CH","CH"),
										new Locale("b_CH","CH"),
										new Locale("c_CH","CH"),
										new Locale("a_KR","KR"),
										new Locale("b_KR","KR"),
										new Locale("c_KR","KR"),
										new Locale("a_EN","EN"),
										new Locale("b_EN","EN"),
										new Locale("c_EN","EN"));
		
		Map<String,List<Locale>> map = locales.stream().collect(
				Collectors.groupingBy(Locale::getCountry)
				);
		
		List<Locale> l = map.get("CH");
		
		for(Locale locale : l){
			System.out.println(locale.getLanguage());
		}
		
		
		//////////////////////////////////////////////////////////////////////////
		
		
		

	}

}
