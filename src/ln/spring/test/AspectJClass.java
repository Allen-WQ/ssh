package ln.spring.test;



import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

import ln.bookSystem.implService.ReaderServiceImpl;

@Aspect
public class AspectJClass {
	/*
	 * JoinPoint的常用方法
	 * java.lang.Object[] getArgs()：获取连接点方法运行时的入参列表
		Signature getSignature() ：获取连接点的方法签名对象
		java.lang.Object getTarget() ：获取连接点所在的目标对象
		java.lang.Object getThis() ：获取代理对象本身
	 */
	public void addBefore(JoinPoint point) {
		ReaderServiceImpl reader=(ReaderServiceImpl)point.getTarget();
		System.out.println(reader.getName());
		System.out.println(point.getSignature().getName());
		System.out.println(point.getThis());
		System.out.println(Arrays.asList(point.getArgs()));
		System.out.println("事务开启");
	}
	
	public void addAfter(JoinPoint point) {
		System.out.println("事务关闭");
	}
	//目标方法正常执行完成后才会织入此方法
	public void afterRenturnning(JoinPoint point ,Object result) {
		System.out.println("return 的返回值对象："+result);
	}
	
	public void afterThrowing(JoinPoint point,IndexOutOfBoundsException e) {
		System.out.println("异常通知"+e);
	}
	/*
		ProceedingJoinPoint继承了JoinPoint方法 并暴露出了proceed方法
	*/
	public Object addAround(ProceedingJoinPoint point) {
		System.out.println("环绕方法执行之前");
		Object result=null;
		try {
			result=point.proceed();
			System.out.println("方法返回值"+result);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("环绕方法执行之后");
		return result;
	}
	
}
