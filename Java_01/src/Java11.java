import java.util.Scanner;

public class Java11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int tong = a + b;
		int hieu = a - b;
		int tich = a * b;
		int thuong = a / b;
		int du = a % b;
		System.out.println(a + "+" + b + "=" + tong);
		System.out.println(a + "-" + b + "=" + hieu);
		System.out.println(a + "*" + b + "=" + tich);
		System.out.println(a + "/" + b + "=" + thuong);
		System.out.println(a + "%" + b + "=" + du);

	}
}
