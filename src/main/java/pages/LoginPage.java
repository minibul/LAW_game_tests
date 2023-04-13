package pages;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;
import com.alttester.Commands.ObjectCommand.AltSetTextParams;

public class LoginPage extends BasePage {

	public static AltObject loginWithEmailButton;
	public AltObject inputEmailLoginTab;
	private static AltDriver driver;
	private AltObject inputPasswordLoginTab;
	private AltObject loginButton;
	private AltObject playButton;

	public LoginPage(AltDriver driver) {
		super(driver);
		this.driver = driver;
		setLoginWithEmailButton();
	}

	public void initializeEmailAndPasswordInputs() {
		enterEmail();
		enterPassword();
	}

	public void setLoginWithEmailButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/LoginMethodsScreen/Social buttons/Login Email").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.loginWithEmailButton = getDriver().waitForObject(params);
	}

	public boolean isEmailDisplayed() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/LoginMethodsScreen/Social buttons/Login Email").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		AltObject loginWithEmailButton = driver.waitForObject(params);

		return loginWithEmailButton != null;
	}
	public void enterEmail() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/LoginContent/Input container E-mail/Input").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.inputEmailLoginTab = driver.waitForObject(params);
		inputEmailLoginTab.setText(new AltSetTextParams.Builder("anton.bondarev@sabregames.com").build());
	}

	public void enterPassword() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/LoginContent/Input container Password/Input").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.inputPasswordLoginTab = driver.waitForObject(params);
		inputPasswordLoginTab.setText(new AltSetTextParams.Builder("Buldog211").build());
	}

	public void setLoginButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/LoginContent/Login Button").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.loginButton = getDriver().waitForObject(params);
	}

	public void setPlayButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/PlayScreen/CenterGroup/Play Button").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.playButton = getDriver().waitForObject(params);
	}
	public void tapEmailInput(){
		inputEmailLoginTab.tap();
	}

	public void tapPasswordInput(){
		inputPasswordLoginTab.tap();
	}

	public void tapPlayButton(){
		playButton.tap();
	}
	public void pressLoginButton(){
		loginButton.tap();
	}

	public void pressLoginWithEmailButton(){
		loginWithEmailButton.tap();
	}



}
