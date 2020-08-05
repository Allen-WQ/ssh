package ln.spring.test;
/**
 * 
 * @author WQL
 *创建spring的静态工厂
 */
public class SFactory {

	public static Person getPerson(String flag) {
		if(flag.equalsIgnoreCase("teacher")) {
			return new Teacher();
		}else {
			return new Student();
		}
		
	}
}
