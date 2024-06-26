package net.developia.spring01.di302;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TVTest {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(BeanInit.class);
		
		System.out.println("-----------------------");
		TV tv = (TV) context.getBean("tv");
		
		tv.powerOn(); 
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
	}
}
