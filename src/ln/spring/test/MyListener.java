package ln.spring.test;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyListener implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		if(arg0 instanceof MyEvent) {
			MyEvent me=(MyEvent)arg0;
			System.out.println(me.getId());
			System.out.println(me.getName());
		}
	}

}
