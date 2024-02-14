
public class HoaDonCafe {
	private String tenloaiCafe;
	private double giaTien1kg;
	private double khoiLuong;
	
//	Contructor
	
	public HoaDonCafe(String name,double gia,double kl)
	{
		this.tenloaiCafe=name;
		this.giaTien1kg=gia;
		this.khoiLuong=kl;
	}
	public double Tongtien()
	{
		return this.giaTien1kg*this.khoiLuong;
	}
	public boolean ktraKhoiLuongLonHon(double khoiLuong)
	{
		return this.khoiLuong>khoiLuong;
	}
	public boolean ktralonhon500000()
	{
		return this.Tongtien()>500000;
	}
	public double giamGia(double x)
	{
		if(this.Tongtien()>500000)
		{
			return (x/100)*this.Tongtien();
		}
		else
		{
			return 0;
		}
	}
	public double Total(double x)
	{
		return this.Tongtien()-this.giamGia(x);
	}
}
