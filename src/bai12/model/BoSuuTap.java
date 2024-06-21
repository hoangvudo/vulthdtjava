package bai12.model;

import java.util.ArrayList;
import java.util.List;

public class BoSuuTap {
	List<HinhHoc> dshh;

	public BoSuuTap(List<HinhHoc> dshh) {
		super();
		this.dshh = new ArrayList<HinhHoc>();
		
	}
	public void addHinhHoc (HinhHoc hh) throws CloneNotSupportedException {
		this.dshh.add((HinhHoc)hh.clone());
	}
	public List<HinhHoc> getDshh() {
		return dshh;
	}
	public void setDshh(List<HinhHoc> dshh) {
		this.dshh = dshh;
	}
	@Override
	public String toString() {
		return "BoSuuTap [dshh=" + dshh + "]";
	}
	
}
