package bai04.baitap02;
import java.time.LocalDate;

public class DongVat {
	private String hoTen;
	private int namsinh;
	private String gioitinh;
	
	// constructor
	public DongVat(String hoTen, int namsinh, String gioitinh) {
		super();
		this.hoTen = hoTen;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	@Override
	public String toString() {
		return "DongVat [hoTen=" + hoTen + ", namsinh=" + namsinh + ", gioitinh=" + gioitinh + ", getHoTen()="
				+ getHoTen() + ", getNamsinh()=" + getNamsinh() + ", getGioitinh()=" + getGioitinh() + "]";
	}
	
	
}
	
	
	


