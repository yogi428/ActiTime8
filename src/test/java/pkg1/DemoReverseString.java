package pkg1;

public class DemoReverseString {

	public static void main(String[] args) {
		
		String actual= "selenium fdfdf";
		int len=actual.length();
		char arr[]=actual.toCharArray();
		for (int i=len-1; i>=0; i--)		
		{
			
			System.out.print(arr[i]);
		}
		
	//	char arr[]=actual.toCharArray(); //toCharArray() will split string in to each charector
	//	for (int i=7; i>=0; i--) {
	//		System.out.print(arr[i]);
		}
		//toCharArray() this is inbuilt function of java
		//System.out.println(actual);
		/*System.out.println(arr[0]);
		 * System.out.println(arr[1]);
System.out.println(arr[2]);
System.out.println(arr[3]);
System.out.println(arr[4]);

		 */

	}


