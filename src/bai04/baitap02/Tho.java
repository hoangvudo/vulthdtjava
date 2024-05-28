package bai04.baitap02;
	
	public class Tho {
	private int soLuong;
	private String mauSac;
	private String giong;
	public Tho(int soLuong, String mauSac, String giong) {
		super();
		this.soLuong = soLuong;
		this.mauSac = mauSac;
		this.giong = giong;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public String getGiong() {
		return giong;
	}
	public void setGiong(String giong) {
		this.giong = giong;
	}
	@Override
	public String toString() {
		return "Tho [soLuong=" + soLuong + ", mauSac=" + mauSac + ", giong=" + giong + ", toString()="
				+ super.toString() + "]";
	}
	
		
	
	
	}
