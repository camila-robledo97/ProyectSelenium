/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigation.createIncidence;

import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author USER
 */
public class NewIncidence {
    WebDriver driver;
    long TInicio;
    long TFin;
    long tiempo;
    String fileEvidence = "File/Manual De MantisBT.pdf";
    File ruta = new File (fileEvidence).getAbsoluteFile();
    By selectProject = By.xpath("//*[@id=\"select-project-id\"]");
    By selectCategory = By.xpath("//*[@id=\"category_id\"]");
    By selectReproducibility = By.xpath("//*[@id=\"reproducibility\"]");
    By selectSeverity = By.xpath("//*[@id=\"severity\"]");
    By selectPriority = By.xpath("//*[@id=\"priority\"]");
    By selectAssignTo = By.xpath("//*[@id=\"handler_id\"]");
    By clickSelectproject = By.xpath("//*[@id=\"select-project-form\"]/div/div[2]/div[2]/input");
    By insertSummary = By.xpath("//*[@id=\"summary\"]");
    By insertDescription = By.xpath("//*[@id=\"description\"]");
    By insertStepsToFollow = By.xpath("//*[@id=\"steps_to_reproduce\"]");
    By selectCheck = By.xpath("//*[@id=\"report_bug_form\"]/div/div[2]/div[1]/div/table/tbody/tr[14]/td/label/span");
    By insertAdditionalInformation = By.xpath("//*[@id=\"additional_info\"]");
    By insertImage = By.xpath("//*[@id=\"report_bug_form\"]/div/div[2]/div[1]/div/table/tbody/tr[12]/td/div[2]");
    By clicSendIncidence = By.xpath("//*[@id=\"report_bug_form\"]/div/div[2]/div[2]/input");
    
    

    //By reportIncidence = By.xpath("//span[contains(text(), 'Reportar incidencia')]");

    public NewIncidence(WebDriver driver) {
        this.driver = driver;
    }

    
    
    
    // Click on clickReportIncidence button
    public void clickReportIncidence() {

        //driver.switchTo().frame("main");
        //driver.findElement(reportIncidence).click();
        driver.get("http://181.49.173.42:4040/mantisbt-2.20.0.0/mantisbt-2.20.0/login_"
                + "select_proj_page.php?ref=bug_report_page.php");
        
        
    }
    
    
    
    

    /**
     *
     * This POM method will be exposed in test case to login in the application
     *
     *
     *
     */
    public void createNewIncidence() {
        //Click clickReportIncidence Option
        this.clickReportIncidence();
     
    }

    
    
    
    
    
    public void randomSelectProject(int numSelectProject) {
      

        int searchNumber = 1;
        String nameProject;
        boolean confirmText = false;
        //trae uno por uno quemando el xpath de cada valor por codigo
        String[] selectContent = new String[numSelectProject + 1];
        //Se quema el xpath del select
        Select toAssign = new Select(driver.findElement(selectProject));
        for (int i = 1; i <= selectContent.length - 1; i++) {
            nameProject = "Proyecto " + i;
            //String[] arreglo = new String[driver.findElements(By.xpath("//*[@id=\"project-status\"]")).size()];
            while (confirmText == false) {
                selectContent[i] = driver.findElement(By.xpath("//*[@id=\"select-project-id\"]"
                        + "/option[" + searchNumber + "]")).getText();

                //if(selectContent[i].endsWith("Proyecto 1")){
                if (nameProject.equals(selectContent[i])) {
                    confirmText = true;
                } else if (!nameProject.equals(selectContent[i])) {
                    searchNumber++;
                    //System.out.println(searchNumber + " esta buscando popsicion");
                }
            }
            //System.out.println("el proyecto num " + i + "fue encontrado en la opcion " + searchNumber  );
            //System.out.println(selectContent[i]);
            confirmText = false;
            searchNumber = i;

        }
        toAssign.selectByVisibleText(selectContent[numSelectProject]);
        }

    

    
    
    
    
    
    
    
    public void randomSelectCategory(){
   

        WebElement select = driver.findElement(selectCategory);
        List<WebElement> options = select.findElements(By.tagName("option"));

        int randomRecord;
        randomRecord = (int) Math.floor(Math.random() * (options.size()));
        while (options.get(randomRecord).getText().equals("(seleccionar)")){
        	randomRecord = (int) Math.floor(Math.random() * (options.size()));   
        }
        
        options.get(randomRecord).click();
    }

    
    
    
    
    
    public void randomSelectReproducibility() {
        
        WebElement select = driver.findElement(selectReproducibility);
        List<WebElement> options = select.findElements(By.tagName("option"));

        int randomRecord;
        
            randomRecord = (int) Math.floor(Math.random() * (options.size()));
            System.out.println("Categoría Seleccionada Aleatoreamente: "
                    + options.get(randomRecord).getText());
        
        options.get(randomRecord).click();
    }


    
    
    
    
    
    
