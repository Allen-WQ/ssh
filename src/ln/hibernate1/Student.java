package ln.hibernate1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
@Entity
public class Student {

	@Id
	@GeneratedValue
	private int id;
	@Embedded
	private SName name=new SName();
	@ElementCollection(targetClass=Teacher.class)
	@CollectionTable(name="teacher_inf" , joinColumns=@JoinColumn(name="sId",nullable=false))
	@Embedded
	@OrderColumn(name="tId")
	private List<Teacher> teacher=new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public SName getName() {
		return name;
	}
	public void setName(SName name) {
		this.name = name;
	}
	public List<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
	
	
}
