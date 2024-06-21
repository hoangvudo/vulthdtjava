package bai10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bai10.model2.SinhVien;

public class SapXeSinhVienVer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SinhVien> dssv = new ArrayList<SinhVien>();
		dssv.add(new SinhVien("Loc", 10, 20));		
		dssv.add(new SinhVien("Nhat", 8, 18));
		dssv.add(new SinhVien("Binh", 9, 19));
		
		System.out.println("Sap xep theo ho ten");
		Collections.sort(dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return o1.getHoTen().compareTo(o2.getHoTen());
			}
			
		});
		for (SinhVien item:dssv) {
			System.out.println(item);
		}
		
		
		Collections.sort(dssv, new Comparator<SinhVien>() {
			
			
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getDtb(), o2.getDtb());
			}
			
		});
		for(SinhVien item : dssv) {
			System.out.println(item);
		}
	}
}


