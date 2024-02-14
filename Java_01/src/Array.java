import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		double [] array1;
		double array2[];
		// double array1[];
		array1= new double[10];
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<array1.length;i++)
		{
			System.out.println("Nhap phan tu thu "+i);
			array1[i]=sc.nextDouble();
		}
		double tong=0;
		for (int i = 0; i < array1.length; i++) {
			tong+=array1[i];
		}
		System.out.println("Tong cac phan tu trong mang "+tong);
		tong=0;
		array2 = new double[] {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < array2.length; i++) {
			tong+=array2[i];
		}
		System.out.println("Tong cac phan tu trong mang 2 "+tong);
	}
}
