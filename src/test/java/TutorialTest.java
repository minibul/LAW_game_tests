//import configReader.RandomDataGenerator;
//import org.junit.Test;
//import pages.CityPage;
//import pages.TutorialPage;
//
//public class TutorialTest extends BaseTest {
//
//
//	@Test
//	public void test_1_successfulCompletionOfTutorial()throws InterruptedException {
////	registration new user
//		String randomLogin = RandomDataGenerator.generateRandomLogin(3, 16);
//		String randomEmail = RandomDataGenerator.generateRandomEmail("example.com", 10);
//		String randomPassword = RandomDataGenerator.generateRandomPassword(8);
//
//		loginPage.setLoginWithEmailButton();
//		loginPage.tapLoginWithEmailButton();
//		loginPage.setRegistrationButton();
//
//		Thread.sleep(1000);
//
//		loginPage.tapRegistrationButton();
//		loginPage.enterNicknameRegistrationTab(randomLogin);
//		loginPage.enterEmailRegistrationTab(randomEmail);
//		loginPage.enterPasswordRegistrationTab(randomPassword);
//		loginPage.enterRepeatPasswordRegistrationTab(randomPassword);
//		loginPage.setRegisterButton();
//		loginPage.tapRegisterButton();
//		loginPage.setPlayButton();
//
//		Thread.sleep(1000);
//
//		loginPage.tapPlayButton();
//		loginPage.setConfirmButton();
//		loginPage.tapConfirmButton();
//
////	start tutorial
//		tutorialPage = new TutorialPage(driver);
//
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//
//		cityPage = new CityPage(driver);
//		cityPage.setChooseArmy();
//
//		Thread.sleep(5000);
//
//		cityPage.tapChooseArmy();
//
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
////  go to castle
//		cityPage.setGoToCastleLevel1();
//
//		Thread.sleep(1000);
//
//		cityPage.tapGoToCastleLevel1();
//
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//
//		cityPage.setChangeArmyRangeButton();
//
//		Thread.sleep(1000);
//
//		cityPage.tapChangeArmyRangeButton();
//
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
////  castle defense
//		cityPage.setChangeArmyAggressionButton();
//
//		Thread.sleep(1000);
//
//		cityPage.tapChangeArmyAggressionButton();
//		cityPage.tapChangeArmyRangeButton();
//
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
////  castle capture
//		cityPage.setCastleLevel1();
//
//		Thread.sleep(3000);
//
//		cityPage.tapCastleLevel1();
//		cityPage.setCaptureCastleButton();
//
//		Thread.sleep(1000);
//
//		cityPage.tapCaptureCastle();
//
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//
//		cityPage.setActionBar();
//		cityPage.tapActionBar();
//
//		Thread.sleep(2000);
//
//		cityPage.setActionBar();
//		cityPage.tapActionBar();
////  second part of tutorial
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
////	build stone quarry
//		cityPage.setTutorialBuilding();
//
//		Thread.sleep(5000);
//
//		cityPage.tapTutorialBuilding();
//
//		cityPage.setConstructBuildingButton();
//
//		Thread.sleep(1000);
//
//		cityPage.tapConstructBuildingButton();
//		cityPage.setConstructUpgradeButtonInPopUp();
//
//		Thread.sleep(1000);
//
//		cityPage.tapConstructUpgradeButtonInPopUp();
//
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//
//		cityPage.setTutorialBuilding();
//
//		Thread.sleep(1000);
//
//		cityPage.tapTutorialBuilding();
//		cityPage.setBuildingUpgradeFinishButton();
//
//		Thread.sleep(1000);
//
//		cityPage.tapBuildingUpgradeFinishButton();
//
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//
////	construct iron mine
//		cityPage.setTutorialBuilding();
//
//		Thread.sleep(5000);
//
//		cityPage.tapTutorialBuilding();
//		cityPage.setConstructBuildingButton();
//
//		Thread.sleep(1000);
//
//		cityPage.tapConstructBuildingButton();
//		cityPage.setConstructUpgradeButtonInPopUp();
//
//		Thread.sleep(1000);
//
//		cityPage.tapConstructUpgradeButtonInPopUp();
//		cityPage.setFinishBuildingIronMineInTutorial();
//
//		Thread.sleep(1000);
//
//		cityPage.tapFinishBuildingIronMineInTutorial();
//		cityPage.setBuildingUpgradeFinishButton();
//
//		Thread.sleep(1000);
//
//		cityPage.tapBuildingUpgradeFinishButton();
//
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//
//		cityPage.setBuildButton();
//
//		Thread.sleep(1000);
//
//		cityPage.tapBuildButton();
//
//// build lumber mill
//
//		cityPage.setBuildBuildingButtonFromTutorialPositionTwo();
//
//		Thread.sleep(1000);
//
//		cityPage.tapBuildBuildingButtonFromTutorialPositionTwo();
//		cityPage.setSelectionButtonYes();
//
//		Thread.sleep(1000);
//
//		cityPage.tapSelectionButtonYes();
//		cityPage.setTutorialBuilding();
//
//		Thread.sleep(1000);
//
//		cityPage.tapTutorialBuilding();
//		cityPage.setBuildingUpgradeFinishButton();
//
//		Thread.sleep(1000);
//
//		cityPage.tapBuildingUpgradeFinishButton();
//
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//		tutorialPage.setTutorialBanner();
//		tutorialPage.tapTutorialBanner();
//
//	}
//}

