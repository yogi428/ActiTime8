package pkg1;

public class DemoConstructor {

	public static void main(String[] args) {
		System.out.println("this is bigining");
		
		six s1 =new six(); //no need to call method for constructor separately,
		//while creating object it will call automatically
		//here six is not a method, it is a constructor
//constructor will not have any return type
	s1.bengaluru();//bengaluru()  is a method
	}

}
class six{
	//doesnt have any return type check behind constructor
	six(){
		System.out.println("this is bnglr");
	}
	public void bengaluru() {
		System.out.println("this is bnl=glr");
	}
}