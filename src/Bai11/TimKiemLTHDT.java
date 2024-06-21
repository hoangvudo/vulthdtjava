package Bai11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import Bai11.model1.SinhVien;

public class TimKiemLTHDT {

	public static void main(String[] args) {
		// tao du lieu
		List<SinhVien> dssv = new ArrayList<SinhVien>();
		dssv.add(new SinhVien("Thong", 10, 17));
		dssv.add(new SinhVien("Khoa", 9, 19));
		dssv.add(new SinhVien("Hoang", 8, 20));
		dssv.add(new SinhVien("Quang", 7, 18));
		System.out.println("danh sach ban dau");
		for(SinhVien item : dssv) {
			System.out.println(item);
		}
		System.out.println("-------------------");
		// tim kiem sinh vien theo dtb thap nhat
		SinhVien sv_dtb_min = Collections.min(dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getDtb(), o2.getDtb());
			}
		});
		System.out.println("Sinh vien co diem trung binh thap nhat la :");
		System.out.println(sv_dtb_min);
		System.out.println("-------------------");

		
		// tim kiem sinh vien co tuoi lon nhat
		SinhVien sv_tuoi_max = Collections.max(dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getTuoi(), o2.getTuoi());
			}
		});
		System.out.println("Sinh vien co tuoi lon nhat la :");
		System.out.println(sv_tuoi_max);
		System.out.println("-------------------");

		
		// tim kiem theo ten
		int sv_Khoa = Collections.binarySearch(dssv, new SinhVien("Khoa", 0, 0), 
				new Comparator<SinhVien>() {

					@Override
					public int compare(SinhVien o1, SinhVien o2) {
						// TODO Auto-generated method stub
						return o1.getTen().compareTo(o2.getTen());
					}
				});
		if (sv_Khoa < 0) {
			System.out.println("Khong tim thay ");
		}else {
			System.out.println("Vi tri cua sv co ten la Quy " + sv_Khoa);
			System.out.println(dssv.get(sv_Khoa));
		}
		System.out.println("--------------------------------");
		
		// tim kiem cac sinh vien co dtb >= 8 , dtb <= 10 , tuoi >= 18, tuoi <= 20
		List<SinhVien> kq_loc = dssv.stream()
		.filter(sv -> sv.getDtb() >= 8)
		.filter(sv -> sv.getDtb()<= 10)
		.filter(sv -> sv.getTuoi() >= 18)
		.filter(sv -> sv.getTuoi()<= 20)
		.toList();
		
		// in ra man hinh 
		System.out.println("Ket qua loc du lieu");
		for (SinhVien item : kq_loc) {
			System.out.println(item);
			System.out.println("--------------------------------");

		}
		
		// su dung Predicate
		Predicate<SinhVien> dk_dtb_tuoi = new Predicate<SinhVien>() {
			
			@Override
			public boolean test(SinhVien t) {
				// TODO Auto-generated method stub
				return (t.getDtb() >= 8 && t.getDtb() <= 10) || (t.getTuoi()>=18 && t.getTuoi() <= 20);
			}
		};
		// loc du lieu 
		List<SinhVien> dskq = dssv.stream()
				.filter(dk_dtb_tuoi)
				.toList();
		System.out.println("Xuat ket qua su dung vi tu Predicate");
		for(SinhVien item : dskq) {
			System.out.println(item);
			System.out.println("--------------------------------");

		}
	}
	
}
