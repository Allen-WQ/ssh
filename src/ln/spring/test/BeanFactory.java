package ln.spring.test;
/**
 * @author WQL
 *����bean��ʵ������
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
