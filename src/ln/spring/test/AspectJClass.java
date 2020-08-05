package ln.spring.test;



import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

import ln.bookSystem.implService.ReaderServiceImpl;

@Aspect
public class AspectJClass {
	/*
	 * JoinPoint�ĳ��÷���
	 * java.lang.Object[] getArgs()����ȡ���ӵ㷽������ʱ������б�
		Signature getSignature() ����ȡ���ӵ�ķ���ǩ������
		java.lang.Object getTarget() ����ȡ���ӵ����ڵ�Ŀ�����
		java.lang.Object getThis() ����ȡ���������
	 */
	public void addBefore(JoinPoint point) {
		ReaderServiceImpl reader=(ReaderServiceImpl)point.getTarget();
		System.out.println(reader.getName());
		System.out.println(point.getSignature().getName());
		System.out.println(point.getThis());
		System.out.println(Arrays.asList(point.getArgs()));
		System.out.println("������");
	}
	
	public void addAfter(JoinPoint point) {
		System.out.println("����ر�");
	}
	//Ŀ�귽������ִ����ɺ�Ż�֯��˷���
	public void afterRenturnning(JoinPoint point ,Object result) {
		System.out.println("return �ķ���ֵ����"+result);
	}
	
	public void afterThrowing(JoinPoint point,IndexOutOfBoundsException e) {
		System.out.println("�쳣֪ͨ"+e);
	}
	/*
		ProceedingJoinPoint�̳���JoinPoint���� ����¶����proceed����
	*/
	public Object addAround(ProceedingJoinPoint point) {
		System.out.println("���Ʒ���ִ��֮ǰ");
		Object result=null;
		try {
			result=point.proceed();
			System.out.println("��������ֵ"+result);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("���Ʒ���ִ��֮��");
		return result;
	}
	
}
