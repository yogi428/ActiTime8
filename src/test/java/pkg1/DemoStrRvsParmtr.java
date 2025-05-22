package pkg1;

public class DemoStrRvsParmtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rvs s1=new rvs();
		//String str7=s1.str();
		String str7="";
		System.out.print(str7);
	}

}

class rvs{
	public void str(){
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
			return;
			//System.out.print(str6);
		
	}
}}