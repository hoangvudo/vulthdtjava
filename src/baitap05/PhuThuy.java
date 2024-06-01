package baitap05;

public class PhuThuy extends nhanVat implements KieuDiChuyen , KieuTanCong {
	private boolean choi;
	private boolean gay;
	
	
	public PhuThuy(String ten, String id, byte gioiTinh, double nangLuong, boolean choi, boolean gay) {
		super(ten, id, gioiTinh, nangLuong);
		this.choi = choi;
		this.gay = gay;
	}


	public boolean isChoi() {
		return choi;
	}


	public void setChoi(boolean choi) {
		this.choi = choi;
	}


	public boolean isGay() {
		return gay;
	}


	public void setGay(boolean gay) {
		this.gay = gay;
	}


	@Override
	public String toString() {
		return "PhuThuy [choi=" + choi + ", gay=" + gay + "]";
	}


	@Override
	public void hanhDong() {
		// TODO Auto-generated method stub
		System.out.println("Bay");
		super.hanhDong();
	}


	@Override
	public void sucManh() {
		// TODO Auto-generated method stub
		double energy = this.getNangLuong() * 1.7;
		System.out.println("Suc manh cua phu thuy :" + energy);
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
