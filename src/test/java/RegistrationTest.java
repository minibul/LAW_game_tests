import configReader.RandomDataGenerator;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegistrationTest extends BaseTest {

	@Test
	public void test_1_successfulRegistrationTest() throws InterruptedException {
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
		loginPage.setLogoutButton();

		Thread.sleep(1000);

		loginPage.tapLogoutButton();

	}

}
