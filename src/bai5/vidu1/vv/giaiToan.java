package bai5.vidu1.vv;

import bai5.vidu2.mathHelper;

public class giaiToan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mathHelper obj = new mathHelper();
		int tong_so_nguyen = obj.sum(15, 30);
		System.out.println("Tong 2 so nguyen la :"+ tong_so_nguyen);
		System.out.println("Tong 2 so thuc la :"+ obj.sum(2.5, 3.4));
		
	}

}
