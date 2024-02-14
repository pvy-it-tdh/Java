import java.util.Scanner;

public class try_catch_finally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		try {
			System.out.println("Nhap vao so n ");
			n=sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhap du lieu bi sai");
		}
		 finally {
			 // cho dù chương trình bị lỗi hay không lỗi gì thì vẫn thực hiện
			 System.out.println("Finally!");
		}
		System.out.println("Ket thuc");
		System.out.println("Gia tri la "+n);
	}
}
