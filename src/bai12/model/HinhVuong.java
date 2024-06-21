package bai12.model;

public class HinhVuong extends HinhHoc {
	private double canh;
	public HinhVuong(double canh) {
		super();
		this.canh = canh;
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return canh * canh;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return canh * canh;
	}

}
