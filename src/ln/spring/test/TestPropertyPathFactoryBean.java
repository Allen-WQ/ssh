package ln.spring.test;
/*
 * ����ָ�����get����
 */
public class TestPropertyPathFactoryBean {

	private String name;
	private int age;
	private Cat cat;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	
}