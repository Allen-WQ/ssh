package ln.struts;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextUtil implements ApplicationContextAware{

	private static ApplicationContext ctx=null;
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		ctx=arg0;
	}
	public static ApplicationContext getCtx() {
		return ctx;
	}
}
