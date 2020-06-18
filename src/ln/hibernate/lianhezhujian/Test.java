package ln.hibernate.lianhezhujian;

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
		Person p=new Person();
		p.setAge(12);
		p.setName(new PName("zhnagsan","lisi"));
		p.setSex("nan");
		sess.save(p);
		tr.commit();
		sess.close();
		sf.close();
	}
}
