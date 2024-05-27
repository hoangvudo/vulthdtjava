package bai04.vidu1;

public class GiangVien extends Nguoi {
	private String masogv;
	private String trinhdo;
	private String chuyennganh;
	
	// constructor
	
	public GiangVien(String hoten, int namsinh, String masogv, String trinhdo, String chuyennganh) {
		super(hoten, namsinh);
		this.masogv = masogv;
		this.trinhdo = trinhdo;
		this.chuyennganh = chuyennganh;
	}
	// getters /sertters
	public String getMasogv() {
		return masogv;
	}

	public void setMasogv(String masogv) {
		this.masogv = masogv;
	}

	public String getTrinhdo() {
		return trinhdo;
	}

	public void setTrinhdo(String trinhdo) {
		this.trinhdo = trinhdo;
	}

	public String getChuyennganh() {
		return chuyennganh;
	}

	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}

	// to string
	public String toString() {
		return "GiangVien [masogv=" + masogv + ", trinhdo=" + trinhdo + ", chuyennganh=" + chuyennganh + ", toString()="
				+ super.toString() + "]";
	}
	
}
