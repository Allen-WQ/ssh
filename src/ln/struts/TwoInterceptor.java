package ln.struts;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TwoInterceptor implements Interceptor{

	@Override
	public void destroy() {
		System.out.println("���ٵڶ���������");
	}

	@Override
	public void init() {
		System.out.println("�����ڶ���������");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("����ڶ���������");
		arg0.invoke();
		return "login";
	}

}
