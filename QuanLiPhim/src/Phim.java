
public class Phim {
	private String tenPhim;
	private int namSanXuat;
	private Hangsanxuat hang;
	private double gia;
	private NgayChieu ngay;
	public Phim(String tenPhim, int namSanXuat, Hangsanxuat hang, double gia, NgayChieu ngay) {
		
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hang = hang;
		this.gia = gia;
		this.ngay = ngay;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public Hangsanxuat getHang() {
		return hang;
	}
	public void setHang(Hangsanxuat hang) {
		this.hang = hang;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public NgayChieu getNgay() {
		return ngay;
	}
	public void setNgay(NgayChieu ngay) {
		this.ngay = ngay;
	}
	public boolean kiemTraGiaVeReHon(Phim khac)
	{
		return this.gia> khac.gia;
	}
	public String layTenHangSanXuatPhim()
	{
		return this.hang.getTenHangSanXuat();
	}
	public double giaSaukhiKhuyenMai(double x)
	{
		return (1-x/100)*this.gia;
	}
}
