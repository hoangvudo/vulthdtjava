package model1.luyentap;

public class NhanVat implements DiChuyen {
	private String ten;
	private int id;
	private String gioiTinh;
	private double nangLuong;
	
	public NhanVat(String ten, int id, String gioiTinh, double nangLuong) {
		super();
		this.ten = ten;
		this.id = id;
		this.gioiTinh = gioiTinh;
		this.nangLuong = nangLuong;
	}
	

	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGioiTinh() {
		return gioiTinh;
	}


	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}


	public double getNangLuong() {
		return nangLuong;
	}


	public void setNangLuong(double nangLuong) {
		this.nangLuong = nangLuong;
	}


	@Override
	public String toString() {
		return "NhanVat [ten=" + ten + ", id=" + id + ", gioiTinh=" + gioiTinh + ", nangLuong=" + nangLuong + "]";
	}


	@Override
	public void sangPhai() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sangTrai() {
		// TODO Auto-generated method stub

	}

	@Override
	public void nhayLen() {
		// TODO Auto-generated method stub

	}

}
