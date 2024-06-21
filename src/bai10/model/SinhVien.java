package bai10.model;

public class SinhVien implements Comparable<SinhVien> {
	
	private String hoTen;
	private double dtb;
	private int tuoi;
	
	
	public SinhVien(String hoTen, double dtb, int tuoi) {
		super();
		this.hoTen = hoTen;
		this.dtb = dtb;
		this.tuoi = tuoi;
	}
	


	public String getHoTen() {
		return hoTen;
	}



	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
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
		return "SinhVien [hoTen=" + hoTen + ", dtb=" + dtb + ", tuoi=" + tuoi + "]";
	}



	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		
		return this.hoTen.compareTo(o.hoTen);
		
	}

}
