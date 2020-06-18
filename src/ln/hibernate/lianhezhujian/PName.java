package ln.hibernate.lianhezhujian;

import java.io.Serializable;

import javax.persistence.Column;

public class PName implements Serializable{

	@Column(length=100)
	private String nowName;
	@Column(length=100)
	private String lastName;
	
	public PName() {}
	public PName(String nowName,String lastName) {
		this.nowName=nowName;
		this.lastName=lastName;
	}
	public String getNowName() {
		return nowName;
	}
	public void setNowName(String nowName) {
		this.nowName = nowName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public int hashCode() {
		return nowName.hashCode()*31+lastName.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null&&obj.getClass()== Person.class) {
			PName pm=(PName)obj;
			return (this.lastName.equals(pm.getLastName())&&this.nowName.equals(pm.getNowName()));
		}else {
			return false;
		}
	}
}
