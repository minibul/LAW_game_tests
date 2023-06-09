import configReader.RandomDataGenerator;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.CityPage;
import pages.LoginPage;
import pages.TutorialPage;
import pages.WorldMapPage;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TutorialTest extends BaseTest {

	@Test
	public void test_01_registrationNewUser() throws InterruptedException {

		loginPage = new LoginPage(driver);
		String randomLogin = RandomDataGenerator.generateRandomLogin(3, 16);
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
		loginPage.setPlayButton();

		Thread.sleep(1000);

		loginPage.tapPlayButton();
		loginPage.setConfirmButton();
		loginPage.tapConfirmButton();
	}

	@Test
	public void test_02_startTutorial() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		tutorialPage = new TutorialPage(driver);

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage = new CityPage(driver);
		cityPage.setChooseArmy();

		Thread.sleep(5000);

		cityPage.tapChooseArmy();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
	}

	@Test
	public void test_03_goToCastle() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		tutorialPage.setGoToCastleLevel1();

		Thread.sleep(1000);

		tutorialPage.tapGoToCastleLevel1();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

	}

	@Test
	public void test_04_castleDefense() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		cityPage.setChangeArmyRangeButton();

		Thread.sleep(1000);

		cityPage.tapChangeArmyRangeButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage.setChangeArmyAggressionButton();

		Thread.sleep(1000);

		cityPage.tapChangeArmyAggressionButton();
		cityPage.setChangeArmyRangeButton();

		Thread.sleep(1000);

		cityPage.tapChangeArmyRangeButton();

	}

	@Test
	public void test_05_castleCapture() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);


		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		Thread.sleep(3000);

		tutorialPage.setCastleLevel1();

		Thread.sleep(3000);

		tutorialPage.tapCastleLevel1();
		cityPage.setCaptureCastleButton();

		Thread.sleep(1000);

		cityPage.tapCaptureCastle();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage.setActionBar();
		cityPage.tapActionBar();

		Thread.sleep(2000);

		cityPage.setActionBar();
		cityPage.tapActionBar();

	}

	@Test
	public void test_06_secondPartOfTutorial() {
		tutorialPage = new TutorialPage(driver);

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

	}

	@Test
	public void test_07_buildStoneQuarry() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		tutorialPage.setTutorialBuilding();

		Thread.sleep(5000);

		tutorialPage.tapTutorialBuilding();

		cityPage.setConstructBuildingButton();

		Thread.sleep(1000);

		cityPage.tapConstructBuildingButton();
		cityPage.setConstructUpgradeButtonInPopUp();

		Thread.sleep(1000);

		cityPage.tapConstructUpgradeButtonInPopUp();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		tutorialPage.setTutorialBuilding();

		Thread.sleep(1000);

		tutorialPage.tapTutorialBuilding();
		cityPage.setBuildingUpgradeFinishButton();

		Thread.sleep(1000);

		cityPage.tapBuildingUpgradeFinishButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

	}

	@Test
	public void test_08_constructIronMine() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		tutorialPage.setTutorialBuilding();

		Thread.sleep(5000);

		tutorialPage.tapTutorialBuilding();
		cityPage.setConstructBuildingButton();

		Thread.sleep(1000);

		cityPage.tapConstructBuildingButton();
		cityPage.setConstructUpgradeButtonInPopUp();

		Thread.sleep(1000);

		cityPage.tapConstructUpgradeButtonInPopUp();
		cityPage.setFinishBuildingIronMine();

		Thread.sleep(1000);

		cityPage.tapFinishBuildingIronMine();
		cityPage.setBuildingUpgradeFinishButton();

		Thread.sleep(1000);

		cityPage.tapBuildingUpgradeFinishButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

	}

	@Test
	public void test_09_buildLumberMill() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		cityPage.setBuildButton();

		Thread.sleep(1000);

		cityPage.tapBuildButton();

		tutorialPage.setBuildBuildingButtonFromTutorialPositionTwo();

		Thread.sleep(2000);

		tutorialPage.tapBuildBuildingButtonFromTutorialPositionTwo();
		cityPage.setSelectionButtonYes();

		Thread.sleep(1000);

		cityPage.tapSelectionButtonYes();
		tutorialPage.setTutorialBuilding();

		Thread.sleep(1000);

		tutorialPage.tapTutorialBuilding();
		cityPage.setBuildingUpgradeFinishButton();

		Thread.sleep(1000);

		cityPage.tapBuildingUpgradeFinishButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
	}

	@Test
	public void test_10_buildStoreHouse() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		cityPage.setBuildButton();

		Thread.sleep(1000);

		cityPage.tapBuildButton();

		tutorialPage.setBuildBuildingButtonFromTutorialPositionZero();

		Thread.sleep(2000);

		tutorialPage.tapBuildBuildingButtonFromTutorialPositionZero();
		cityPage.setSelectionButtonYes();

		Thread.sleep(1000);

		cityPage.tapSelectionButtonYes();

		cityPage.setFinishBuildingStoreHouse();

		Thread.sleep(1000);

		cityPage.tapFinishBuildingStoreHouse();
		cityPage.setBuildingUpgradeFinishButton();

		Thread.sleep(1000);

		cityPage.tapBuildingUpgradeFinishButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

	}

	@Test
	public void test_11_buildFarm() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		cityPage.setBuildButton();

		Thread.sleep(1000);

		cityPage.tapBuildButton();

		tutorialPage.setBuildBuildingButtonFromTutorialPositionTwo();

		Thread.sleep(2000);

		tutorialPage.tapBuildBuildingButtonFromTutorialPositionTwo();
		cityPage.setSelectionButtonYes();

		Thread.sleep(1000);

		cityPage.tapSelectionButtonYes();
		cityPage.setFinishBuildingFoodFarm();

		Thread.sleep(1000);

		cityPage.tapFinishBuildingFoodFarm();
		cityPage.setBuildingUpgradeFinishButton();

		Thread.sleep(1000);

		cityPage.tapBuildingUpgradeFinishButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

	}

	@Test
	public void test_12_updateCastle() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		tutorialPage.setTutorialBuilding();

		Thread.sleep(5000);

		tutorialPage.tapTutorialBuilding();

		cityPage.setBuildingUpgradeButton();

		Thread.sleep(1000);

		cityPage.tapBuildingUpgradeButton();
		cityPage.setConstructUpgradeButtonInPopUp();

		Thread.sleep(1000);

		cityPage.tapConstructUpgradeButtonInPopUp();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage.setFinishUpdateCastleLvl1();

		Thread.sleep(1000);

		cityPage.tapFinishUpdateCastleLvl1();
		cityPage.setBuildingUpgradeFinishButton();

		Thread.sleep(1000);

		cityPage.tapBuildingUpgradeFinishButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

	}

	@Test
	public void test_13_buildLivingHouse() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		cityPage.setBuildButton();

		Thread.sleep(1000);

		cityPage.tapBuildButton();
		tutorialPage.setBuildBuildingButtonFromTutorialPositionZero();

		Thread.sleep(2000);

		tutorialPage.tapBuildBuildingButtonFromTutorialPositionZero();
		cityPage.setSelectionButtonYes();

		Thread.sleep(1000);

		cityPage.tapSelectionButtonYes();
		cityPage.setFinishBuildingLivingHouse();

		Thread.sleep(1000);

		cityPage.tapFinishBuildingLivingHouse();
		cityPage.setBuildingUpgradeFinishButton();

		Thread.sleep(1000);

		cityPage.tapBuildingUpgradeFinishButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

	}

	@Test
	public void test_14_buildStables() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		cityPage.setBuildButton();

		Thread.sleep(1000);

		cityPage.tapBuildButton();

		tutorialPage.setBuildBuildingButtonFromTutorialPositionThree();

		Thread.sleep(5000);

		tutorialPage.tapBuildBuildingButtonFromTutorialPositionThree();
		cityPage.setSelectionButtonYes();

		Thread.sleep(1000);

		cityPage.tapSelectionButtonYes();
		cityPage.setFinishBuildingStables();

		Thread.sleep(1000);

		cityPage.tapFinishBuildingStables();
		cityPage.setBuildingUpgradeFinishButton();

		Thread.sleep(1000);

		cityPage.tapBuildingUpgradeFinishButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

	}

	@Test
	public void test_15_trainScout() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		tutorialPage.setTutorialBuilding();

		Thread.sleep(5000);

		tutorialPage.tapTutorialBuilding();

		cityPage.setTrainButton();

		Thread.sleep(1000);

		cityPage.tapTrainButton();
		cityPage.setTrainUnitButtonPositionZero();

		Thread.sleep(1000);

		cityPage.tapTrainUnitButtonPositionZero();
		cityPage.setConfirmTrainUnitButton();

		Thread.sleep(1000);

		cityPage.tapConfirmTrainUnitButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

	}

	@Test
	public void test_16_openQuests() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		cityPage.setQuestButton();

		Thread.sleep(1000);

		cityPage.tapQuestButton();
		cityPage.setCloseQuestButton();

		Thread.sleep(1000);

		cityPage.tapCloseQuestButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

	}

	@Test
	public void test_17_getFreeHero() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage.setAvatarButton();

		Thread.sleep(1000);

		cityPage.tapAvatarButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage.setHireHeroButtonPositionZero();

		Thread.sleep(1000);

		cityPage.tapHireHeroButtonPositionZero();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

	}

	@Test
	public void test_18_armyFormation() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);
		worldMapPage = new WorldMapPage(driver);

		tutorialPage.setTutorialBuilding();

		Thread.sleep(1000);

		tutorialPage.tapTutorialBuilding();
		cityPage.setFormArmyButton();

		Thread.sleep(1000);

		cityPage.tapFormArmyButton();
		cityPage.setCreateArmyButton();

		Thread.sleep(1000);

		cityPage.tapCreateArmyButton();
		cityPage.setNextButtonEditArmyPopUp();

		Thread.sleep(1000);

		cityPage.tapNextButtonEditArmyPopUp();
		cityPage.setNextButtonEditArmyPopUp();

		Thread.sleep(1000);

		cityPage.tapNextButtonEditArmyPopUp();
		cityPage.setConfirmButtonEditArmyPopUp();

		Thread.sleep(1000);

		cityPage.tapConfirmButtonEditArmyPopUp();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		worldMapPage.setInspectButton();

		Thread.sleep(1000);

		worldMapPage.tapInspectButton();
	}

	@Test
	public void test_19_goToFirstCampfire() throws InterruptedException {
		worldMapPage = new WorldMapPage(driver);

		worldMapPage.setWorldMapButton();

		Thread.sleep(1000);

		worldMapPage.tapWorldMapButton();
		worldMapPage.setCampFire();

		Thread.sleep(1000);

		worldMapPage.tapCampFire();
		worldMapPage.setStartCampaignButton();

		Thread.sleep(1000);

		worldMapPage.tapStartCampaignButton();
		worldMapPage.setSelectArmyInCampaignPopUpPositionZero();

		Thread.sleep(1000);

		worldMapPage.tapSelectArmyInCampaignPopUpPositionZero();
		worldMapPage.setStartCampaignButtonInCampaignPopUp();

		Thread.sleep(1000);

		worldMapPage.tapStartCampaignButtonInCampaignPopUp();
		worldMapPage.setInspectButton();

		Thread.sleep(1000);

		worldMapPage.tapInspectButton();

	}

	@Test
	public void test_20_ExploreFirstCampfire() throws InterruptedException {
		worldMapPage = new WorldMapPage(driver);
		cityPage = new CityPage(driver);

		cityPage.setChooseArmy();

		Thread.sleep(1000);

		cityPage.tapChooseArmy();
		worldMapPage.setSearchCampfire();

		Thread.sleep(1000);

		worldMapPage.tapSearchCampfire();
		worldMapPage.setExplorerButton();

		Thread.sleep(1000);

		worldMapPage.tapExplorerButton();
		worldMapPage.setInspectButton();

		Thread.sleep(1000);

		worldMapPage.tapInspectButton();

		Thread.sleep(1000);

		worldMapPage.setInspectButton();

		Thread.sleep(1000);

		worldMapPage.tapInspectButton();

	}

	@Test
	public void test_21_goToSecondCampfire() throws InterruptedException {
		worldMapPage = new WorldMapPage(driver);

		worldMapPage.setWorldMapButton();

		Thread.sleep(1000);

		worldMapPage.tapWorldMapButton();
		worldMapPage.setCampFire();

		Thread.sleep(1000);

		worldMapPage.tapCampFire();
		worldMapPage.setStartCampaignButton();

		Thread.sleep(1000);

		worldMapPage.tapStartCampaignButton();
		worldMapPage.setSelectArmyInCampaignPopUpPositionZero();

		Thread.sleep(1000);

		worldMapPage.tapSelectArmyInCampaignPopUpPositionZero();
		worldMapPage.setStartCampaignButtonInCampaignPopUp();

		Thread.sleep(1000);

		worldMapPage.tapStartCampaignButtonInCampaignPopUp();
		worldMapPage.setInspectButton();

		Thread.sleep(1000);

		worldMapPage.tapInspectButton();

	}

	@Test
	public void test_22_ExploreSecondCampfire() throws InterruptedException {
		worldMapPage = new WorldMapPage(driver);
		cityPage = new CityPage(driver);

		cityPage.setChooseArmy();

		Thread.sleep(1000);

		cityPage.tapChooseArmy();

		worldMapPage.setSearchCampfire();

		Thread.sleep(1000);

		worldMapPage.tapSearchCampfire();
		worldMapPage.setExplorerButton();

		Thread.sleep(1000);

		worldMapPage.tapExplorerButton();
		worldMapPage.setInspectButton();

		Thread.sleep(1000);

		worldMapPage.tapInspectButton();

		Thread.sleep(1000);

		worldMapPage.setInspectButton();

		Thread.sleep(1000);

		worldMapPage.tapInspectButton();

	}

	@Test
	public void test_23_LogOut() throws InterruptedException {
		cityPage = new CityPage(driver);

		cityPage.setSettingsButton();

		Thread.sleep(1000);

		cityPage.tapSettingsButton();
		cityPage.setLogOutButton();
		cityPage.tapLogOutButton();

		loginPage = new LoginPage(driver);
		assertTrue(loginPage.isEmailDisplayed());

	}
}