package ln.spring.test;
/**
 * 
 * @author WQL
 *����spring�ľ�̬����
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
