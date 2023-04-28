package pages;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;

public class TutorialPage extends BasePage {
	private AltObject firstTutorialBanner;
	private final AltDriver driver;
	private AltObject goToCastleLevel1;
	private AltObject castleLevel1;
	private AltObject tutorialBuilding;
	private AltObject buildBuildingButtonFromTutorialPositionZero;
	private AltObject buildBuildingButtonFromTutorialPositionTwo;
	private AltObject buildBuildingButtonFromTutorialPositionThree;

	public TutorialPage(AltDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public void setTutorialBanner() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//Canvas/Safe Area/Tutorial/HintManager/Hint(Clone)").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(200).build();
		firstTutorialBanner = getDriver().waitForObject(params);
	}
	public void setGoToCastleLevel1() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//TutorialCircle(Clone)/../renderer").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.goToCastleLevel1 = getDriver().waitForObject(params);
	}
	public void setCastleLevel1() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Building - CASTLE lvl 1").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.castleLevel1 = getDriver().waitForObject(params);
	}
	public void setTutorialBuilding() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//TutorialCircle(Clone)/../Renderers").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(30).build();
		this.tutorialBuilding = getDriver().waitForObject(params);
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

	public void tapTutorialBanner(){
		firstTutorialBanner.tap();
	}
	public void tapGoToCastleLevel1(){
		goToCastleLevel1.tap();
	}
	public void tapCastleLevel1(){
		castleLevel1.tap();
	}
	public void tapTutorialBuilding(){
		tutorialBuilding.tap();
	}
	public void tapBuildBuildingButtonFromTutorialPositionZero(){
		buildBuildingButtonFromTutorialPositionZero.tap();
	}
	public void tapBuildBuildingButtonFromTutorialPositionTwo(){
		buildBuildingButtonFromTutorialPositionTwo.tap();
	}
	public void tapBuildBuildingButtonFromTutorialPositionThree(){
		buildBuildingButtonFromTutorialPositionThree.tap();
	}

}
