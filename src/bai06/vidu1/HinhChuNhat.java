/**
 * 
 */
package bai06.vidu1;

/**
 * 
 */
public class HinhChuNhat implements HinhHoc {
	private double chieuDai;
	private double chieuRong;
	
	
	public HinhChuNhat(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2*(this.chieuDai*this.chieuRong);
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return this.chieuDai*this.chieuRong;
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	@Override
	public String toString() {
		return "HinhChuNhat [chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + "]";
	}
	

}
