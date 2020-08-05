package ln.spring.test;

public abstract class AbPerson {

	public abstract Cat getCat();
	public void sayCat() {
		System.out.println(getCat());
		System.out.println("名字叫做"+getCat().getName()+"的猫在爬树");
	}
	
}
