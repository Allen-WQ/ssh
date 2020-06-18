package ln.hibernate.lianhezhujian;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_person")
public class Person implements Serializable{

//	@Id
//	@Column(length=100)
//	private String lastName;
//	@Id
//	@Column(length=100)
//	private String nowName;
	@EmbeddedId
	private PName name;
	private String sex;
	private int age;
	
	
	public PName getName() {
		return name;
	}
	public void setName(PName name) {
		this.name = name;
	}
	//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getNowName() {
//		return nowName;
//	}
//	public void setNowName(String nowName) {
//		this.nowName = nowName;
//	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	@Override
//	public int hashCode() {
//		return nowName.hashCode()*31+lastName.hashCode();
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if(obj!=null&&obj.getClass()== Person.class) {
//			Person per=(Person)obj;
//			return (this.lastName.equals(per.getLastName())&&this.nowName.equals(per.getNowName()));
//		}else {
//			return false;
//		}
//	}
	
	
}
