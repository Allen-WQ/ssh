package ln.spring.test;

import org.springframework.cache.annotation.Cacheable;

@Cacheable("users")
public class CacheTest {
	private int age;
	private String name;
	
	public CacheTest() {} 
	
	public CacheTest(int age,String name) {
		this.name=name;
		this.age=age;
	}
	
	public CacheTest getCache(int age,String name) {
		return new CacheTest(age,name);
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




	public Object add(String name,int b) {
		System.out.println("Ö´ÐÐ·½·¨");
		return this+name+b;
	}
}
