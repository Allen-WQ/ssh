package ln.hibernate.test;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/*
 * ¿¡∫∫ ΩªÒ»°sessionFactory
 */
public class SessionUtil {

	private static SessionFactory sf=null;
	
	public static SessionFactory getSf() {
		if(sf==null) {
			synchronized (SessionUtil.class) {
				if(sf!=null) {
					return sf;
				}else {
					Configuration cfg=new Configuration().configure();
					SessionFactory sessF=cfg.buildSessionFactory();
					return sessF;
				}
			}
		}else {
			return sf;
		}
	}
}
