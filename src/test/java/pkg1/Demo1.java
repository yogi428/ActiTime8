package pkg1;

public class Demo1 {

	//java execute only main method so need to call other methods 
	// is in other classes by creating objects
	public static void main(String[] args) {
		System.out.println("this is bigining");
		one o1=new one();
		o1.bengaluru();
		o1.chennai();
		//git comments checking
		//calling methods of another class two
		two t1=new two();
		t1.mumbai();
		
	}

}


class one {
	public void bengaluru() {
		System.out.println("this is bnglr");
	}
	public void chennai() {
		System.out.println("this is chennai");
	}
}

class two{
	public void mumbai() {
		System.out.println("this is mumbai");
	}
}