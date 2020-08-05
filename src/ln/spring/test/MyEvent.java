package ln.spring.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent implements ApplicationContextAware{
	
	private int id;
	private String name;

	private ApplicationContext ctx;
	//会在构造器执行完毕之后被系统调用
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.ctx=arg0;
		ctx.publishEvent(this);
	}
	
	public MyEvent(Object source) {
		super(source);
	}
	
	public MyEvent(Object source,int id,String name) {
		super(source);
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
