package Bai11.model1;

public class SinhVien {
	
	private String ten;
	private double dtb;
	private int tuoi;
	public SinhVien(String ten, double dtb, int tuoi) {
		super();
		this.ten = ten;
		this.dtb = dtb;
		this.tuoi = tuoi;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		return "SinhVien [ten=" + ten + ", dtb=" + dtb + ", tuoi=" + tuoi + "]";
	}
	
}
