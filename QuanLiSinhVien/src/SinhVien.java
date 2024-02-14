
public class SinhVien {
	private String mssv;
	private String name;
	private NgaySinh ngaysinh;
	private double diemTB;
	private Lop lop;
	public SinhVien(String mssv, String name, NgaySinh ngaysinh, double diemTB, Lop lop) {
		
		this.mssv = mssv;
		this.name = name;
		this.ngaysinh = ngaysinh;
		this.diemTB = diemTB;
		this.lop = lop;
	}
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public NgaySinh getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(NgaySinh ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	public Lop getLop() {
		return lop;
	}
	public void setLop(Lop lop) {
		this.lop = lop;
	}
	public String getTenKhoa()
	{
		return this.lop.getTenKhoa();
	}
	public boolean KtraDau()
	{
		return this.diemTB>=5;
	}
	public boolean KtraNgaySinh(SinhVien svkhac)
	{
		return this.ngaysinh.equals(svkhac.ngaysinh);
	}
	
}
