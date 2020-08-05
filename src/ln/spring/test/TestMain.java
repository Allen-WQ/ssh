package ln.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		//bean获取springcontext
//		GetSpring gs=ctx.getBean("getSpring",GetSpring.class);
//		gs.testCtx();
//		GetSpring a=ctx.getBean("getSpring",GetSpring.class);
//		a.testCtx();
		
		//静态工厂获取bean
//		Person t=ctx.getBean("student",Person.class);
//		t.sayName();
		//实例工厂获取bean
//		Person t=ctx.getBean("beanStudent",Person.class);
//		t.sayName();
		
		//测试继承抽象bean
//		Person t=ctx.getBean("abstractBean",Person.class);
//		t.sayName();
		
		//测试singleton依赖prototype的bean
//		AbPerson ab=ctx.getBean("abPerson",AbPerson.class);
//		ab.sayCat();
//		AbPerson ap=ctx.getBean("abPerson",AbPerson.class);
//		ap.sayCat();
		
		//测试使用PropertyPathFactoryBean调用指定bean指定参数的get方法
//		System.out.println(ctx.getBean("getName"));
//		System.out.println(ctx.getBean("getAge"));
//		System.out.println(ctx.getBean("getCatName"));
//		System.out.println(ctx.getBean("propertyPathFactoryBeanSetName",TestPropertyPathFactoryBean.class).getName());
//		System.out.println(ctx.getBean("propertyPathFactoryBean1",TestPropertyPathFactoryBean.class).getName());
		
//		测试使用FieldRetrievingFactoryBean获取类属性或实例属性的值
//		System.out.println(ctx.getBean("getFiledName"));
//		System.out.println(ctx.getBean("getFiledAge"));
//		System.out.println(ctx.getBean("getEasyName"));
		//测试bean后处理器
//		System.out.println(ctx.getBean("beanPostCat"));
		
		//测试aop零配置
//		ln.bookSystem.action.Person readerA=ctx.getBean("readerAction",ln.bookSystem.action.Person.class);
//		readerA.add();
		
		//测试cache
		
		CacheTest ct=ctx.getBean("cacheTest",CacheTest.class);
		System.out.println(ct.getCache(2,"zhangsan")==ct.getCache(2,"zhangsan"));
	}
}
