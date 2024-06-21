package bai09;

import bai09.vidu3.BanhXe;
import bai09.vidu3.DongCo;
import bai09.vidu3.XeHoi;

public class QuanHeCompposition {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DongCo dc = new DongCo("Xang", 15000);
		System.out.println("Dong co ban dau" + dc);
		XeHoi car = new XeHoi(dc);
		BanhXe bx1 = new BanhXe("VIP", 1.5);
		BanhXe bx2 = new BanhXe("THUONG", 1.5);
		BanhXe bx3 = new BanhXe("CO BAN", 1.5);
		car.addBanhXe(bx1);
		car.addBanhXe(bx2);
		car.addBanhXe(bx3);
		System.out.println(car);
		System.out.println("Thay doi dong co");
		dc.setLoaiDongCo("Dong co dien");
		System.out.println("Dong co thay doi" + dc);
		bx1.setBanKinh(1.8);
		System.out.println(car);
	}

}
