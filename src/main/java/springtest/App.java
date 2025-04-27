package springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		/*
		 * Vehicle vehicle=(Vehicle) context.getBean("bike"); vehicle.drive();
		 */
		
		/*
		 * Tyre tyre=(Tyre)context.getBean("tyre"); System.out.println(tyre);
		 * 
		 * Oil oil=(Oil) context.getBean("oil"); System.out.println(oil);
		 */
		
		Car obj=(Car) context.getBean("car");
		obj.drive();
	}
}
