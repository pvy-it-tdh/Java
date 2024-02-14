
public class Sach {
	private String tenSach;
	private double giaBan;
	private int namxuatban;
	private TacGia tacgia;
	
	public Sach(String tenSach, double giaBan, int namxuatban, TacGia tacgia) {
		super();
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namxuatban = namxuatban;
		this.tacgia = tacgia;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public int getNamxuatban() {
		return namxuatban;
	}

	public void setNamxuatban(int namxuatban) {
		this.namxuatban = namxuatban;
	}

	public TacGia getTacgia() {
		return tacgia;
	}

	public void setTacgia(TacGia tacgia) {
		this.tacgia = tacgia;
	}
	public boolean KtraCungNamXuatBan(Sach sachKhac)
	{
		return this.namxuatban==sachKhac.namxuatban;
	}
	public void PrintTenSach()
	{
		System.out.println(this.tenSach);
	}
	public double giaSauKhiGiam(double x)
	{
		return(1-x/100)*this.giaBan;
	}
	
}
