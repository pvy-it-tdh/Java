
public class HangSanXuat {
	private QuocGia qg;
	private String tenHang;
	public HangSanXuat(QuocGia qg, String tenHang) {
		
		this.qg = qg;
		this.tenHang = tenHang;
	}
	public QuocGia getQg() {
		return qg;
	}
	public void setQg(QuocGia qg) {
		this.qg = qg;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	
}
