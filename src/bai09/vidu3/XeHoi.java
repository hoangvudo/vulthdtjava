package bai09.vidu3;

import java.util.ArrayList;

public class XeHoi {
	private DongCo dongco;
	private ArrayList<BanhXe> dsbx;
	public XeHoi(DongCo dongco, ArrayList<BanhXe> dsbx) throws CloneNotSupportedException {
		super();
		this.dongco = (DongCo)dongco.clone();
		this.dsbx = dsbx;
	}
	public XeHoi(DongCo dongco) throws CloneNotSupportedException {
		super();
		this.dongco = (DongCo)dongco.clone();
		this.dsbx = new ArrayList<BanhXe>();
	}
	public void addBanhXe(BanhXe bx) {
		this.dsbx.add(bx);
	}
	public DongCo getDongco() {
		return dongco;
	}
	public void setDongco(DongCo dongco) {
		this.dongco = dongco;
	}
	public ArrayList<BanhXe> getDsbx() {
		return dsbx;
	}
	public void setDsbx(ArrayList<BanhXe> dsbx) {
		this.dsbx = dsbx;
	}
	@Override
	public String toString() {
		return "XeHoi [dongco=" + dongco + ", dsbx=" + dsbx + "]";
	}
	 
}
