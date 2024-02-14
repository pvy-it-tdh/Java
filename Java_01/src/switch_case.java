import java.util.Scanner;

public class switch_case {
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("Nhap so ");
		int n=sn.nextInt();
		switch (n) {
		case 2: {
			
			System.out.println("Monday");
			break;
		}
		case 3: {
			
			System.out.println("Tuesday");
			break;
		}
		case 4: {
	
			System.out.println("Wednesday");
			break;
		}
		case 5: {
			
			System.out.println("Thurday");
			break;
		}
		case 6: {
			
			System.out.println("Friday");
			break;
		}
		case 7: {
			
			System.out.println("Saturday");
			break;
		}
		case 8: {
			
			System.out.println("Sunday");
			break;
		}
		default:
			System.out.println("Error");
		}
	}
}
