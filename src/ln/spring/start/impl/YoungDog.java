package ln.spring.start.impl;

import ln.spring.start.inter.Dog;

public class YoungDog implements Dog{

	private String name;
	private String age;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public void sayType() {
		System.out.println(type);
	}
	
	
}
