
public class XeOTo extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public XeOTo(String tenLoaiPhuongTien, String loaiNhienLieu) {
		super(tenLoaiPhuongTien);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
	
	
}
