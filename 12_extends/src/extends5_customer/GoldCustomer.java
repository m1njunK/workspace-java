package extends5_customer;

public class GoldCustomer extends Customer{
	
	double saleRatio;			// 골드 등급은 할인율 적용

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		super.customerGrade = "GOLD";
		super.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price - (int) (price * saleRatio);
	}
	
}
