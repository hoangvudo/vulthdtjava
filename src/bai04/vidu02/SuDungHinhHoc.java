package bai04.vidu02;

import java.util.ArrayList;

import bai06.vidu1.HinhChuNhat;
import bai06.vidu1.HinhTron;

public class SuDungHinhHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron o1 = new HinhTron(3);
		HinhTron o2 = new HinhTron(4);
		HinhChuNhat n1 = new HinhChuNhat(4, 3);
		HinhChuNhat n2 = new HinhChuNhat(5, 3);
		 System.out.println("Dien tich cua hinh tron o1 = " + o1.tinhDienTich());
	        System.out.println("Dien tich cua hinh tron o2 = " + o2.tinhDienTich());
	        System.out.println("Dien tich cua hinh chu nhat n1 = " + n1.tinhDienTich());
	        System.out.println("Dien tich cua hinh chu nhat n2 = " + n2.tinhDienTich());
	    }
	// cach hay hon
	ArrayList<HinhTron> a = new ArrayList<>();
	

}
