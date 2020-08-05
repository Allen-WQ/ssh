package ln.struts;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TwoInterceptor implements Interceptor{

	@Override
	public void destroy() {
		System.out.println("销毁第二个拦截器");
	}

	@Override
	public void init() {
		System.out.println("创建第二个拦截器");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("进入第二个拦截器");
		arg0.invoke();
		return "login";
	}

}
