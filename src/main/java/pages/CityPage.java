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
	private AltObject captureCastleButton;
	private AltObject actionBar;
	private AltObject tutorialBuilding;
	private AltObject constructBuildingButton;
	private AltObject constructUpgradeButtonInPopUp;
	private AltObject buildingUpgradeFinishButton;
	private AltObject buildButton;
	private AltObject buildBuildingButtonFromTutorialPositionTwo;
	private AltObject selectionButtonYes;
	private AltObject finishBuildingIronMineInTutorial;
	private AltObject finishBuildingStoreHouseInTutorial;
	private AltObject finishBuildingFoodFarmInTutorial;
	private AltObject buildingUpgradeButton;
	private AltObject finishUpdateCastleLvl1InTutorial;
	private AltObject finishBuildingLivingHouseInTutorial;
	private AltObject finishBuildingStablesInTutorial;
	private AltObject trainButton;
	private AltObject trainUnitButtonPositionZero;
	private AltObject confirmTrainUnitButton;
	private AltObject buildBuildingButtonFromTutorialPositionZero;
	private AltObject buildBuildingButtonFromTutorialPositionThree;
	private AltObject questButton;
	private AltObject avatarButton;
	private AltObject closeQuestButton;
	private AltObject hireHeroButtonPositionZero;
	private AltObject formArmyButton;
	private AltObject createArmyButton;
	private AltObject nextButtonEditArmyPopUp;
	private AltObject confirmButtonEditArmyPopUp;

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
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//CityView/CityGrid/Units/CityArmy(Clone)/ArmyRenderer").build(); ///knight(Clone)/Knight1/Knight
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
	public void setCaptureCastleButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Selection Buttons/Target/Upper/SelectionButton\\[CAPTURE_CASTLE\\]").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.captureCastleButton = getDriver().waitForObject(params);
	}
	public void setActionBar() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Activity Log/Group/Button - Resize").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.actionBar = getDriver().waitForObject(params);
	}
	public void setTutorialBuilding() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//TutorialCircle(Clone)/../Renderers").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.tutorialBuilding = getDriver().waitForObject(params);
	}
	public void setConstructBuildingButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Selection Buttons/Target/Lower/SelectionButton\\[BUILDING_RECONSTRUCT\\]").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.constructBuildingButton = getDriver().waitForObject(params);
	}
	public void setConstructUpgradeButtonInPopUp() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Popups/UI - Popup - Building - Upgrade(Clone)/Group/Footer/Upgrade Button/Group").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.constructUpgradeButtonInPopUp = getDriver().waitForObject(params);
	}
	public void setBuildingUpgradeFinishButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Selection Buttons/Target/Lower/SelectionButton\\[BUILDING_UPGRADE_FINISH\\]").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.buildingUpgradeFinishButton = getDriver().waitForObject(params);
	}
	public void setBuildButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Button - Build").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.buildButton = getDriver().waitForObject(params);
	}
	public void setBuildBuildingButtonFromTutorialPositionZero() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Popups/UI - Popup - Building - Construct(Clone)/Group/Content/Scroll View/Viewport/Content/UI_Prefab_BuildingConstruction0/Group/Bottom Container/UI Button -Build").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.buildBuildingButtonFromTutorialPositionZero = getDriver().waitForObject(params);
	}
	public void setBuildBuildingButtonFromTutorialPositionTwo() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Popups/UI - Popup - Building - Construct(Clone)/Group/Content/Scroll View/Viewport/Content/UI_Prefab_BuildingConstruction2/Group/Bottom Container/UI Button -Build").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.buildBuildingButtonFromTutorialPositionTwo = getDriver().waitForObject(params);
	}
	public void setBuildBuildingButtonFromTutorialPositionThree() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Popups/UI - Popup - Building - Construct(Clone)/Group/Content/Scroll View/Viewport/Content/UI_Prefab_BuildingConstruction3/Group/Bottom Container/UI Button -Build").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.buildBuildingButtonFromTutorialPositionThree = getDriver().waitForObject(params);
	}

	public void setSelectionButtonYes() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SelectionButton\\[BUILDING_BUILD_YES\\]").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.selectionButtonYes = getDriver().waitForObject(params);
	}
	public void setFinishBuildingIronMineInTutorial() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "building_ironmine_000(Clone)").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.finishBuildingIronMineInTutorial = getDriver().waitForObject(params);
	}
	public void setFinishBuildingStoreHouseInTutorial() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "building_storehouse_001(Clone)").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.finishBuildingStoreHouseInTutorial = getDriver().waitForObject(params);
	}
	public void setFinishBuildingFoodFarmInTutorial() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "building_foodfarm_001_0(Clone)").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.finishBuildingFoodFarmInTutorial = getDriver().waitForObject(params);
	}
	public void setBuildingUpgradeButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Selection Buttons/Target/Lower/SelectionButton\\[BUILDING_UPGRADE\\]").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.buildingUpgradeButton = getDriver().waitForObject(params);
	}
	public void setFinishUpdateCastleLvl1InTutorial() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Building - CASTLE lvl 1").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.finishUpdateCastleLvl1InTutorial = getDriver().waitForObject(params);
	}
	public void setFinishBuildingLivingHouseInTutorial() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Building - LIVINGHOUSE lvl 0").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.finishBuildingLivingHouseInTutorial = getDriver().waitForObject(params);
	}
	public void setFinishBuildingStablesInTutorial() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Building - STABLES lvl 0").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.finishBuildingStablesInTutorial = getDriver().waitForObject(params);
	}
	public void setTrainButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SelectionButton\\[TRAINING\\]").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.trainButton = getDriver().waitForObject(params);
	}
	public void setTrainUnitButtonPositionZero() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Popups/UI - Popup - Building - Hire Units(Clone)/Group/Content/Scroll View/Viewport/Content/UI_Prefab_HireTroop0/Group/Section - Main/Bottom Container/Holder/UI Button - Train (Prepare)").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.trainUnitButtonPositionZero = getDriver().waitForObject(params);
	}
	public void setConfirmTrainUnitButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Popups/UI - Popup - Building - Hire Units(Clone)/Group/Content/Scroll View/Viewport/Content/UI_Prefab_HireTroop0/Group/Section - Hire/Section - Bottom/Hire Container/UI Button - Train").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.confirmTrainUnitButton = getDriver().waitForObject(params);
	}
	public void setQuestButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Button - Quest").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.questButton = getDriver().waitForObject(params);
	}
	public void setCloseQuestButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "UI Button - Close").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.closeQuestButton = getDriver().waitForObject(params);
	}
	public void setAvatarButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Avatar Container").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(60).build();
		this.avatarButton = getDriver().waitForObject(params);
	}
	public void setHireHeroButtonPositionZero() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Popups/UI - Popup - Hire Heroes(Clone)/Group/Content/Scroll View/Viewport/Content/GuiPanel0/Group/Section - Main/Bottom Container/UI Button - Recruit").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.hireHeroButtonPositionZero = getDriver().waitForObject(params);
	}
	public void setFormArmyButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SelectionButton\\[FORM_ARMY\\]").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.formArmyButton = getDriver().waitForObject(params);
	}
	public void setCreateArmyButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "UI Button -  Edit Army").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.createArmyButton = getDriver().waitForObject(params);
	}
	public void setNextButtonEditArmyPopUp() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Popups/UI - Popup - Army - Modification(Clone)/Group/Footer/Next Button/Group").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.nextButtonEditArmyPopUp = getDriver().waitForObject(params);
	}
	public void setConfirmButtonEditArmyPopUp() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Content/Popups/UI - Popup - Army - Modification(Clone)/Group/Footer/Confirm Button/Group").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.confirmButtonEditArmyPopUp = getDriver().waitForObject(params);
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
		captureCastleButton.tap();
	}
	public void tapActionBar(){
		actionBar.tap();
	}
	public void tapTutorialBuilding(){
		tutorialBuilding.tap();
	}
	public void tapConstructBuildingButton(){
		constructBuildingButton.tap();
	}
	public void tapConstructUpgradeButtonInPopUp(){
		constructUpgradeButtonInPopUp.tap();
	}
	public void tapBuildingUpgradeFinishButton(){
		buildingUpgradeFinishButton.tap();
	}
	public void tapBuildButton(){
		buildButton.tap();
	}
	public void tapBuildBuildingButtonFromTutorialPositionTwo(){
		buildBuildingButtonFromTutorialPositionTwo.tap();
	}
	public void tapBuildBuildingButtonFromTutorialPositionZero(){
		buildBuildingButtonFromTutorialPositionZero.tap();
	}
	public void tapSelectionButtonYes(){
		selectionButtonYes.tap();
	}
	public void tapFinishBuildingIronMineInTutorial(){
		finishBuildingIronMineInTutorial.tap();
	}
	public void tapFinishBuildingStoreHouseInTutorial(){
		finishBuildingStoreHouseInTutorial.tap();
	}
	public void tapFinishBuildingFoodFarmInTutorial(){
		finishBuildingFoodFarmInTutorial.tap();
	}
	public void tapBuildingUpgradeButton(){
		buildingUpgradeButton.tap();
	}
	public void tapFinishUpdateCastleLvl1InTutorial(){
		finishUpdateCastleLvl1InTutorial.tap();
	}
	public void tapFinishBuildingLivingHouseInTutorial(){
		finishBuildingLivingHouseInTutorial.tap();
	}
	public void tapFinishBuildingStablesInTutorial(){
		finishBuildingStablesInTutorial.tap();
	}
	public void tapTrainButton(){
		trainButton.tap();
	}
	public void tapTrainUnitButtonPositionZero(){
		trainUnitButtonPositionZero.tap();
	}
	public void tapConfirmTrainUnitButton(){
		confirmTrainUnitButton.tap();
	}
	public void tapBuildBuildingButtonFromTutorialPositionThree(){
		buildBuildingButtonFromTutorialPositionThree.tap();
	}
	public void tapQuestButton(){
		questButton.tap();
	}
	public void tapAvatarButton(){
		avatarButton.tap();
	}
	public void tapCloseQuestButton(){
		closeQuestButton.tap();
	}
	public void tapHireHeroButtonPositionZero(){
		hireHeroButtonPositionZero.tap();
	}
	public void tapFormArmyButton(){
		formArmyButton.tap();
	}
	public void tapCreateArmyButton(){
		createArmyButton.tap();
	}
	public void tapNextButtonEditArmyPopUp(){
		nextButtonEditArmyPopUp.tap();
	}
	public void tapConfirmButtonEditArmyPopUp(){
		confirmButtonEditArmyPopUp.tap();
	}

}

