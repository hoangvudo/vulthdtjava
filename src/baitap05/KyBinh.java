package baitap05;

public class KyBinh extends nhanVat {
	private boolean guom;
	private boolean giap;
	private boolean giao;
	private boolean ngua;
	
	public KyBinh(String ten, String id, byte gioiTinh, double nangLuong, boolean guom, boolean giap, boolean giao,
			boolean ngua) {
		super(ten, id, gioiTinh, nangLuong);
		this.guom = guom;
		this.giap = giap;
		this.giao = giao;
		this.ngua = ngua;
	}

	public boolean isGuom() {
		return guom;
	}

	public void setGuom(boolean guom) {
		this.guom = guom;
	}

	public boolean isGiap() {
		return giap;
	}

	public void setGiap(boolean giap) {
		this.giap = giap;
	}

	public boolean isGiao() {
		return giao;
	}

	public void setGiao(boolean giao) {
		this.giao = giao;
	}

	public boolean isNgua() {
		return ngua;
	}

	public void setNgua(boolean ngua) {
		this.ngua = ngua;
	}

	@Override
	public String toString() {
		return "KyBinh [guom=" + guom + ", giap=" + giap + ", giao=" + giao + ", ngua=" + ngua + "]";
	}

	@Override
	public void hanhDong() {
		// TODO Auto-generated method stub
		System.out.println("Coi ngua ban ten");
		super.hanhDong();
	}

	@Override
	public void sucManh() {
		// TODO Auto-generated method stub
		double energy = this.getNangLuong()*2;
		System.out.println("Suc manh cua ky binh la :" + energy);
		
	}
	
}
