package pkg1;

public class DemoOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is bigining");
		//method overloading , same method name with different values
		seven s1=new seven();
		s1.add(10, 20);
		s1.add(40, 50, 60);
		s1.add(70, 80, "this is addition");
	}

}
class seven{
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a, int b, int c) {
		int d=a+b+c;
		System.out.println(d);
	}
	public void add(int a, int b, String msg) {
		int c=a+b;
		System.out.println(msg+c);
	}
}