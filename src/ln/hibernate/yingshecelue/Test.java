package ln.hibernate.yingshecelue;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
//		Configuration cfg=new Configuration().configure();
//		SessionFactory sf=cfg.buildSessionFactory();
//		Session sess=sf.openSession();
//		Transaction tr=sess.beginTransaction();
//		Person p=new Person();
//		p.setAge(12);
//		p.setAddress(new Address("zhogguo"));
//		p.setSex("nan");
//		p.setName("zhangsan");
//		sess.save(p);
//		Employee em=new Employee();
//		em.setAddress(new Address("riben"));
//		em.setAge(12);
//		em.setName("lisi");
//		em.setSex("nu");
//		em.setTitle("项目组长");
//		Manager ma=new Manager();
//		ma.setAddress(new Address("hanguo"));
//		ma.setName("wangwu");
//		ma.setAge(13);
//		ma.setSex("nan");
//		ma.setTitle("项目经理");
//		Customer cu=new Customer();
//		cu.setAddress(new Address("hanguo"));
//		cu.setName("zhaoliu");
//		cu.setAge(15);
//		cu.setSex("nu");
//		cu.setCustomers("购物");
//		em.setManager(ma);
//		em.getCustomer().add(cu);
//		
//		sess.save(ma);
//		sess.save(cu);
//		sess.save(em);
//		sess.save(p);
//		tr.commit();
//		sess.close();
//		sf.close();
		createQ();
	}
	
	public static void createQ() {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		Customer i=(Customer) sess.createQuery("select p from Customer p where id=:id").setParameter("id", 3).getSingleResult();
		System.out.println(i.getCustomers());
		tr.commit();
		sess.close();
		sf.close();
	}
}
