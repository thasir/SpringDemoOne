
public class BaseBallCoach implements Coach {
	@Override
	public String getdailyWorkout() {
		return "Spend 30 min in Batting Practice";
	}

	private FortuneService fortuneService;

	public BaseBallCoach(FortuneService theFortuneService) {

		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
