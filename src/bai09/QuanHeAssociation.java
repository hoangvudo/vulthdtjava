package bai09;

import bai09.vidu1.LopHoc;
import bai09.vidu1.SinhVien;

public class QuanHeAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv = new SinhVien("Son", new LopHoc ( "K21 CNTT"));
		System.out.println(sv);
		LopHoc lop = new LopHoc("K21 CNTT");
		lop.addSinhVien(sv);
		System.out.println(lop);
	}

}
