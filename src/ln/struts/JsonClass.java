package ln.struts;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class JsonClass extends ActionSupport{

	private int len;
	private String str;
	private List list;
	private Map map;
	
	
	public int getLen() {
		return len;
	}


	public void setLen(int len) {
		this.len = len;
	}


	public String getStr() {
		return str;
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
		len=12;
		str="dsa";
		list=new ArrayList();
		map=new HashMap();
		list.add("aa");
		list.add(23);
		map.put("zhnagsan", 12);
		map.put("lisi", 12);
		
		System.out.println("in jsonClass");
		return "success";
	}

	
}
