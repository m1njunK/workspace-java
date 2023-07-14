package extends5_customer;

// 할인율이 적용이 되고
// 고객을 담당하는 직원이 있는 고객
public class VIPCustomer extends GoldCustomer{
	
	private int agentID;		// 담당 직원

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		super.saleRatio = 0.2;
		this.agentID = agentID;
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo()+" 담당 직원 번호는 : " + this.agentID + "입니다.";
	}
	
}
