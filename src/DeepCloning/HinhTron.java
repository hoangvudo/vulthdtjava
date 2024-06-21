package DeepCloning;

public class HinhTron {
	public double banKinh;

	public HinhTron(double banKinh) {
		super();
		this.banKinh = banKinh;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	@Override
	public String toString() {
		return "HinhTron [banKinh=" + banKinh + "]";
	}
	
	
}
