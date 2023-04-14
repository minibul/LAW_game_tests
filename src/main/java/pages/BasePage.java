package pages;

import com.alttester.AltDriver;

public abstract class BasePage {
	protected AltDriver driver;

	public BasePage(AltDriver driver) {
		this.driver = driver;
	}

	public AltDriver getDriver() {
		return driver;
	}

}
