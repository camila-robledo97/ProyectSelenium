/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigation.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author USER
 */
public class MantisLogin {
    
    WebDriver driver;

	By userNameMantis = By.xpath("//*[@id=\"username\"]");

	By passwordMantis = By.xpath("//*[@id=\"password\"]");

	//By titleText = By.className("barone");

	By login = By.xpath("//input[@value='Iniciar sesión']");
        

	public MantisLogin(WebDriver driver){

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

        
        public void clickLoginUserName(){
            driver.findElement(login).click();
        }
	// Click on login button

	public void clickLoginPassword() {

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
	 * @return
	 * 
	 */

	public void loginUserNameToMantis(String strUserName) {

		// Fill user name
		this.setUserName(strUserName);

		// Click Login button
		this.clickLoginUserName();
	}
        
        
        
        
        /**
	 * 
	 * This POM method will be exposed in test case to login in the application
	 * 
	 * @param strPasword
	 * 
	 * @return
	 * 
	 */
        public void loginPasswordToMantis(String strPasword) {

		// Fill password
		this.setPassword(strPasword);

		// Click Login button
		this.clickLoginPassword();
	}
}
