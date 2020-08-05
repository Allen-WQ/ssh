package ln.hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ln.hibernate.yingshecelue.Person;

/*
 * 测试两个线程同时操作一组数据，对结果的影响 ，观察数据库的隔离级别
 */
public class MysqlGelijibie {

	public static void main(String[] args) {
		Session sess=SessionUtil.getSf().getCurrentSession();
		Transaction tr=sess.beginTransaction();
		Long i=sess.createQuery("select count(*) from TestClass",Long.class).getSingleResult();
		System.out.println(i);
		new Thread(new Runnable() {
			@Override
			public void run() {
				Session sess=SessionUtil.getSf().getCurrentSession();
				Transaction tr=sess.beginTransaction();
				TestClass tc=new TestClass();
				tc.setAge(16);
				tc.setName("zhandan");
				sess.save(tc);
				sess.flush();
				tr.commit();
				sess.close();
			}
		}).start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Long i1=sess.createQuery("select count(*) from TestClass",Long.class).getSingleResult();
		System.out.println(i1);
		tr.commit();
		sess.close();
	}
}
