import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring file configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		// call methods from the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getdailyWorkout());
        System.out.println(theCoach.getTeam());
        System.out.println(theCoach.getEmail());
		// close the context
		context.close();
	}

}
