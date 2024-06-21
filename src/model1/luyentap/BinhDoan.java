package model1.luyentap;

import java.util.List;

public class BinhDoan extends KyBinh {
	private String ten;
	private int soLuong;
	private String loaiBinhDoan;
	List<VuKhi> trangBiVuKhi;
	public BinhDoan(String ten, int id, String gioiTinh, double nangLuong, String guom, String giao, String cung,
			String ngua, int soNamDaoTao, String ten2, int soLuong, String loaiBinhDoan, List<VuKhi> trangBiVuKhi) {
		super(ten, id, gioiTinh, nangLuong, guom, giao, cung, ngua, soNamDaoTao);
		ten = ten2;
		this.soLuong = soLuong;
		this.loaiBinhDoan = loaiBinhDoan;
		this.trangBiVuKhi = trangBiVuKhi;
	}
	

}