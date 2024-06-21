package bai09.vidu2;

public class SanPham implements Cloneable   {
	private String tenSanPham;
	private int giaSanPham;
	public SanPham(String tenSanPham, int giaSanPham) {
		super();
		this.tenSanPham = tenSanPham;
		this.giaSanPham = giaSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public int getGiaSanPham() {
		return giaSanPham;
	}
	public void setGiaSanPham(int giaSanPham) {
		this.giaSanPham = giaSanPham;
	}
	@Override
	public String toString() {
		return "SanPham [tenSanPham=" + tenSanPham + ", giaSanPham=" + giaSanPham + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
