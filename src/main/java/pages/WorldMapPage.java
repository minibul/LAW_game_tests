package pages;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;
import com.alttester.Commands.InputActions.AltScrollParams;

public class WorldMapPage extends BasePage {
	private AltObject worldMapButton;
	private final AltDriver driver;
	private AltObject campFire;
	private AltObject startCampaignButton;
	private AltObject selectArmyInCampaignPopUpPositionZero;
	private AltObject startCampaignButtonInCampaignPopUp;
	private AltObject inspectButton;
	private AltObject searchCampfire;
	private AltObject explorerButton;

	public WorldMapPage(AltDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void scrollToElement(AltObject element, AltScrollParams scrollParams) {
		getDriver().scroll(scrollParams);
	}


	public void setWorldMapButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Button - World").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(60).build();
		worldMapButton = getDriver().waitForObject(params);
	}
	public void setCampFire() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Campfire").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(60).build();
		campFire = getDriver().waitForObject(params);
	}
	public void setStartCampaignButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SelectionButton\\[CITY_SEND_CAMPAIGN\\]").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(60).build();
		startCampaignButton = getDriver().waitForObject(params);
	}
	public void setSelectArmyInCampaignPopUpPositionZero() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//WorldCanvas/Content/Popups/UI - Popup - Campaign(Clone)/Group/Content Container/Group/Left Panel/Armies Container/Viewport/List Container/GuiPanel0/Button").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(60).build();
		selectArmyInCampaignPopUpPositionZero = getDriver().waitForObject(params);
	}
	public void setStartCampaignButtonInCampaignPopUp() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//WorldCanvas/Content/Popups/UI - Popup - Campaign(Clone)/Group/Footer/Send Button/Group").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(60).build();
		startCampaignButtonInCampaignPopUp = getDriver().waitForObject(params);
	}
	public void setInspectButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Button Details").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(600).build();
		inspectButton = getDriver().waitForObject(params);
	}
	public void setSearchCampfire() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//CityView/CityGrid/Environment/Building - CAMPFIRE lvl 1").build(); ///Renderers/Dynamic/building_campfire_001(Clone)/Mangal
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(100).build();
		searchCampfire = getDriver().waitForObject(params);
	}
	public void setExplorerButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SelectionButton\\[EXPLORE\\]").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(100).build();
		explorerButton = getDriver().waitForObject(params);
	}

	public void tapWorldMapButton(){
		worldMapButton.tap();
	}
	public void tapCampFire() {
		AltScrollParams scrollParams = new AltScrollParams.Builder().withSpeed(-3).withDuration(1).build();
		scrollToElement(campFire, scrollParams);
		campFire.tap();
	}
	public void tapStartCampaignButton(){
		startCampaignButton.tap();
	}
	public void tapSelectArmyInCampaignPopUpPositionZero(){
		selectArmyInCampaignPopUpPositionZero.tap();
	}
	public void tapStartCampaignButtonInCampaignPopUp(){
		startCampaignButtonInCampaignPopUp.tap();
	}
	public void tapInspectButton(){
		inspectButton.tap();
	}
	public void tapSearchCampfire(){
		searchCampfire.tap();
	}
	public void tapExplorerButton() {
		AltScrollParams scrollParams = new AltScrollParams.Builder().withSpeed(-3).withDuration(1).build();
		scrollToElement(explorerButton, scrollParams);
		explorerButton.tap();
	}

}
