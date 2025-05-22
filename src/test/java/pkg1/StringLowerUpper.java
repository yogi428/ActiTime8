package pkg1;

public class StringLowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "NTR";
		String s2="";
		char a[]=s1.toCharArray();
		int l1=s1.length();
		for(int i=l1-1;i>=0;i--)
		{
			//System.out.print(a[i]); //RTN
			char c=a[i];
		
			
			String s3=s2+c;
			String s4=s3.toLowerCase();
		//	System.out.print(s4);
			char b[]=s4.toCharArray();
			char c2 =b[1];
			System.out.print(c2);

			
			
		}
			
		}
		
	}


