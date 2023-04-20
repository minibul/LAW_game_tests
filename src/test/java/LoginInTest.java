import configReader.RandomDataGenerator;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.CityPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static pages.LoginPage.getProperty;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginInTest extends BaseTest {

	@Test
	public void test_01_SuccessfulLogInTest() throws InterruptedException {
		String email = getProperty("email");
		String password = getProperty("password");

		loginPage.tapLoginWithEmailButton();
		loginPage.enterEmailLoginTab(email);
		loginPage.enterPasswordLoginTab(password);
		loginPage.setLoginButton();
		loginPage.tapLoginButton();
		loginPage.setPlayButton();

		Thread.sleep(1000);

		loginPage.tapPlayButton();

		cityPage = new CityPage(driver);
		assertTrue(cityPage.isMailboxDisplayed());
	}
	@Test
	public void test_02_SuccessfulLogOutTest() throws InterruptedException {
		cityPage.setSettingsButton();
		cityPage.tapSettingsButton();
		cityPage.setLogOutButton();
		cityPage.tapLogOutButton();

		assertTrue(loginPage.isEmailDisplayed());
	}
	@Test
	public void test_03_unsuccessfulLogInNotRegisteredUserTest() {
		String randomEmail = RandomDataGenerator.generateRandomEmail("example.com", 10);
		String randomPassword = RandomDataGenerator.generateRandomPassword(8);

		loginPage.setLoginWithEmailButton();
		loginPage.tapLoginWithEmailButton();
		loginPage.enterEmailLoginTab(randomEmail);
		loginPage.enterPasswordLoginTab(randomPassword);
		loginPage.setLoginButton();
		loginPage.tapLoginButton();

		assertFalse(loginPage.isEmailDisplayed());

	}
	@Test
	public void test_04_cleanEmailPasswordInput() {

		loginPage.tapLoginWithEmailButton();
		loginPage.enterEmailLoginTab("");
		loginPage.enterPasswordLoginTab("");
		loginPage.setBackButton();
		loginPage.tapBackButton();

	}
}
