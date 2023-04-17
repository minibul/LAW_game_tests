package pages;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;
import com.alttester.Commands.ObjectCommand.AltSetTextParams;
import com.alttester.altTesterExceptions.WaitTimeOutException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginPage extends BasePage {

	public static AltObject loginWithEmailButton;
	public AltObject inputEmailLoginTab;
	private static AltDriver driver;
	private AltObject loginButton;
	private AltObject playButton;
	private AltObject backButton;
	private AltObject registrationButton;
	private AltObject registerButton;
	private AltObject logoutButton;

	public LoginPage(AltDriver driver) {
		super(driver);
		LoginPage.driver = driver;
		setLoginWithEmailButton();
	}

	public static String getProperty(String key) {
		Properties properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}

	public void setLoginWithEmailButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/LoginMethodsScreen/Social buttons/Login Email").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		loginWithEmailButton = getDriver().waitForObject(params);
	}

	public boolean isEmailDisplayed() {
		try {
			AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/LoginMethodsScreen/Social buttons/Login Email").build();
			AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
			AltObject loginWithEmailButton = driver.waitForObject(params);

			return loginWithEmailButton != null;
		} catch (WaitTimeOutException e) {
			return false;
		}
	}

	public void enterEmailLoginTab(String email) {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/LoginContent/Input container E-mail/Input").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.inputEmailLoginTab = driver.waitForObject(params);
		inputEmailLoginTab.setText(new AltSetTextParams.Builder(email).build());
	}

	public void enterPasswordLoginTab(String password) {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/LoginContent/Input container Password/Input").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		AltObject inputPasswordLoginTab = driver.waitForObject(params);
		inputPasswordLoginTab.setText(new AltSetTextParams.Builder(password).build());
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

	public void setBackButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/BackButton").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.backButton = getDriver().waitForObject(params);
	}

	public void setRegistrationButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/LoginContent/RegisterTabButton").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.registrationButton = getDriver().waitForObject(params);
	}

	public void enterNicknameRegistrationTab(String password) {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/RegistrationContent/Input container Nickname/Input").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		AltObject inputNicknameRegistrationTab = driver.waitForObject(params);
		inputNicknameRegistrationTab.setText(new AltSetTextParams.Builder(password).build());
	}

	public void enterEmailRegistrationTab(String email) {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/RegistrationContent/Input container E-mail/Input").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		AltObject inputEmailRegistrationTab = driver.waitForObject(params);
		inputEmailRegistrationTab.setText(new AltSetTextParams.Builder(email).build());
	}

	public void enterPasswordRegistrationTab(String password) {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/RegistrationContent/Input container Password/Input").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		AltObject inputPasswordRegistrationTab = driver.waitForObject(params);
		inputPasswordRegistrationTab.setText(new AltSetTextParams.Builder(password).build());
	}

	public void enterRepeatPasswordRegistrationTab(String password) {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/RegistrationContent/Input container Repeat Password/Input").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		AltObject inputRepeatPasswordRegistrationTab = driver.waitForObject(params);
		inputRepeatPasswordRegistrationTab.setText(new AltSetTextParams.Builder(password).build());
	}

	public void setRegisterButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/RegistrationContent/Register Button").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.registerButton = getDriver().waitForObject(params);
	}

	public void setLogoutButton() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/PlayScreen/LogOutButton").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.logoutButton = getDriver().waitForObject(params);
	}

	public void tapPlayButton(){
		playButton.tap();
	}
	public void tapLoginButton(){
		loginButton.tap();
	}
	public void tapLoginWithEmailButton(){
		loginWithEmailButton.tap();
	}
	public void tapBackButton(){
		backButton.tap();
	}
	public void tapRegistrationButton(){
		registrationButton.tap();
	}
	public void tapRegisterButton(){
		registerButton.tap();
	}
	public void tapLogoutButton(){
		logoutButton.tap();
	}

}
