import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// Retrieve beans from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		// check to see if they both are same
		boolean result = (theCoach==alphaCoach);
		System.out.println("pointing to same location: "+result);
		System.out.println("memory location for theCoach: "+theCoach);
		System.out.println("memory location for alphaCoach: "+alphaCoach);
		context.close();
	}

}
