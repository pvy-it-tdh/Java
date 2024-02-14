import java.util.Scanner;

public class toantudieukien {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		String ketqua = (a%2==0)?"So chan" : "So le";
		System.out.println(a+" la "+ketqua);
	}
}
