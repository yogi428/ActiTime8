package pkg1;

public class DemoOverloadingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("constructor overload");
		nine n1=new nine();
		nine n2=new nine(10,20);
		nine n3=new nine(10,20,30);  //need to create another object in constructor
		nine n4=new nine(10,20, "addition result");
		n3.bengaluru(); // benglr method can be call using any object
	}
	
	}

class nine{
	nine(){
		System.out.println("this is nine");
	}
	nine(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	nine(int a, int b, int c) {
		int d=a+b+c;
		System.out.println(d);
	}
	nine(int a, int b, String msg) {
		int c=a+b;
		System.out.println(msg+c);
	}
	public void bengaluru(){
		System.out.println("can be call by using any object out 4");
	}
}
