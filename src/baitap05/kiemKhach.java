package baitap05;

public class kiemKhach extends nhanVat {
	private int soKiem;
	private int capDo;
	
	// constructor
	public kiemKhach(String ten, String id, byte gioiTinh, double nangLuong, int soKiem, int capDo) {
		super(ten, id, gioiTinh, nangLuong);
		this.soKiem = soKiem;
		this.capDo = capDo;
	}
	public int getSoKiem() {
		return soKiem;
	}
	public void setSoKiem(int soKiem) {
		if (soKiem >= 0) {
			System.out.println("Chem");
		}else {
			System.out.println("Khong co kiem");
		}
		this.soKiem = soKiem;
	}
	public int getCapDo() {
		return capDo;
	}
	public void setCapDo(int capDo) {
		this.capDo = capDo;
	}
	@Override
	public String toString() {
		return "kiemKhach [soKiem=" + soKiem + ", capDo=" + capDo + "]";
	}
	@Override
	public void hanhDong() {
		System.out.println("Vung kiem chem");
		super.hanhDong();
	}
	@Override
	public void sucManh() {
		double energy = this.getNangLuong();
		System.out.println("Suc manh cua kiem khach la :" + energy);
		
	}
		
	}
	
	
	

