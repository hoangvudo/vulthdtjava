package bai04.vidu02;

import baitap05.KyBinh;
import baitap05.PhuThuy;
import baitap05.boBinh;

public class QuanLyGame {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		KyBinh kb = new KyBinh("Phong","ITA12312",(byte) 1, 9.5, true, true, false, false);
		System.out.println(kb);
		kb.hanhDong();
		kb.sucManh();
		kb.sangPhai();
		kb.tanCongCoVuKhi();
		boBinh bb = new boBinh("Vu", "TIA3212", (byte)1, 20, 1, true, false);
		System.out.println(bb);
		bb.hanhDong();
		bb.sucManh();
		bb.sangPhai();
		bb.nhayLen();
		bb.tanCongCoVuKhi();
		PhuThuy pt = new PhuThuy("Tuan", "TIA312312",(byte) 1, 20, true, true);
		System.out.println(pt);
		pt.hanhDong();
		pt.sucManh();
		pt.sangTrai();
		pt.tanCongKhongVuKhi();
	}
	
	
}