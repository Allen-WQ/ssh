package ln.spring.test;

public class Student implements Person{

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayName() {
		System.out.println("我的名字叫做"+name);
	}

}
