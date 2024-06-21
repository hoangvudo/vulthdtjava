package baitap05;

public class nhanVat {
	private String ten;
	private String id;
	private byte gioiTinh;
	private double nangLuong;
	
	// constructor
	public nhanVat(String ten, String id, byte gioiTinh, double nangLuong) {
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(byte gioiTinh) {
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
		return "nhanVat [ten=" + ten + ", id=" + id + ", gioiTinh=" + gioiTinh + ", nangLuong=" + nangLuong + "]";
	}
	
	public void hanhDong() {
		System.out.println("...");
		
	}
	
	public void sucManh() {
		System.out.println("...");
	}
	
}
