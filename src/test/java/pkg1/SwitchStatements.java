package pkg1;

public class SwitchStatements {

	public static void main(String[] args) {
		int n=8;
		 
		switch(n) {
		case 1://colon
		System.out.println("Monday");
		break; //semi colon
		case 2:
			System.out.println("Tuesday");
		break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
		System.out.println("Thursday");
		break;
		case 5:
		System.out.println("Friday");
		break;
		case 6:
		System.out.println("Saturday");
		break;
		case 7:
		System.out.println("Sunday");
		default:
		System.out.println("Enter valid number");
		
		}
		String day="Tuesday";
		switch(day) {
		case "Monday" :	System.out.println("6am"); break;
		case "Tuesday" :	System.out.println("10am"); break;
		case "Friday" :	System.out.println("2pm"); break;
		
		
		
		}
		
	}

}

