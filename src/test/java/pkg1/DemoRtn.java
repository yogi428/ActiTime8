package pkg1;

public class DemoRtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi");
		str ob1=new str();
		String st4=ob1.concat("Latha");	
		
		System.out.println(st4);
		
		  //Input: ABC DE FGHI
		//Expected output: IHG FE DCBA
		StringUtility util = new StringUtility();
		String str1 = "ABC DE FGHI";
		String str2 = util.reverseString(str1);
		System.out.println(str2);
	}

}
class str{
	public String concat(String st3){
		String st2="yogi";
		String Conct=st3+st2;
		return Conct;
		//System.out.println(st1);
	}
}

class StringUtility{
	public String reverseString(String str3) {
		
		String str4=str3;
		String str5="";
		//String str6="";
		//return str6;
		char c;
		char arr[]=str4.toCharArray();
		int len=str4.length();
		for(int i=len-1;i>=0;i--) {
			c= arr[i];
			String str6=str5+c;
			System.out.println(str6);
			//return;
			
		}
	
	//return c;
		
	}
	
}