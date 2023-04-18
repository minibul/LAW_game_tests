import configReader.RandomDataGenerator;
import org.junit.Test;
import pages.CityPage;
import pages.TutorialPage;

public class TutorialTest extends BaseTest {


	@Test
	public void test_1_successfulCompletionOfTutorial()throws InterruptedException {
		String randomLogin = RandomDataGenerator.generateRandomLogin(3,16);
		String randomEmail = RandomDataGenerator.generateRandomEmail("example.com", 10);
		String randomPassword = RandomDataGenerator.generateRandomPassword(8);

		loginPage.setLoginWithEmailButton();
		loginPage.tapLoginWithEmailButton();
		loginPage.setRegistrationButton();

		Thread.sleep(1000);

		loginPage.tapRegistrationButton();
		loginPage.enterNicknameRegistrationTab(randomLogin);
		loginPage.enterEmailRegistrationTab(randomEmail);
		loginPage.enterPasswordRegistrationTab(randomPassword);
		loginPage.enterRepeatPasswordRegistrationTab(randomPassword);
		loginPage.setRegisterButton();
		loginPage.tapRegisterButton();
		loginPage.setPlayButton();

		Thread.sleep(1000);

		loginPage.tapPlayButton();
		loginPage.setConfirmButton();
		loginPage.tapConfirmButton();

		tutorialPage = new TutorialPage(driver);

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage = new CityPage(driver);
		cityPage.setChooseArmy();

		Thread.sleep(10000);

		cityPage.tapChooseArmy();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage.setGoToCastleLevel1();

		Thread.sleep(1000);

		cityPage.tapGoToCastleLevel1();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage.setChangeArmyRangeButton();

		Thread.sleep(1000);

		cityPage.tapChangeArmyRangeButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage.setChangeArmyAggressionButton();

		Thread.sleep(1000);

		cityPage.tapChangeArmyAggressionButton();
		cityPage.tapChangeArmyRangeButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage.setCastleLevel1();

		Thread.sleep(1000);

		cityPage.tapCastleLevel1();
		cityPage.setCaptureCastle();

		Thread.sleep(1000);

		cityPage.tapCaptureCastle();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage.setActionBar();
		cityPage.tapActionBar();

		Thread.sleep(2000);

		cityPage.setActionBar();
		cityPage.tapActionBar();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
	}
}
