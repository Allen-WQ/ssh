package ln.spring.test;

public class TestFieldRetrievingFactoryBean {

	public static String name;
	public int age;
	public Cat cat;
	public static void setName(String name) {
		TestFieldRetrievingFactoryBean.name = name;
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
