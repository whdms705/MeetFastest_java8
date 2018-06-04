package MeetFastest_java8.learing.practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * stream ��ſ� parallelStream�� �̿��� �� �ܾ� ������ �� �� ���� ����
 * System.CurrentTimeMillis �̿�
 */
public class Practice02_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<String> list1 = new ArrayList<String>();
	    List<String> list2 = new ArrayList<String>();
	    
	    for(int i=0;i<20000;i++){
	    	list1.add("1111111");
	    	list2.add("2222222");
	    }
	    long startTime1 = System.currentTimeMillis();

	    Stream<String> word1 = list1.stream().filter(s1 -> s1.length()>3).distinct();
        
        // ���� �ð�
        long endTime1 = System.currentTimeMillis();

        //-----------------------------------------------------------------------
        
        long startTime2 = System.currentTimeMillis();
        
	    Stream<String> word2 = list2.stream().filter(s2 -> s2.length()>3).distinct();
	    
	    long endTime2 = System.currentTimeMillis();
	    
	    System.out.println("##  time1 : " + ( endTime1 - startTime1 )/1000.0f +"��");

	    System.out.println("##  time2 : " + ( endTime2 - startTime2 )/1000.0f +"��");

	    
	}

}
