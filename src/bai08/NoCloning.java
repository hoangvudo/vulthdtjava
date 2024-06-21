package bai08;

import bai08.vidu1.SanPham;

public class NoCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham(12, "xiaomi");
		System.out.println(sp1);
		
		// thuc hien phep gan
		SanPham sp2 = sp1;
		sp2.setTenSanPham("nokia");
		
		// xuat gia tri
		System.out.println(sp1);
		System.out.println(sp2);

	}

}
