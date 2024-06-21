package bai09.vidu1;

public class SinhVien {
	private String ten;
	private LopHoc lopHoc;
	
	
	public SinhVien(String ten, LopHoc lopHoc) {
		super();
		this.ten = ten;
		this.lopHoc = lopHoc;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public LopHoc getLopHoc() {
		return lopHoc;
	}


	public void setLopHoc(LopHoc lopHoc) {
		this.lopHoc = lopHoc;
	}


	@Override
	public String toString() {
		return "SinhVien [ten=" + ten + ", lopHoc=" + lopHoc + "]";
	}
	
}
