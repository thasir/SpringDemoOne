
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String team;
	private String email;

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside of the setter method - setTeam");
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("inside of the setter method - setEmail");
		this.email = email;
	}

	public CricketCoach() {
		System.out.println("inside the no arg constructor ");
	}

	@Override
	public String getdailyWorkout() {

		return "Practice Fast Bowling for 30 min a Day";
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside of the setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
