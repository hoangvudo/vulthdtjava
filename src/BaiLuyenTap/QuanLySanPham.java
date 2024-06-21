package BaiLuyenTap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import model.BanhXe;
import model.DongCo;
import model.LapTop;
import model.SanPham;
import model.XeHoi;

public class QuanLySanPham {

	public static void main(String[] args) throws CloneNotSupportedException {
		// tao list 5 xe hoi
		List<XeHoi> cars = new ArrayList<XeHoi>();
		XeHoi car1 = new XeHoi(1, "Toyota", 2, 1000, new DongCo("Dong co xang", 140));
		car1.addBanhXe(new BanhXe("caosu", 1.5));
		car1.addBanhXe(new BanhXe("caosu", 1.5));
		car1.addBanhXe(new BanhXe("caosu", 1.5));
		car1.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car1);
		XeHoi car2 = new XeHoi(1, "Vinfast", 2, 1500, new DongCo("Dong co dien", 140));
		car2.addBanhXe(new BanhXe("caosu", 1.5));
		car2.addBanhXe(new BanhXe("caosu", 1.5));
		car2.addBanhXe(new BanhXe("caosu", 1.5));
		car2.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car2);
		XeHoi car3 = new XeHoi(1, "Lambo", 2, 1000, new DongCo("Dong co xang", 140));
		car3.addBanhXe(new BanhXe("caosu", 1.5));
		car3.addBanhXe(new BanhXe("caosu", 1.5));
		car3.addBanhXe(new BanhXe("caosu", 1.5));
		car3.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car3);
		XeHoi car4 = new XeHoi(1, "Audi", 2, 2000, new DongCo("Dong co xang", 140));
		car4.addBanhXe(new BanhXe("caosu", 1.5));
		car4.addBanhXe(new BanhXe("caosu", 1.5));
		car4.addBanhXe(new BanhXe("caosu", 1.5));
		car4.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car4);
		XeHoi car5 = new XeHoi(1, "Honda", 2, 1000, new DongCo("Dong co xang", 140));
		car5.addBanhXe(new BanhXe("caosu", 1.5));
		car5.addBanhXe(new BanhXe("caosu", 1.5));
		car5.addBanhXe(new BanhXe("caosu", 1.5));
		car5.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car5);
		System.out.println("danh sach xe hoi");
		for (XeHoi item : cars) {
			System.out.println(item);
		}
		//Tao list 7 laptop
				List<LapTop> lts = new ArrayList<LapTop>();
				lts.add(new LapTop(1, "Dell", 1, 150000, 16, "i7"));
				lts.add(new LapTop(2, "MSI", 1, 170000, 32, "i9"));
				lts.add(new LapTop(3, "Lenovo", 1, 150000, 16, "i7"));
				lts.add(new LapTop(4, "Mac Air 3", 1, 150000, 16, "i7"));
				lts.add(new LapTop(5, "HP", 1, 150000, 16, "i7"));
				lts.add(new LapTop(6, "ROG", 1, 150000, 16, "i7"));
				lts.add(new LapTop(7, "Asus", 1, 150000, 16, "i7"));
				System.out.println("Danh sach may tinh");
				for (LapTop item: lts) {
					System.out.println(item);
				}
				// sap xep theo gia latop
				Collections.sort(lts, new Comparator<LapTop>() {

					@Override
					public int compare(LapTop o1, LapTop o2) {
						return Integer.compare(o1.getRam(), o2.getRam());
					}
				});
				System.out.println("Sap xep theo ram");
				for (LapTop item : lts) {
					System.out.println(item);
				}
			}
		// tim kiem theo predicate
		Predicate<SanPham> dk_tk = new Predicate<SanPham>() {
			
			@Override
			public boolean test(SanPham t) {
				// TODO Auto-generated method stub
				return t.getGiaCa()>= 1000 && t.getSoLuong() <=5;
				
			}
		};
		
	
		}