
public class TrackCoach implements Coach {

	@Override
	public String getdailyWorkout() {

		return "Run a hard 5k";
	}

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		//super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It! " +fortuneService.getFortune();
	}
	//add an in it method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach:inside method doMyStartupStuff");
	}
	//add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach:inside method doMyCleanupStuff");
	}

}
