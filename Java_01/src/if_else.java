import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n =sc.nextInt();
		if(n%2==0)
		{
			System.out.println(n+" la so chan");
		}
		else
		{
			System.out.println(n+" la so le");
		}
	}
}
