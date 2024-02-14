
public class MayTinh {
	private HangSanXuat hang;
	private NgaySanXuat ngay;
	private double gia;
	private double thoigianBaoHanh;
	public MayTinh(HangSanXuat hang, NgaySanXuat ngay, double gia, double thoigianBaoHanh) {
		super();
		this.hang = hang;
		this.ngay = ngay;
		this.gia = gia;
		this.thoigianBaoHanh = thoigianBaoHanh;
	}
	public HangSanXuat getHang() {
		return hang;
	}
	public void setHang(HangSanXuat hang) {
		this.hang = hang;
	}
	public NgaySanXuat getNgay() {
		return ngay;
	}
	public void setNgay(NgaySanXuat ngay) {
		this.ngay = ngay;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public double getThoigianBaoHanh() {
		return thoigianBaoHanh;
	}
	public void setThoigianBaoHanh(double thoigianBaoHanh) {
		this.thoigianBaoHanh = thoigianBaoHanh;
	}
	public boolean ktra(MayTinh khac)
	{
		return this.gia<khac.gia;
	}
	public String tenQuocGia()
	{
		return this.hang.getQg().getTenQuocGia();
	}
}
