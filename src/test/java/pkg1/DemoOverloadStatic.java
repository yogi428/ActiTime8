package pkg1;

public class DemoOverloadStatic {

	public static void main(String[] args) {
		// static also can be over loaded
		eight.add(10, 20);
		eight.add(10, 20, 30);
		eight.add(20, 40, "addition of two numbers ");
	}

}
class eight{
	public static void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void add(int a, int b, int c) {
		int d=a+b+c;
		System.out.println(d);
	}
	public static void add(int a, int b, String msg) {
		int c=a+b;
		System.out.println(msg+c);
	}
}