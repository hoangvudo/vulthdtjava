package model1.luyentap;

public class KyBinh extends NhanVat {
	private String guom;
	private String giao;
	private String cung;
	private String ngua;
	private int soNamDaoTao;
	public KyBinh(String ten, int id, String gioiTinh, double nangLuong, String guom, String giao, String cung,
			String ngua, int soNamDaoTao) {
		super(ten, id, gioiTinh, nangLuong);
		this.guom = guom;
		this.giao = giao;
		this.cung = cung;
		this.ngua = ngua;
		this.soNamDaoTao = soNamDaoTao;
	}
	public String getGuom() {
		return guom;
	}
	public void setGuom(String guom) {
		this.guom = guom;
	}
	public String getGiao() {
		return giao;
	}
	public void setGiao(String giao) {
		this.giao = giao;
	}
	public String getCung() {
		return cung;
	}
	public void setCung(String cung) {
		this.cung = cung;
	}
	public String getNgua() {
		return ngua;
	}
	public void setNgua(String ngua) {
		this.ngua = ngua;
	}
	public int getSoNamDaoTao() {
		return soNamDaoTao;
	}
	public void setSoNamDaoTao(int soNamDaoTao) {
		this.soNamDaoTao = soNamDaoTao;
	}
	@Override
	public String toString() {
		return "KyBinh [guom=" + guom + ", giao=" + giao + ", cung=" + cung + ", ngua=" + ngua + ", soNamDaoTao="
				+ soNamDaoTao + "]";
	}
	
}
