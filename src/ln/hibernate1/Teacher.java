package ln.hibernate1;

public class Teacher {

	private String name;
	private String teach;
	
	public Teacher() {}
	public Teacher(String name,String teach) {
		this.name=name;
		this.teach=teach;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeach() {
		return teach;
	}
	public void setTeach(String teach) {
		this.teach = teach;
	}
	
	
}
