package pkg1;

public class DemoReturnKeyword {

	public static void main(String[] args) {
		System.out.println("this is bigining");
		
		five f1 = new five();
		int d=f1.add(10, 20);
		System.out.println(d);
		int f=f1.multiplication(40, 50);
		System.out.println(f);
		
		f1.rvrs();
		String str1=null;
		System.out.println(str1);
		
		
	}

}
class five{
	public int add(int a, int b) {
		int c=a+b;
		return c;  //return value not c if mention void nothing return
	}
	public int multiplication(int a, int b) {
		int c=a*b;
		return c;  //return value not c if mention void nothing return
	}
	
		public void rvrs() {
			String str="yogi";
			return;
			
		}
	}
