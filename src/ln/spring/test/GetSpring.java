package ln.spring.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class GetSpring implements ApplicationContextAware{

	private ApplicationContext ctx;
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.ctx=arg0;
	}
	
	public void testCtx() {
		System.out.println(ctx);
	}
	
	public void initMethod() {
		System.out.println("进入getSpring的初始化方法");
	}
	
	public void destoryMethod() {
		System.out.println("进入getSpring的销毁方法");
	}
}
