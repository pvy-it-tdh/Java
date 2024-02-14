
public abstract class Hinh {
	protected Toado toaDo;

	public Hinh(Toado toaDo) {
		
		this.toaDo = toaDo;
	}

	public Toado getToaDo() {
		return toaDo;
	}

	public void setToaDo(Toado toaDo) {
		this.toaDo = toaDo;
	}
	public abstract double tinhDienTich();
	
}
