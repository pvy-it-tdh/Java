import java.util.Scanner;

public class giaiphuongtrinhbacI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a la");
		double a=sc.nextDouble();
		System.out.println("Nhap b la");
		double b=sc.nextDouble();
		double x;
		if(a==0)
		{
			if(b==0)
			{
				System.out.println("Phuong trinh vo so nghiem");
			}
			else
			{
				System.out.println("Phuong trinh vo nghiem");
			}
		}
		else
		{
			x=-b/a;
			System.out.println("Con nghiem x= "+x);
		}
	}
}
