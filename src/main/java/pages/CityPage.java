package pages;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;

public class CityPage extends BasePage {

	private AltDriver driver;
	private AltObject settingsButton;
	private AltObject logOutButton;

	public CityPage(AltDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public boolean isMailboxDisplayed() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Elements By Attitude/UI City (Owner)/Player/Button - Mailbox").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		AltObject mailboxButton = driver.waitForObject(params);

		return mailboxButton != null;
	}

	public void setSettingsButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Elements By Attitude/UI City (Owner)/BotomRight-Buttons/Button - Settings").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.settingsButton = getDriver().waitForObject(params);
	}
	public void tapSettingsButton(){
		settingsButton.tap();
	}

	public void setLogOutButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Popups/UI - Panel - Settings/Group/Content/Buttons/Logout Button/Group").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.logOutButton = getDriver().waitForObject(params);
	}
	public void tapLogOutButton() throws InterruptedException {
		Thread.sleep(2000);
		logOutButton.tap();
	}

}