import configReader.RandomDataGenerator;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.CityPage;
import pages.LoginPage;
import pages.TutorialPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TutorialTest extends BaseTest {

	@Test
	public void test_01_successfulCompletionOfTutorial() throws InterruptedException {

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

		cityPage.setGoToCastleLevel1();

		Thread.sleep(1000);

		cityPage.tapGoToCastleLevel1();

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
	}

	@Test
	public void test_05_castleCapture() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		cityPage.setChangeArmyAggressionButton();

		Thread.sleep(1000);

		cityPage.tapChangeArmyAggressionButton();
		cityPage.setChangeArmyRangeButton();

		Thread.sleep(1000);

		cityPage.tapChangeArmyRangeButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage.setCastleLevel1();

		Thread.sleep(3000);

		cityPage.tapCastleLevel1();
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
	public void test_06_secondPartOfTutorial() throws InterruptedException {
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

		cityPage.setTutorialBuilding();

		Thread.sleep(5000);

		cityPage.tapTutorialBuilding();

		cityPage.setConstructBuildingButton();

		Thread.sleep(1000);

		cityPage.tapConstructBuildingButton();
		cityPage.setConstructUpgradeButtonInPopUp();

		Thread.sleep(1000);

		cityPage.tapConstructUpgradeButtonInPopUp();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage.setTutorialBuilding();

		Thread.sleep(1000);

		cityPage.tapTutorialBuilding();
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

		cityPage.setTutorialBuilding();

		Thread.sleep(5000);

		cityPage.tapTutorialBuilding();
		cityPage.setConstructBuildingButton();

		Thread.sleep(1000);

		cityPage.tapConstructBuildingButton();
		cityPage.setConstructUpgradeButtonInPopUp();

		Thread.sleep(1000);

		cityPage.tapConstructUpgradeButtonInPopUp();
		cityPage.setFinishBuildingIronMineInTutorial();

		Thread.sleep(1000);

		cityPage.tapFinishBuildingIronMineInTutorial();
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

		cityPage.setBuildBuildingButtonFromTutorialPositionTwo();

		Thread.sleep(2000);

		cityPage.tapBuildBuildingButtonFromTutorialPositionTwo();
		cityPage.setSelectionButtonYes();

		Thread.sleep(1000);

		cityPage.tapSelectionButtonYes();
		cityPage.setTutorialBuilding();

		Thread.sleep(1000);

		cityPage.tapTutorialBuilding();
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

		cityPage.setBuildBuildingButtonFromTutorialPositionZero();

		Thread.sleep(2000);

		cityPage.tapBuildBuildingButtonFromTutorialPositionZero();
		cityPage.setSelectionButtonYes();

		Thread.sleep(1000);

		cityPage.tapSelectionButtonYes();

		cityPage.setFinishBuildingStoreHouseInTutorial();

		Thread.sleep(1000);

		cityPage.tapFinishBuildingStoreHouseInTutorial();
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

		cityPage.setBuildBuildingButtonFromTutorialPositionTwo();

		Thread.sleep(2000);

		cityPage.tapBuildBuildingButtonFromTutorialPositionTwo();
		cityPage.setSelectionButtonYes();

		Thread.sleep(1000);

		cityPage.tapSelectionButtonYes();
		cityPage.setFinishBuildingFoodFarmInTutorial();

		Thread.sleep(1000);

		cityPage.tapFinishBuildingFoodFarmInTutorial();
		cityPage.setBuildingUpgradeFinishButton();

		Thread.sleep(1000);

		cityPage.tapBuildingUpgradeFinishButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();
		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

	}

	@Test
	public void test_12_UpdateCastle() throws InterruptedException {
		tutorialPage = new TutorialPage(driver);
		cityPage = new CityPage(driver);

		cityPage.setTutorialBuilding();

		Thread.sleep(5000);

		cityPage.tapTutorialBuilding();

		cityPage.setBuildingUpgradeButton();

		Thread.sleep(1000);

		cityPage.tapBuildingUpgradeButton();
		cityPage.setConstructUpgradeButtonInPopUp();

		Thread.sleep(1000);

		cityPage.tapConstructUpgradeButtonInPopUp();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

		cityPage.setFinishUpdateCastleLvl1InTutorial();

		Thread.sleep(1000);

		cityPage.tapFinishUpdateCastleLvl1InTutorial();
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

		cityPage.setBuildBuildingButtonFromTutorialPositionTwo();

		Thread.sleep(2000);

		cityPage.tapBuildBuildingButtonFromTutorialPositionTwo();
		cityPage.setSelectionButtonYes();

		Thread.sleep(1000);

		cityPage.tapSelectionButtonYes();
		cityPage.setFinishBuildingLivingHouseInTutorial();

		Thread.sleep(1000);

		cityPage.tapFinishBuildingLivingHouseInTutorial();
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

		cityPage.setBuildBuildingButtonFromTutorialPositionTwo();

		Thread.sleep(5000);

		cityPage.tapBuildBuildingButtonFromTutorialPositionTwo();
		cityPage.setSelectionButtonYes();

		Thread.sleep(1000);

		cityPage.tapSelectionButtonYes();
		cityPage.setFinishBuildingStablesInTutorial();

		Thread.sleep(1000);

		cityPage.tapFinishBuildingStablesInTutorial();
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

		cityPage.setTutorialBuilding();

		Thread.sleep(5000);

		cityPage.tapTutorialBuilding();

		cityPage.setTrainButton();

		Thread.sleep(1000);

		cityPage.tapTrainButton();
		cityPage.setTrainUnitButton();

		Thread.sleep(1000);

		cityPage.tapTrainUnitButton();
		cityPage.setConfirmTrainUnitButton();

		Thread.sleep(1000);

		cityPage.tapConfirmTrainUnitButton();

		tutorialPage.setTutorialBanner();
		tutorialPage.tapTutorialBanner();

	}

}