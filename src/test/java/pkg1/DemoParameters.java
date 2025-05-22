package pkg1;

public class DemoParameters {

	public static void main(String[] args) {
		System.out.println("this is bigining");
		
		three t1=new three();
		t1.add(10, 20);
		t1.add(30, 40);
		t1.add(30, 50);
		t1.city("this bnglr");
		
		
		
	}
}

class three{
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void city(String cityName) {
		System.out.println(cityName);
	}

	}
	
