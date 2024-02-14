
public class Main {
	public static void main(String[] args) {
		MyDate md =new MyDate(13, 10, 2004);
		MyDate md1=new MyDate(13,10,2004);
		System.out.println("Hằng sinh ngày ");md.printDay();
		System.out.println("Tháng ");md.printMonth();
		System.out.println("Năm ");	md.printYear();	
//		System.out.println("Sinh nhật của bé Hằng là :");
//		md.printDate();
		System.out.println("Sinh nhật của bé Hằng là: "+md);
		if(md1.equals(md))
		{
			System.out.println("Hai nguoi co cung ngay sinh");
		}
		else
		{
			System.out.println("Hai nguoi khac ngay sinh");
		}
	}
}
