package ln.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		//bean��ȡspringcontext
//		GetSpring gs=ctx.getBean("getSpring",GetSpring.class);
//		gs.testCtx();
//		GetSpring a=ctx.getBean("getSpring",GetSpring.class);
//		a.testCtx();
		
		//��̬������ȡbean
//		Person t=ctx.getBean("student",Person.class);
//		t.sayName();
		//ʵ��������ȡbean
//		Person t=ctx.getBean("beanStudent",Person.class);
//		t.sayName();
		
		//���Լ̳г���bean
//		Person t=ctx.getBean("abstractBean",Person.class);
//		t.sayName();
		
		//����singleton����prototype��bean
//		AbPerson ab=ctx.getBean("abPerson",AbPerson.class);
//		ab.sayCat();
//		AbPerson ap=ctx.getBean("abPerson",AbPerson.class);
//		ap.sayCat();
		
		//����ʹ��PropertyPathFactoryBean����ָ��beanָ��������get����
//		System.out.println(ctx.getBean("getName"));
//		System.out.println(ctx.getBean("getAge"));
//		System.out.println(ctx.getBean("getCatName"));
//		System.out.println(ctx.getBean("propertyPathFactoryBeanSetName",TestPropertyPathFactoryBean.class).getName());
//		System.out.println(ctx.getBean("propertyPathFactoryBean1",TestPropertyPathFactoryBean.class).getName());
		
//		����ʹ��FieldRetrievingFactoryBean��ȡ�����Ի�ʵ�����Ե�ֵ
//		System.out.println(ctx.getBean("getFiledName"));
//		System.out.println(ctx.getBean("getFiledAge"));
//		System.out.println(ctx.getBean("getEasyName"));
		//����bean������
//		System.out.println(ctx.getBean("beanPostCat"));
		
		//����aop������
//		ln.bookSystem.action.Person readerA=ctx.getBean("readerAction",ln.bookSystem.action.Person.class);
//		readerA.add();
		
		//����cache
		
		CacheTest ct=ctx.getBean("cacheTest",CacheTest.class);
		System.out.println(ct.getCache(2,"zhangsan")==ct.getCache(2,"zhangsan"));
	}
}
