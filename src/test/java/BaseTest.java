import com.alttester.AltDriver;
import org.junit.After;
import org.junit.Before;
import pages.CityPage;
import pages.LoginPage;
import pages.TutorialPage;
import pages.WorldMapPage;

import java.io.IOException;

public class BaseTest {

	protected AltDriver driver;
	protected LoginPage loginPage;
	protected CityPage cityPage;
	protected TutorialPage tutorialPage;
	protected WorldMapPage worldMapPage;

	@Before
	public void setUp() throws IOException {
		driver = new AltDriver();

	}

	@After
	public void tearDown() throws Exception {
		driver.stop();
		Thread.sleep(1000);
	}
}
