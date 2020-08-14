/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigation.createproject;


import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author USER
 */
public class NewProject {
    WebDriver driver;
    
    
    
    public NewProject(WebDriver driver) {
        this.driver = driver;
    }
    
    
    //Click  on clickManagement button
    public void clickManagement(){
        driver.get("http://181.49.173.42:4040/mantisbt-2.20.0.0/mantisbt-2.20.0/manage_"
                + "overview_page.php");
        
    }
    
    //Click on management projects
    public void clickManagementProjects(){
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/ul/li[3]/a")).click();
        
    }
    
    
    //Click  on create new Project button
    public void clickCreateNewProject(){
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div"
                + "/div/div[2]/div[2]/div/div[1]/form/fieldset/button")).click();
        
        
    }
    
    
    public void setNameProject(int numProject){
 
        driver.findElement(By.xpath("//*[@id=\"project-name\"]")).sendKeys("Proyecto " + numProject);

    }

    public void setDescriptionProject(int numProject) {

        driver.findElement(By.xpath("//*[@id=\"project-description\"]")).sendKeys("Esta es la descripcion del"
                + " proyecto " + numProject);
    }

    public void clickAddProject() {

        driver.findElement(By.xpath("//*[@id=\"manage-project-create-form\"]/div/div[3]/input")).click();

    }

    public void randomSelectNewProject() {
        /* //String[] list = new String[driver.findElements(By.xpath("//*[@id=\"project-status\"]")).toArray().length];
        List<String> list = new ArrayList<String>();
        List<WebElement> listWeb = new ArrayList<WebElement>();
        listWeb = driver.findElements(By.xpath("//*[@id=\\\"project-status\\\"]"));
        for (int i = 0; i <= listWeb.size(); i++){  
         */
        
        //Trae todos
        //String valor = driver.findElement(By.xpath("//*[@id=\"project-status\"]")).getText();

        //trae uno por uno quemando el xpath de cada valor
        //String valor1 = driver.findElement(By.xpath("//*[@id=\"project-status\"]/option[1]")).getText();
        //String valor2 = driver.findElement(By.xpath("//*[@id=\"project-status\"]/option[2]")).getText();
        //System.out.println(valor1 + " " + valor2);
        
        //trae uno por uno quemando el xpath de cada valor por codigo
        String[] selectContent = new String[5];
        //Se quema el xpath del select
        Select toAssign = new Select(driver.findElement(By.xpath("//*[@id=\"project-status\"]")));
        for (int i = 1; i <= selectContent.length - 1; i++) {
            //String[] arreglo = new String[driver.findElements(By.xpath("//*[@id=\"project-status\"]")).size()];
            selectContent[i] = driver.findElement(By.xpath("//*[@id=\"project-status\"]/option[" + i + "]")).getText();
            //System.out.println(arreglo[i]);
        }
        int idx = 0;
        while ((idx == selectContent.length ) || (idx <= 0)) {
            idx = (int) (Math.random() * selectContent.length) + 1;
            //System.out.println(idx);
        }
        //Selecciona la opcion que salio del random
        toAssign.selectByVisibleText(selectContent[idx]);
        
        
        
        /* si funciona 
        boolean confirmNum = false;
        Select assing = new Select(driver.findElement(By.name("status")));
        float numRandom = (float) Math.random() * 71 + 9;
        //System.out.println(numRandom);
        while (confirmNum == false) {
            numRandom = (float) Math.random() * 71 + 9;
            if ((numRandom == 10) || (numRandom == 30) || (numRandom == 50) || (numRandom == 70)) {
                confirmNum = true;
            }
        }
        
        assing.selectByValue(String.valueOf(Math.round(numRandom)));
        */
        //String[] arreglo = new String[5];
        //Select extrac = new Select("status").getFirstSelectedOption().getText();
        
    }
    
    

    
}
