package ln.enumPack;

public enum DogClassifl {
 
		LITTLE(0,"��С"),YOUNG(1,"����"),OLD(2,"����");
	private int code;
	private String message;
	DogClassifl(int code,String message){
		this.code=code;
		this.message=message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
