package pkg1;

public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Itest e1=new Eleven();
		e1.display1();
		e1.display2();
	}

}

interface Itest{
	public void display1();   //method declaring so end with ; and no body {}
	public void display2();
}

class Eleven implements Itest{                  //implement all abstract method under interface
	public void display1(){                           //method defining so no ; with body {}
		System.out.println("implemented interface display 1");
	}
	public void display2() {
		System.out.println("implemented interface display2");
	}
}

//if we mention abstract class then we can define one method 
//abstract class Eleven implements Itest