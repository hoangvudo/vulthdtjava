package bai04.vidu02;

public class LopCon extends LopCha {
	private String thuocTinh;

	public LopCon(String thuocTinh1, int thuocTinh2, double thuocTinh3, String thuocTinh) {
		super(thuocTinh1, thuocTinh2, thuocTinh3);
		this.thuocTinh = thuocTinh;
	}

	public String getThuocTinh() {
		return thuocTinh;
	}

	public void setThuocTinh(String thuocTinh) {
		this.thuocTinh = thuocTinh;
	}

	@Override
	public String toString() {
		return "LopCon [thuocTinh=" + thuocTinh + "]";
	}
	
}
