
package navigation.createSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NewSuite {

    WebDriver driver;
    int numSuite;
    By editTestCases = By.xpath("//a[contains(text(), 'Editar Caso(s) de Prueba')]");
    
    
    
    public NewSuite(WebDriver driver) {
        this.driver = driver;
    }

    
    
    public void clickeditCase() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("mainframe");
        driver.findElement(editTestCases).click();
    }

    
    
    public void createNewSuite() {
        this.clickeditCase();
    }
    
    public void clickProject(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame("treeframe");
        driver.findElement(By.xpath("//*[@id=\"extdd-3\"]")).click();
        
        
    }
    
    public void clickActionsProject(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame("workframe");
        driver.findElement(By.xpath("//html/body/div/img")).click();
       
    }
    
    public void selectProject(int numPP){
        driver.switchTo().frame("titlebar");
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"select-project-id\"]")));
        //dropdown.selectByVisibleText("PP" + numPP + ":" + "Proyecto pruebas " + numPP);
        dropdown.selectByVisibleText("Proyecto_Prueba1");
        //*[@id="select-project-id"]
    }
    
    
}
