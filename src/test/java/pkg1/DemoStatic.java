package pkg1;

public class DemoStatic {

	public static void main(String[] args) {
		System.out.println("this is bigining");
		//Static methods are saving memory
		Four.bengaluru();//for static method without creating object we can call
		//including object also call but not a goodway memory wastage
		Four.chennai();
		
		Four f1=new Four();
		f1.chennai();
		f1.mumbai();
	}
}
class Four{
	public static void bengaluru() {
		System.out.println("this is bnglr");
	}
	public static void chennai() {
		System.out.println("this is chennai");
	}
	public void mumbai() {
		System.out.println("this is mumbai");
	}
}