
public class TacGia {
	private String tenTacGia;
	private Ngay ngaysinh;
	public TacGia(String tenTacGia, Ngay ngaysinh) {
		this.tenTacGia = tenTacGia;
		this.ngaysinh = ngaysinh;
	}
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public Ngay getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Ngay ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	
}
