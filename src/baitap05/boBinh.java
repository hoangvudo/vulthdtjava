package baitap05;

public class boBinh extends nhanVat {
	private int giao;
	private boolean khien;
	private boolean aoGiap;
	public boBinh(String ten, String id, byte gioiTinh, double nangLuong, int giao, boolean khien, boolean aoGiap) {
		super(ten, id, gioiTinh, nangLuong);
		this.giao = giao;
		this.khien = khien;
		this.aoGiap = aoGiap;
	}
	public int getGiao() {
		return giao;
	}
	public void setGiao(int giao) {
		this.giao = giao;
	}
	public boolean isKhien() {
		return khien;
	}
	public void setKhien(boolean khien) {
		this.khien = khien;
	}
	public boolean isAoGiap() {
		return aoGiap;
	}
	public void setAoGiap(boolean aoGiap) {
		this.aoGiap = aoGiap;
	}
	@Override
	public String toString() {
		return "boBinh [giao=" + giao + ", khien=" + khien + ", aoGiap=" + aoGiap + "]";
	}
	@Override
	public void hanhDong() {
		// TODO Auto-generated method stub
		System.out.println("dam giao");
		super.hanhDong();
	}
	@Override
	public void sucManh() {
		// TODO Auto-generated method stub
		double energy = this.getNangLuong();
		System.out.println("Suc manh cua bo binh :"+ energy);
	}
	
}
