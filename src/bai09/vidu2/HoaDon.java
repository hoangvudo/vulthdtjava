package bai09.vidu2;

import java.util.ArrayList;

public class HoaDon {
	private int soHoaDon;
	private ArrayList<SanPham> dssp;
	public HoaDon(int soHoaDon, ArrayList<SanPham> dssp) {
		super();
		this.soHoaDon = soHoaDon;
		this.dssp = dssp;
	}
	public HoaDon(int soHoaDon) {
		super();
		this.soHoaDon = soHoaDon;
		this.dssp = new ArrayList<SanPham>();
	}
	public void addSanPham(SanPham sp) throws CloneNotSupportedException {
		SanPham tam = (SanPham)sp.clone();
		this.dssp.add(sp);
	}
	public int getSoHoaDon() {
		return soHoaDon;
	}
	public void setSoHoaDon(int soHoaDon) {
		this.soHoaDon = soHoaDon;
	}
	public ArrayList<SanPham> getDssp() {
		return dssp;
	}
	public void setDssp(ArrayList<SanPham> dssp) {
		this.dssp = dssp;
	}
	@Override
	public String toString() {
		return "HoaDon [soHoaDon=" + soHoaDon + ", dssp=" + dssp + "]";
	}
	
}
