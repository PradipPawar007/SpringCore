package dxc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext cntxt= new ClassPathXmlApplicationContext("Beans.xml");
		Car c= cntxt.getBean(Car.class);
		c.drive();
		
	}

}
