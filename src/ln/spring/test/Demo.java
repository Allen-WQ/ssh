package ln.spring.test;

public class Demo {
    
public boolean equals( Demo other) {
        System.out.println("use Demo equals." );
        return true;    
}
    //子类不能有和父类方法名相同方法参数相同但是返回值不同的方法
public boolean equals(Object other) {
	return true;
}
public static void main(String[] args) {    
    Object o1 =new Demo ();
    Object o2 =new Demo ();        
    Demo o3 =new Demo ();
    Demo o4 =new Demo ();

   if (o1.equals(o2)) {
            System.out.println("o1 is equal with o2.");
        }

   if(o3.equals(o4)) {             
            System.out.println("o3 is equal with o4.");
        }
    }
}
