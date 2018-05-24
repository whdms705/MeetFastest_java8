package MeetFastest_java8.learing.learn02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;

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
		
		List<Locale> localeList = map.get("CH");
		
		for(Locale locale : localeList){
			System.out.println(locale.getLanguage());
		}
		
		
		//////////////////////////////////////////////////////////////////////////
		//분류의 기준이 true, false라면 partitioningBy 이 더욱 효율적이라고 함
		Map<Boolean,List<Locale>> map2 = locales.stream().collect(
				Collectors.partitioningBy(l -> l.getLanguage().equals("b_CH"))
				);
		
		List<Locale> chinaLocales = map2.get(true);
		for(Locale locale : chinaLocales){
			System.out.println(locale.getLanguage());
		}
		
		
		//다운스트림 컬렉터
		//Map<Boolean,List<Locale>>에 list를 특정방식으로도 처리할 수 있다고 함!
		Map<String,Set<Locale>> countryToLocaleSet = locales.stream().collect(
				Collectors.groupingBy(Locale::getCountry,counting())//음??
				);

	}

}
