package ln.spring.test;

public abstract class AbPerson {

	public abstract Cat getCat();
	public void sayCat() {
		System.out.println(getCat());
		System.out.println("���ֽ���"+getCat().getName()+"��è������");
	}
	
}
