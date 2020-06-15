package ln.hibernate;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyClass;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderBy;
import javax.persistence.OrderColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Formula;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SortNatural;

import ln.enumPack.DogClassifl;

@Entity
public class Dog {
	@Id
	@GenericGenerator(name="aa",strategy="uuid")
	@GeneratedValue(generator="aa")
	private String id;
	private String name;
	private String sex;
	private int age;
	@Formula("(select concat(name,sex) from dog where id=id)")
	private String nameAndSex;
	private DogClassifl state;
	//限定数据库中时间类型的格式  没有此注解的话数据库中显示的是日期与时间
	@Temporal(TemporalType.DATE)
	private Date birth;
	@ElementCollection(targetClass=String.class)
	@CollectionTable(name="childs_inf",joinColumns=@JoinColumn(name="fId",nullable=false))
	@Column(name="child_name")
	@OrderColumn(name="list_order")
	private List childs=new ArrayList();
	@ElementCollection(targetClass=String.class)
	@CollectionTable(name="parent_inf",joinColumns=@JoinColumn(name="sId",nullable=false))
	@Column(name="pName")
	@OrderColumn(name="id")
	private String[] parent;
	
	@ElementCollection(targetClass=String.class)
	@CollectionTable(name="loc_inf",joinColumns=@JoinColumn(name="dog_Id",nullable=false))
	@Column(name="loName")
	@OrderBy("loName desc")//desc降序 asc升序
	private Set<String> locals=new HashSet<>();
	
	@ElementCollection(targetClass=Float.class)
	@CollectionTable(name="body_inf",joinColumns=@JoinColumn(name="dId",nullable=false))
	@MapKeyColumn(name="bName",length=128)
	@MapKeyClass(String.class)
	@Column(name="val_inf")
	private Map<String,Float> body=new HashMap<>();
	
	public Map<String, Float> getBody() {
		return body;
	}
	public void setBody(Map<String, Float> body) {
		this.body = body;
	}
	public Set<String> getLocals() {
		return locals;
	}
	public void setLocals(Set<String> locals) {
		this.locals = locals;
	}
	public String[] getParent() {
		return parent;
	}
	public void setParent(String[] parent) {
		this.parent = parent;
	}
	public List getChilds() {
		return childs;
	}
	public void setChilds(List childs) {
		this.childs = childs;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public DogClassifl getState() {
		return state;
	}
	public void setState(DogClassifl state) {
		this.state = state;
	}
	public String getNameAndSex() {
		return nameAndSex;
	}
	public void setNameAndSex(String nameAndSex) {
		this.nameAndSex = nameAndSex;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
