package navigation.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestLinkLogin {

	WebDriver driver;

	By userNameMantis = By.xpath("//*[@id=\"username\"]");

	By passwordMantis = By.xpath("//*[@id=\"password\"]");

	//By titleText = By.className("barone");

	By login = By.xpath("//input[@value='Iniciar sesión']");
        //*[@id="login-form"]/fieldset/input[2]

	public TestLinkLogin(WebDriver driver){

        this.driver = driver;

    }

	// Set user name in textbox

	public void setUserName(String strUserName) {

		driver.findElement(userNameMantis).sendKeys(strUserName);

	}

	// Set password in password textbox

	public void setPassword(String strPassword) {

		driver.findElement(passwordMantis).sendKeys(strPassword);

	}
        
        

	// Click on login button

	public void clickLogin() {

		driver.findElement(login).click();

	}

	// Get the title of Login Page

	//public String getLoginTitle() {

		//return driver.findElement(titleText).getText();

	//}

	/**
	 * 
	 * This POM method will be exposed in test case to login in the application
	 * 
	 * @param strUserName
	 * 
	 * @param strPasword
	 * 
	 * @return
	 * 
	 */

	public void loginToTestLink(String strUserName, String strPasword) {

		// Fill user name

		this.setUserName(strUserName);

		// Fill password

		this.setPassword(strPasword);

		// Click Login button

		this.clickLogin();
	}

}
