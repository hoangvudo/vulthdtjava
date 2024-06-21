package baitapvenha;

public class Bill {
	
	private int billID;
	private Product[] products;
	public Bill() {
		
	}
	public Bill(int billID, Product[] products) {
		super();
		this.billID = billID;
		this.products = products;
	}
	public int getBillID() {
		return billID;
	}
	public void setBillID(int billID) {
		this.billID = billID;
	}
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
	@Override
	public String toString() {
		String ketQua = "Bill" + this.billID;
		return ketQua;
	}
	
	
}
