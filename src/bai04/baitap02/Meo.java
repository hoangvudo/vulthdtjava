package bai04.baitap02;

public class Meo  {
	private int soLuong;
	private String mausac;
	private String giong;
	
	
	// constructor
	public Meo(int soLuong, String mauSac, String giong) {
		super();
		this.soLuong = soLuong;
		this.mausac = mauSac;
		this.giong = giong;
	}


	public int getSoLuong() {
		return soLuong;
	}


	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}


	public String getMausac() {
		return mausac;
	}


	public void setMausac(String mausac) {
		this.mausac = mausac;
	}


	public String getGiong() {
		return giong;
	}


	public void setGiong(String giong) {
		this.giong = giong;
	}


	@Override
	public String toString() {
		return "Meo [soLuong=" + soLuong + ", mausac=" + mausac + ", giong=" + giong + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
