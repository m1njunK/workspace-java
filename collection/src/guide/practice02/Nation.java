package guide.practice02;

import java.util.Objects;

public class Nation {
	
	private String country;	// 국가 이름
	private String capital;	// 수도 이름
	
	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}
	
	public String getCountry() {
		return country;
	}

	public String getCapital() {
		return capital;
	}

	@Override
	public int hashCode() {
		return Objects.hash(country);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nation other = (Nation) obj;
		return Objects.equals(country, other.country);
	}
}
