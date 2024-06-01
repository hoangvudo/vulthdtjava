package baitap05;

public class boBinh extends nhanVat implements KieuDiChuyen , KieuTanCong {
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
	@Override
	public void tanCongKhongVuKhi() {
		// TODO Auto-generated method stub
		System.out.println("Tan cong khong vu khi");
		
	}
	@Override
	public void tanCongCoVuKhi() {
		// TODO Auto-generated method stub
		System.out.println("Tan cong co vu khi");
		
	}
	@Override
	public void sangPhai() {
		// TODO Auto-generated method stub
		System.out.println("Di chuyen sang phai");
		
	}
	@Override
	public void sangTrai() {
		// TODO Auto-generated method stub
		System.out.println("Di chuyen sang trai");
		
	}
	@Override
	public void nhayLen() {
		// TODO Auto-generated method stub
		System.out.println("Nhay len");
		
	}
	@Override
	public void boChay() {
		// TODO Auto-generated method stub
		System.out.println("Bo chay");
		
	}
	
}
