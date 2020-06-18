package ln.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainFun {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		Student stu=new Student();
		stu.getName().setLastName("zhangsan");;
		stu.getName().setNowName("lisi");
		stu.getTeacher().add(new Teacher("ll","สýัง"));
		stu.getTeacher().add(new Teacher("ww","ำ๏ฮฤ"));
		sess.save(stu);
		tr.commit();
		sess.close();
		sf.close();
	}
}
