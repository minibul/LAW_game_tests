package pages;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;
import com.alttester.Commands.ObjectCommand.AltSetTextParams;
import com.alttester.altTesterExceptions.WaitTimeOutException;
import configReader.RandomDataGenerator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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

	private static String getProperty(String key) {
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
		this.loginWithEmailButton = getDriver().waitForObject(params);
	}

//	public boolean isEmailDisplayed() {
//		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/LoginMethodsScreen/Social buttons/Login Email").build();
//		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
//		AltObject loginWithEmailButton = driver.waitForObject(params);
//
//		return loginWithEmailButton != null;
//	}

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
	public void enterRandomLogin() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/LoginContent/Input container Login/Input").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		AltObject inputLoginTab = driver.waitForObject(params);
		String randomLogin = RandomDataGenerator.generateRandomLogin(8, 16);
		inputLoginTab.setText(new AltSetTextParams.Builder(randomLogin).build());
	}

	public void enterEmail() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/LoginContent/Input container E-mail/Input").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.inputEmailLoginTab = driver.waitForObject(params);
		inputEmailLoginTab.setText(new AltSetTextParams.Builder(getProperty("email")).build());
	}

	public void enterRandomEmail() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/LoginContent/Input container E-mail/Input").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.inputEmailLoginTab = driver.waitForObject(params);
		String randomEmail = RandomDataGenerator.generateRandomEmail("example.com", 10);
		inputEmailLoginTab.setText(new AltSetTextParams.Builder(randomEmail).build());
	}

	public void enterPassword() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/LoginContent/Input container Password/Input").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.inputPasswordLoginTab = driver.waitForObject(params);
		inputPasswordLoginTab.setText(new AltSetTextParams.Builder(getProperty("password")).build());
	}

	public void enterRandomPassword() {
		AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.PATH, "//MainMenuUI/Canvas/Content/AccountScreen/LoginContent/Input container Password/Input").build();
		AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(10).build();
		this.inputPasswordLoginTab = driver.waitForObject(params);
		String randomPassword = RandomDataGenerator.generateRandomPassword(8);
		inputPasswordLoginTab.setText(new AltSetTextParams.Builder(randomPassword).build());
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
