package ln.hibernate.yingshecelue;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("¹Ë¿Í")
public class Customer extends Person{

	private String customers;

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}
}
