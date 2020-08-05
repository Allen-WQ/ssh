package ln.struts;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class InterceptorClass implements Interceptor{

	@Override
	public void destroy() {
		System.out.println("����������");
	}

	@Override
	public void init() {
		System.out.println("����������");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("�����������߼�����");
		arg0.addPreResultListener(new MyPreResultListener());
		String result = arg0.invoke();
		return "login";
	}



}
