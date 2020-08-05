package ln.struts;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class InterceptorClass implements Interceptor{

	@Override
	public void destroy() {
		System.out.println("拦截器销毁");
	}

	@Override
	public void init() {
		System.out.println("拦截器创建");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("进入拦截器逻辑方法");
		arg0.addPreResultListener(new MyPreResultListener());
		String result = arg0.invoke();
		return "login";
	}



}
