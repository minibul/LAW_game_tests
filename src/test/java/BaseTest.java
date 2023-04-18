import com.alttester.AltDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import pages.CityPage;
import pages.LoginPage;
import pages.TutorialPage;

import java.io.IOException;

public class BaseTest {

	protected static AltDriver driver;
	protected static LoginPage loginPage;
	protected static CityPage cityPage;
	protected static TutorialPage tutorialPage;

	@BeforeClass
	public static void setUp() throws IOException {
		driver = new AltDriver();
		cityPage = new CityPage(driver);
		loginPage = new LoginPage(driver);
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.stop();
		Thread.sleep(1000);
	}
}