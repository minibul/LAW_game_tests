//import com.alttester.AltDriver;
//import org.junit.*;
//import org.junit.runners.MethodSorters;
//import pages.CityPage;
//import pages.LoginPage;
//
//import java.io.IOException;
//
//import static org.junit.Assert.assertTrue;
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class LoginInTest {
//
//	private static AltDriver driver;
//	private static LoginPage loginPage;
//	private static CityPage cityPage;
//
//	@BeforeClass
//	public static void setUp() throws IOException {
//		driver = new AltDriver();
//		cityPage = new CityPage(driver);
//		loginPage = new LoginPage(driver);
//
//	}
//
//	@AfterClass
//	public static void tearDown() throws Exception {
//		driver.stop();
//		Thread.sleep(3000);
//	}
//
//
//	@Test
//	public void test_1_SuccessfulLoggedInTest() throws InterruptedException {
//		loginPage.pressLoginWithEmailButton();
//		loginPage.enterEmail();
//		loginPage.enterPassword();
//		loginPage.setLoginButton();
//		loginPage.pressLoginButton();
//		loginPage.setPlayButton();
//
//		Thread.sleep(1000);
//
//		loginPage.tapPlayButton();
//
//		cityPage = new CityPage(driver);
//		assertTrue(cityPage.isMailboxDisplayed());
//	}
//
//
//	@Test
//	public void test_2_SuccessfulLoggedOutTest() throws InterruptedException {
//		cityPage.setSettingsButton();
//		cityPage.tapSettingsButton();
//		cityPage.setLogOutButton();
//		cityPage.tapLogOutButton();
//
//		assertTrue(loginPage.isEmailDisplayed());
//	}
//
//}

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.CityPage;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginInTest extends BaseTest {

	@Test
	public void test_1_SuccessfulLoggedInTest() throws InterruptedException {
		loginPage.pressLoginWithEmailButton();
		loginPage.enterEmail();
		loginPage.enterPassword();
		loginPage.setLoginButton();
		loginPage.pressLoginButton();
		loginPage.setPlayButton();

		Thread.sleep(1000);

		loginPage.tapPlayButton();

		cityPage = new CityPage(driver);
		assertTrue(cityPage.isMailboxDisplayed());
	}

	@Test
	public void test_2_SuccessfulLoggedOutTest() throws InterruptedException {
		cityPage.setSettingsButton();
		cityPage.tapSettingsButton();
		cityPage.setLogOutButton();
		cityPage.tapLogOutButton();

		assertTrue(loginPage.isEmailDisplayed());
	}
}
