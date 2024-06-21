package bai09.vidu1;

import java.util.ArrayList;
import java.util.List;

public class LopHoc {
	private String tenLop;
	private List<SinhVien> dssv;
	public LopHoc(String tenLop, List<SinhVien> dssv) {
		super();
		this.tenLop = tenLop;
		this.dssv = dssv;
	}
	
	
	public LopHoc(String tenLop) {
		super();
		this.tenLop = tenLop;
		this.dssv = new ArrayList<>();
	}
	public void addSinhVien(SinhVien sv) {
		this.dssv.add(sv);
	}


	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public List<SinhVien> getDssv() {
		return dssv;
	}
	public void setDssv(List<SinhVien> dssv) {
		this.dssv = dssv;
	}
	@Override
	public String toString() {
		return "LopHoc [tenLop=" + tenLop + ", dssv=" + dssv + "]";
	}
	
	
	
}
