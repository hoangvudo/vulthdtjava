package bai09;

import bai09.vidu4.BanhXe;
import bai09.vidu4.DongCo;
import bai09.vidu4.XeHoi;

public class QuanHeComposition2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DongCo dc = new DongCo("Xang");
		BanhXe bx = new BanhXe("VIP", 4.5);
		XeHoi car = new XeHoi(dc);
		for (int i = 0; i <4 ; i++) {
		car.addBanhXe(bx);
	}
		System.out.println("Cau Hinh Xe Ban Dau");
		System.out.println(car);
		System.out.println("thay doi cac linh kien");
		dc.setLoaiDongCo("Dien");
		System.out.println("thay doi dong co" + dc);
		bx.setBanKinh(5);
		System.out.println(7                                                                                                                                                                                                                          );
		
}

}
