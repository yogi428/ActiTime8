package pkg1;

public class DemoIfElse {

	public static void main(String[] args) {
		
		String actual="ABCD";
		String expected="ABCD";
		boolean result=actual.equals(expected);
		
		//boolean status=actual.equals(expected);
		if (result)
		//if(!true)
		{
			System.out.println("this is success");
		}
		else{
			System.out.println("this is failure");
		}

	}

}
