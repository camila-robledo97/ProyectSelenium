
package navigation.stateTransition;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StateTransition {
    
    WebDriver driver;
     By clickfirstIncidence = By.xpath("//*[@id=\"buglist\"]/tbody/tr[1]/td[4]");
     
     By clickChangeStateToAssigned = By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div[1]/div"
             + "/div[2]/div[2]/div/table/tfoot/tr/td/div/div[3]/form/input[1]");
     
    By setAddNote = By.xpath("//*[@id=\"bugnote_text\"]");
    By clickButtonNewIncidence = By.xpath("//*[@id=\"bug-change-status-form\"]/fieldset/div/div[2]/div[2]/input");
    
    
    
    
    public StateTransition(WebDriver driver){
        this.driver = driver;
    }
    

    
    
    
    
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    /* Este camino que tomaran las inicencias en las deciciones todas sera: 
    1. Se necesitan mas datos? = No 
    2. Realmente es una incidencia? = No
    3. Realmente aplica? = No
    3. Es para la proxima version? = No
    4. Fin
    */
    
    public void clickSeeIncidences() {

        //driver.switchTo().frame("main");
        //driver.findElement(reportIncidence).click();
        driver.get("http://181.49.173.42:4040/mantisbt-2.20.0.0/mantisbt-2.20.0/view_all_bug_page.php");
        System.out.println("Entro en: clickSeeIncidences");
    }
    
    
    public void clickfirstIncidence(){
        System.out.println("Entro en: clickfirstIncidence");
        driver.findElement(clickfirstIncidence).click();
        
    }
    
   
    public void clickChangeStateTo(){
        System.out.println("Entro en: clickChangeStateToAssigned");
        driver.findElement(clickChangeStateToAssigned).click();
    }
    
    public void setAddNote(){
        driver.findElement(setAddNote).sendKeys("Esta es la nota para cambiar el estado a: Asignado");
    }
    
    
    
    //El click que se le da al boton  "Incidencia nueva" es para guardar el cambio de estado
    public void clickButtonNewIncidence(){
        driver.findElement(clickButtonNewIncidence).click();
    }
   
    
    
    
    
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------


    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    
    
    /* Este camino que tomaran las inicencias en las deciciones todas sera: 
    1. Se necesitan mas datos? = No 
    2. Realmente es una incidencia? = Si
    
    */
    By clickSecondIncidence = By.xpath("//*[@id=\"buglist\"]/tbody/tr[2]/td[4]");
    By selectChangeStateAccepted = By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/"
            + "div[1]/div/div[2]/div[2]/div/table/tfoot/tr/td/div/div[3]/form/select");
   //clickSeeIncidences();
    
    public void clickSecondIncidence(){
        driver.findElement(clickSecondIncidence).click();
    }
    
    //clickChangeStateTo();
    //setAddNote();
    //clickButtonNewIncidence();
    //clickSeeIncidences();
    //clickSecondIncidence();
    
    public void selectChangeStateAccepted(){
        WebElement select = driver.findElement(selectChangeStateAccepted);
        List<WebElement> options = select.findElements(By.tagName("option"));

        int randomRecord;
        randomRecord = (int) Math.floor(Math.random() * (options.size()));
        while (options.get(randomRecord).getText().equals("Aceptada")){
        	randomRecord = (int) Math.floor(Math.random() * (options.size()));   
        }
        
        options.get(randomRecord).click();
    }
    
    
    
    
    
    
    
    
    
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    
    
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    
    /* Este camino que tomaran las inicencias en las deciciones todas sera: 
    1. Se necesitan mas datos? = Si 
    2. Se necesitan mas datos? = No
    3. Realmente aplica? = Si
    
    */
    
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    /* Este camino que tomaran las inicencias en las deciciones todas sera: 
    1. Se necesitan mas datos? = Si 
    2. Se necesitan mas datos? = No
    3. Realmente aplica? = Si
    */
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------







}
