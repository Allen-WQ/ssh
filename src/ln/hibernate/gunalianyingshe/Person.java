package ln.hibernate.gunalianyingshe;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person_inf")
public class Person {

	@Id
	@GeneratedValue
	private int id;
	private int age;
	private String name;
	private String sex;
	//���һ һ�㲻���ù������� ��Ϊ���Ǵӱ�����Ĺ�ϵ
//	@ManyToOne(targetEntity=LocalInf.class,cascade=CascadeType.ALL)
//	@JoinColumn(name="local_inf",nullable=false)
	//һ��һ
	@OneToOne(targetEntity=LocalInf.class)
	@JoinColumn(name="local_inf",unique=true)
	private LocalInf locals;
	//����һ�Զ�
	@OneToMany(targetEntity=Address.class,cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="person_id")
	//˫��һ�Զ�
//	@OneToMany(targetEntity=Address.class,cascade=CascadeType.ALL,mappedBy="person")
	//˫���Զ�
//	@ManyToMany(targetEntity=Address.class,cascade=CascadeType.ALL)
//	@JoinTable(name="person_address",joinColumns=@JoinColumn(name="person_id",referencedColumnName="id"),inverseJoinColumns=@JoinColumn(name="address_id",referencedColumnName="id"))
	private Set<Address> address=new HashSet<>();
	
	
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public LocalInf getLocals() {
		return locals;
	}
	public void setLocals(LocalInf locals) {
		this.locals = locals;
	}
	
	
}
