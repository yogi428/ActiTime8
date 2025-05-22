package pkg1;

public class DemoStrRvs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str4="LathaYogi";
		String str5="";
		//String str6="";
		//return str6;
		char c;
		char arr[]=str4.toCharArray();
		int len=str4.length();
		for(int i=len-1;i>=0;i--) {
			c= arr[i]; 
//can print arr[i] also, if need to convert it in to string then use below code
			String str6=str5+c;
			System.out.print(str6);
		
	}

	}}
