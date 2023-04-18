package pages;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;

public class CityPage extends BasePage {

	private final AltDriver driver;
	private AltObject settingsButton;
	private AltObject logOutButton;
	private AltObject chooseArmy;
	private AltObject goToCastleLevel1;
	private AltObject changeArmyRangeButton;
	private AltObject changeArmyAggressionButton;
	private AltObject castleLevel1;
	private AltObject captureCastle;
	private AltObject actionBar;

	public CityPage(AltDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public boolean isMailboxDisplayed() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Elements By Attitude/UI City (Owner)/Player/Button - Mailbox").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		AltObject mailboxButton = driver.waitForObject(params);

		return mailboxButton != null;
	}

	public void setSettingsButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Elements By Attitude/UI City (Owner)/BotomRight-Buttons/Button - Settings").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.settingsButton = getDriver().waitForObject(params);
	}

	public void setLogOutButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Popups/UI - Panel - Settings/Group/Content/Buttons/Logout Button/Group").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.logOutButton = getDriver().waitForObject(params);
	}

	public void setChooseArmy() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//CityView/CityGrid/Units/CityArmy(Clone)/ArmyRenderer/knight(Clone)/Knight1/Knight").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.chooseArmy = getDriver().waitForObject(params);
	}

	public void setGoToCastleLevel1() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//TutorialCircle(Clone)/../renderer").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.goToCastleLevel1 = getDriver().waitForObject(params);
	}

	public void setChangeArmyRangeButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Army Formation/Button - Change Army Range").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.changeArmyRangeButton = getDriver().waitForObject(params);
	}

	public void setChangeArmyAggressionButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Army Formation/Button - Change Army Aggression").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.changeArmyAggressionButton = getDriver().waitForObject(params);
	}

	public void setCastleLevel1() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//CityView/CityGrid/Environment/Building - CASTLE lvl 1").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.castleLevel1 = getDriver().waitForObject(params);
	}

	public void setCaptureCastle() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Selection Buttons/Target/Upper/SelectionButton\\[CAPTURE_CASTLE\\]").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.captureCastle = getDriver().waitForObject(params);
	}

	public void setActionBar() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Activity Log/Group/Button - Resize").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.actionBar = getDriver().waitForObject(params);
	}

	public void tapSettingsButton(){
		settingsButton.tap();
	}
	public void tapChooseArmy(){
		chooseArmy.tap();
	}
	public void tapLogOutButton() throws InterruptedException {
		Thread.sleep(1000);
		logOutButton.tap();
	}
	public void tapGoToCastleLevel1(){
		goToCastleLevel1.tap();
	}
	public void tapChangeArmyRangeButton(){
		changeArmyRangeButton.tap();
	}
	public void tapChangeArmyAggressionButton(){
		changeArmyAggressionButton.tap();
	}
	public void tapCastleLevel1(){
		castleLevel1.tap();
	}
	public void tapCaptureCastle(){
		captureCastle.tap();
	}
	public void tapActionBar(){
		actionBar.tap();
	}

}

