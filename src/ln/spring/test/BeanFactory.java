package ln.spring.test;
/**
 * @author WQL
 *创建bean的实例工厂
 */
public class BeanFactory {

	public Person getPerson(String message) {
		if("teacher".equalsIgnoreCase(message)) {
			return new Teacher();
		}else {
			return new Student();
		}
	}
}
