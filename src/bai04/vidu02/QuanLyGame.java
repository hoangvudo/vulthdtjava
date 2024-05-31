package bai04.vidu02;

import baitap05.KyBinh;

public class QuanLyGame {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		KyBinh kb = new KyBinh("Phong","ITA12312",(byte) 1, 9.5, true, true, false, false);
		System.out.println(kb);
		kb.hanhDong();
		kb.sucManh();
		
	}

}