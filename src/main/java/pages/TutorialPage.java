package pages;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;

public class TutorialPage extends BasePage {
	private AltObject firstTutorialBanner;

	public TutorialPage(AltDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public void setTutorialBanner() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Tutorial/HintManager/Hint(Clone)").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(60).build();
		firstTutorialBanner = getDriver().waitForObject(params);
	}

	public void tapTutorialBanner(){
		firstTutorialBanner.tap();
	}

}
