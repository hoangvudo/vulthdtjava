package bai09;

import bai09.vidu2.HoaDon;
import bai09.vidu2.SanPham;

public class QuanHeAggregation {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham("Caffe den", 20);
		HoaDon hd = new HoaDon(15);
		hd.addSanPham(sp1);
		SanPham sp2 = new SanPham("Caffe sua", 15);
		hd.addSanPham(sp2);
		System.out.println(hd);
		sp2.setTenSanPham("Ruou Vang");
		System.out.println(hd);


	}

}
