package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MyApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		MyClass myClass = context.getBean(MyClass.class);
		myClass.doSomething();
		
		System.out.println(myClass.hashCode());
		System.out.println(myClass.myDependency.hashCode());
		
		MyDependency myDependency = context.getBean(MyDependency.class);
		System.out.println(myDependency.hashCode());
	}
}