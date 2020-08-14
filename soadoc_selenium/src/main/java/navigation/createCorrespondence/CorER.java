package navigation.createCorrespondence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CorER {

    WebDriver driver;

    public CorER(WebDriver driver) {
        this.driver = driver;
    }


    //Click  on gestion de documentos list
    public void clicklistGD(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame("external-page");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/ul/li[3]/a")).click();
    }


}
