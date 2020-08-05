package ln.spring.start.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ln.spring.start.inter.Dog;
import ln.spring.start.inter.Person;



public class TestSpring {

	static int count=0;
	static String result="";
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
//		Chinese person=ctx.getBean("person",Chinese.class);
//		person.playDog();
//		YoungDog dog=ctx.getBean("dog",YoungDog.class);
//		dog.sayType();
//		System.out.println(dog.getAge()+dog.getName()+dog.getType());
		String str="aaabbtgfds";
		System.out.println(otherFun(str));
	}
	
	
	public static String getStr(String str) {
			
			if(str!=null&&str.length()>0) {
				return run(str);
			}else {
				return null;
			}
	}
	
	public static String run(String str) {
		
		if(str.length()>1&&str.substring(0,1).equals(str.substring(1,2))) {
			count++;
			str=str.substring(1);
			run(str);
		}else {
			if(count>1) {
				result=result+count+str.substring(0,1);
				str=str.substring(1);
				count=1;
			}else {
				result=result+str.substring(0,1);
				str=str.substring(1);
			}
			if(str.length()>1) {
				run(str);
			}else {
				result+=str;
			}
		}
		return result;
	}
	
	
	public static String otherFun(String str) {
		String c=str.substring(0,1);
		
		for(int i=0;c.equals(str.substring(i,i+1));i++) {
			count++;
		}
		if(count>1)
		result=result+count+c;
		else 
		result+=c;
		str=str.substring(count);
		count=0;
		if(str.length()>1) {
			otherFun(str);
		}else {
			result+=str;
		}
		return result;
	}
}
