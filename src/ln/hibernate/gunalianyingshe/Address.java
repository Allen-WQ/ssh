package ln.hibernate.gunalianyingshe;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="address_inf")
public class Address {
	@Id
	@GeneratedValue
	private int id;
	private String mark;
//	@ManyToOne(targetEntity=Person.class,cascade=CascadeType.ALL)
//	@JoinColumn(name="person_id",nullable=false)
//	private Person person;
//	
//	public Person getPerson() {
//		return person;
//	}
//	public void setPerson(Person person) {
//		this.person = person;
//	}
//	@ManyToMany(targetEntity=Person.class,cascade=CascadeType.ALL)
//	@JoinTable(name="person_address",joinColumns=@JoinColumn(name="address_id",referencedColumnName="id"),inverseJoinColumns=@JoinColumn(name="person_id",referencedColumnName="id"))
//	private Set<Person> persons=new HashSet<>();
//
//	public Set<Person> getPersons() {
//		return persons;
//	}
//	public void setPersons(Set<Person> persons) {
//		this.persons = persons;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	
}