    public void randomSelectSeverity(){
    
       
       WebElement select = driver.findElement(selectSeverity);
        List<WebElement> options = select.findElements(By.tagName("option"));

        int randomRecord;
        
            randomRecord = (int) Math.floor(Math.random() * (options.size()));
            System.out.println("Categoría Seleccionada Aleatoreamente: "
                    + options.get(randomRecord).getText());
        
        options.get(randomRecord).click();
        
    }
    
    public void randomSelectPriority() {

        
  
        WebElement select = driver.findElement(selectPriority);
        List<WebElement> options = select.findElements(By.tagName("option"));

        int randomRecord;
        
            randomRecord = (int) Math.floor(Math.random() * (options.size()));
           
        
        options.get(randomRecord).click();
        
        
        
    }
    
    public void randomSelectAssignTo() {
        
        WebElement select = driver.findElement(selectAssignTo);
        String[] listUsersToAssing = new String[3];
        listUsersToAssing[0] = "barbelaez";
        listUsersToAssing[1] = "mherrera";
        listUsersToAssing[2] = "ypllanos";

        List<WebElement> options = select.findElements(By.tagName("option"));

        int randomRecord;
        int search = 0;
        randomRecord = (int) Math.floor(Math.random() * (options.size()));

        while (!options.get(randomRecord).getText().equals(listUsersToAssing[search])) {

            search++;

            if (search >= 3) {
                randomRecord = (int) Math.floor(Math.random() * (options.size()));
                search = 0;
            }
        }

        options.get(randomRecord).click();

    }


    
    
    public void clickSelectproject(){
        driver.findElement(clickSelectproject).click();
    }
    
    
    
    
    
    
    
    public void selectToAssign(){
        Select dropdown = new Select(driver.findElement(selectAssignTo));
        dropdown.selectByVisibleText("barbelaez");
    }
    
    
    
    
    
    // se inserta el resumen de la incidencia
    public void insertSummary(int numIncidence) {
        
        driver.findElement(insertSummary).sendKeys("Resumen incidencia num " + numIncidence);   
    }
    
    
    
    
    
    // Se inserta la descripcion de la incidencia
    public void insertDescription(int numIncidence){
        
        driver.findElement(insertDescription).sendKeys("Descripcion de la"
                + " incidencia num " + numIncidence);
    }
    
    
    
    
    
    
    
    public void insertStepsToFollow(int numIncidence){
        driver.findElement(insertStepsToFollow).sendKeys("Pasos a seguir de incidencia"
                + " numero " + numIncidence);
    }
    
    
    
    
    public void selectCheck(){
        driver.findElement(selectCheck).click();
    }
    
    
    
    public void insertAdditionalInformation (int numIncidence){
        driver.findElement(insertAdditionalInformation).sendKeys("Informacion adicional de "
                + "incidencia numero" + numIncidence);
    }
    
    public void insertImage(){
        driver.findElement(insertImage).sendKeys(String.valueOf(ruta));
    }
    
    
    
    
        public void clickSendIncidence() {
        TInicio = System.currentTimeMillis();
        
        // Se da click en el botón "Crear" para que se guarde el nuevo proyecto
        driver.findElement(clicSendIncidence).click();
        TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo); //Mostramos e

    }
}
