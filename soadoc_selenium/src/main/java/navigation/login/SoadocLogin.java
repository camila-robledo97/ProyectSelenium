package navigation.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SoadocLogin {

    WebDriver driver;

    By userNameSoadoc = By.xpath("/html/body/app-root/app-login/div/div/div/form/div[1]/span/input");
    By passwordSoadoc = By.xpath("/html/body/app-root/app-login/div/div/div/form/div[2]/span/input");
    By login = By.xpath("/html/body/app-root/app-login/div/div/div/form/div[3]/button");


    public SoadocLogin(WebDriver driver) {
        this.driver = driver;
    }


    public void setUserName(String strUserName) {

        driver.findElement(userNameSoadoc).sendKeys(strUserName);

    }

    public void setPassword(String strPassword) {
        driver.findElement(passwordSoadoc).sendKeys(strPassword);
    }

    public void clickButtonLogin(){
        driver.findElement(login).click();
    }

    public void loginSoadoc (String strUserName, String strPassword){
        setUserName(strUserName);
        setPassword(strPassword);
        clickButtonLogin();
    }


}
