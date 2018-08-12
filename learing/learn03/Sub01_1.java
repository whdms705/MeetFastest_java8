package MeetFastest_java8.learing.learn03;

class Heavy {
	
    Heavy() {
        System.out.println("Heavy created");
    }
}


class Holder {
	
	
    public Holder() {
        System.out.println("Holder created");
    }
    
    Heavy heavy = new Heavy();
    public void getHeavy() {
    	 System.out.println("111111");
    }

    
}

public class Sub01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Holder holder = new Holder();
	     System.out.println("Get Heavy instance");

	}

}
