package generic04_extends;

public class Child<C,T,M> extends Parent<T,M>{
	
	private C company;

	// getter setter
	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
	
}
