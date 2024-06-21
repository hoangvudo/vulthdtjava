package DeepCloning;

public class QL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron o1 = new HinhTron(7);
		HinhTron o2 = o1;
		o2.setBanKinh(15);
		System.out.println(o1,o2);

	}

}
