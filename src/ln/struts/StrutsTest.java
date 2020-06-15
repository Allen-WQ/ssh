package ln.struts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class StrutsTest extends ActionSupport{

	private int len;
	private String str;
	private List list;
	private Map map;
	private Dog dog;
	
	public int getLen() {
		return len;
	}


	public void setLen(int len) {
		this.len = len;
	}


	public String getStr() {
		return str;
	}


	public Dog getDog() {
		return dog;
	}


	public void setDog(Dog dog) {
		this.dog = dog;
	}


	public void setStr(String str) {
		this.str = str;
	}


	public List getList() {
		return list;
	}


	public void setList(List list) {
		this.list = list;
	}


	public Map getMap() {
		return map;
	}


	public void setMap(Map map) {
		this.map = map;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("aaaa");
		return "success";
	}
	
	public String login() {
		len=12;
		str="dsa";
		list=new ArrayList();
		map=new HashMap();
		list.add("aa");
		list.add(23);
		map.put("zhnagsan", 12);
		map.put("lisi", 12);
		return "success";
		
	}
	
	public String loginSubmit() {
		System.out.println("进入系统");
//		System.out.println(dog.getAge());
//		System.out.println(dog.getName());
		return "success";
	}
	
	public String fileUpPage() {
		System.out.println("进入文件上传界面");
		return "success";
		
	}
}
