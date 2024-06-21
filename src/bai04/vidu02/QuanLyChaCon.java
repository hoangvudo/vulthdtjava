package bai04.vidu02;

public class QuanLyChaCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LopCha obj1 = new LopCha("Lop cha",15, 3.1512);
		obj1.thuocTinh2 = 16;
		obj1.thuocTinh3 = 7.5;
		System.out.println(obj1);
		obj1.phuongThuc3();
		obj1.phuongThuc2();
		obj1.vidugoiprivate();
		System.out.println(obj1);
		
		LopCon obj2 = new LopCon("Vũ", 10, 110, "CNTT K21");
		obj2.phuongThuc2();
	}

}
