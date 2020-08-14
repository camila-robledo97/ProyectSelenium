package navigation.createproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTestProject {

    WebDriver driver;
    int numPP; //Numero del proyecto de pruebas

    By testProjectManagement = By.xpath("//a[contains(text(), 'Gestión de Proyectos de Pruebas')]");

    public NewTestProject(WebDriver driver) {
        this.driver = driver;
    }

    // Click on testProjectManagement button
    public void clickTestProjectManagement() {

        driver.switchTo().frame("mainframe");
        driver.findElement(testProjectManagement).click();

    }

    /**
     *
     * This POM method will be exposed in test case to login in the application
     *
     * @return
     *
     */
    public void createNewProject() {
        //Click TestProjectManagement Option
        this.clickTestProjectManagement();
        
    }
    
    public void clickCrear() {

        // Se da click en el botón "Gestion de proyectos de prueba"
        driver.findElement(By.xpath("//*[@id=\"create\"]")).click();
        
    }
    
    
    // se inserta el nombre del proyecto de pruebas
    public void InsertNombrePP(int numPP) {
        
        driver.findElement(By.xpath("//*[@id=\"item_view\"]/tbody/tr[2]/td[2]/input")).sendKeys("Proyecto pruebas " + numPP);
        

    }
    
    
    // Se inserta el prefijo del proyecto de pruebas
    public void InsertPrefijoPP(int numPP){
        
        driver.findElement(By.xpath("//*[@id=\"item_view\"]/tbody/tr[3]/td[2]/input")).sendKeys("PP"+ numPP);
    }
    
    
    
     public void clickGuardar() {

        // Se da click en el botón "Crear" para que se guarde el nuevo proyecto
        driver.findElement(By.xpath("//*[@id=\"item_view\"]/tbody/tr[18]/td/div/input[3]")).click();

    }

}
