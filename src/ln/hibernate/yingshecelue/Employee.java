package ln.hibernate.yingshecelue;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Ô±¹¤")
public class Employee extends Person{

	private String title;
	private String yId;
	@OneToMany(cascade=CascadeType.ALL,targetEntity=Customer.class)
	@JoinColumn(name="EId")
	private Set<Customer> customer=new HashSet<>();
	@ManyToOne(cascade=CascadeType.ALL,targetEntity=Manager.class)
	@JoinColumn(name="MId")
	private Manager manager;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getyId() {
		return yId;
	}
	public void setyId(String yId) {
		this.yId = yId;
	}
	public Set<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
}
