package model1.luyentap;

import java.util.List;

public class DoiQuan extends BinhDoan {
	private String ten;
	private int thanhVien;
	private String loaiQuanDoi;
	
	public DoiQuan(String ten, int id, String gioiTinh, double nangLuong, String guom, String giao, String cung,
			String ngua, int soNamDaoTao, String ten2, int soLuong, String loaiBinhDoan, List<VuKhi> trangBiVuKhi,
			String ten3, int thanhVien, String loaiQuanDoi) {
		super(ten, id, gioiTinh, nangLuong, guom, giao, cung, ngua, soNamDaoTao, ten2, soLuong, loaiBinhDoan,
				trangBiVuKhi);
		ten = ten3;
		this.thanhVien = thanhVien;
		this.loaiQuanDoi = loaiQuanDoi;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getThanhVien() {
		return thanhVien;
	}
	public void setThanhVien(int thanhVien) {
		this.thanhVien = thanhVien;
	}
	public String getLoaiQuanDoi() {
		return loaiQuanDoi;
	}
	public void setLoaiQuanDoi(String loaiQuanDoi) {
		this.loaiQuanDoi = loaiQuanDoi;
	}
	@Override
	public String toString() {
		return "DoiQuan [ten=" + ten + ", thanhVien=" + thanhVien + ", loaiQuanDoi=" + loaiQuanDoi + "]";
	}
	void tanCong() {
		
	}
	void diChuyen() {
		
	}
	void satThuong() {}
}
