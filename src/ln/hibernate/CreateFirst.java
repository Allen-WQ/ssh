package ln.hibernate;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ln.enumPack.DogClassifl;

public class CreateFirst {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		
		Dog dog=new Dog();
		dog.setAge(12);
		dog.setName("wangcai");
		dog.setSex("nan");
		dog.setState(DogClassifl.YOUNG);
		dog.setBirth(new Date());
		
		dog.getChilds().add("小菜");
		dog.getChilds().add("小王");
		
		String[] strs=new String[2];
		strs[0]="大王";
		strs[1]="大财";
		dog.setParent(strs);
		
		dog.getLocals().add("aaa");
		dog.getLocals().add("bbb");
		
		dog.getBody().put("身高", 82.2F);
		dog.getBody().put("身长", 100.2F);
		dog.getBody().put("体重", 60.3F);
		sess.save(dog);
//		Dog d=sess.load(Dog.class, 1); 
//		System.out.println(d.getState().getMessage());
		System.out.println("=====");
		
		tr.commit();
		sess.close();
		sf.close();
	}
}
