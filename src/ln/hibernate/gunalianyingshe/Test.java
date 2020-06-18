package ln.hibernate.gunalianyingshe;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		LocalInf loc=new LocalInf();
		loc.setMark("邯郸");
		sess.save(loc);
		
		Address ad=new Address();
		ad.setMark("北京");
		Address ad1=new Address();
		ad1.setMark("南京");
		
		Person p=new Person();
		p.setAge(12);
		p.setName("zhongsan");
		p.setSex("nan");
		p.setLocals(loc);
//		p.getAddress().add(ad);
//		p.getAddress().add(ad1);
//		ad1.setPerson(p);
//		ad.setPerson(p);
		p.setAddress(new HashSet());
		p.setId(2);
		sess.update(p);
//		sess.save(ad);
//		sess.save(ad1);
		tr.commit();
		sess.close();
		sf.close();
//		manyToMany();
	}
	
//	public static void manyToMany() {
//		Configuration cfg=new Configuration().configure();
//		SessionFactory sf=cfg.buildSessionFactory();
//		Session sess=sf.openSession();
//		Transaction tr=sess.beginTransaction();
//		Address s=new Address();
//		s.setMark("南京");
//		Address a=new Address();
//		a.setMark("北京");
//		Person p=new Person();
//		p.setAge(12);
//		p.setName("zhongsan");
//		p.setSex("nan");
//		Person p1=new Person();
//		p1.setAge(13);
//		p1.setName("lisi");
//		p1.setSex("nan");
//		sess.save(p);
//		sess.save(p1);
//		s.getPersons().add(p);
//		s.getPersons().add(p1);
//		a.getPersons().add(p);
//		a.getPersons().add(p1);
//		sess.save(s);
//		sess.save(a);
//		tr.commit();
//		sess.close();
//		sf.close();
//	}
}
