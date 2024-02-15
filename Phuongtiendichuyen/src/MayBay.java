
public class MayBay extends PhuongTienDiChuyen{
	private String loaiNhienLieu;

	public MayBay(String tenLoaiPhuongTien, String loaiNhienLieu) {
		super("Máy Bay");
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
	
}
