package test;
import java.util.concurrent.TimeUnit;

import navigation.createCorrespondence.CorER;
import navigation.createIncidence.NewIncidence;
import navigation.createSuite.NewSuite;
import navigation.createproject.NewProject;
import navigation.login.SoadocLogin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import navigation.createproject.NewTestProject;
import navigation.login.MantisLogin;
import navigation.login.TestLinkLogin;
import navigation.stateTransition.StateTransition;
import parametrization.Evidences;

public class TestMain {

    public static WebDriver driver;
    public int id = 0;
    public int numeroDeRadicados = 2; //numero de radicados a ejecutar
    public String idusercontac = "1005755221";
    SoadocLogin objSoadocLogin;
    CorER objCorER;
    //NewProject objNewProject;


    @Before
    public void openBrowser() throws Exception {
//co0menttario
        id++;
        String testCaseNumber = Integer.toString(id);
        Evidences.id = 1;

        // Se eliminan primero las imagenes de evidencia de la ejecución pasada
        //parametrization.Evidences.DeleteFilesDirectory(testCaseNumber);

        // Se invoca la apertura del browser y se maximixa la ventana
        test.Browser.Chrome(driver);

    }

    @Test
    public void testCase1() throws Exception {
        boolean brake = false;
        int evidences = numeroDeRadicados;
        while (numeroDeRadicados <= numeroDeRadicados) {

            String testCaseNumber = Integer.toString(id);

            // Create Login Page
            objSoadocLogin = new SoadocLogin(driver);
            objSoadocLogin.loginSoadoc("pruebasoaint2", "Soaint2");

            objCorER = new navigation.createCorrespondence.CorER(driver);
            for (int i = 1; i <= numeroDeRadicados; i++) {

                objCorER.clicklistGD();

/*
                objNewProject.clickCreateNewProject();

                objNewProject.setNameProject(i);

                objNewProject.randomSelectNewProject();
                objNewProject.setDescriptionProject(i);

                objNewProject.clickAddProject();

 */

            }
/*
            objNewIncidence = new navigation.createIncidence.NewIncidence(driver);
            for (int i = 1; i <= numProjects; i++) {
                for (int j = 1; j <= numIncidences; j++) {
                    objNewIncidence.clickReportIncidence();

                    //Se selecciona el proyecto a cargar las incidencias
                    objNewIncidence.randomSelectProject(i);
                    

                    objNewIncidence.clickSelectproject();
                    
                    //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

                    objNewIncidence.randomSelectCategory();
                    
                    objNewIncidence.randomSelectReproducibility();
        
                    objNewIncidence.randomSelectSeverity();

                    objNewIncidence.randomSelectPriority();

                    objNewIncidence.randomSelectAssignTo();

                    objNewIncidence.insertSummary(j);

                    objNewIncidence.insertDescription(j);

                    objNewIncidence.insertAdditionalInformation(j);

                    objNewIncidence.insertStepsToFollow(j);
                    //objNewIncidence.insertImage();
                    //objNewIncidence.selectChack();
                    objNewIncidence.clickSendIncidence();
                    
                    
                    objNewStateTransition = new navigation.stateTransition.StateTransition(driver);

                    objNewStateTransition.clickSeeIncidences();
                    objNewStateTransition.clickfirstIncidence();
                    objNewStateTransition.clickChangeStateTo();
                    

                }

            }
        }

        
        
        
        
        // Create suite Page object
        objNewSuite = new navigation.createSuite.NewSuite(driver);
        objNewSuite.selectProject(idProject);

        objNewSuite.clickeditCase();
            System.out.print("Si pasaaaa1");

            objNewSuite.clickProject();
            System.out.print("Si pasaaaa2");
            objNewSuite.clickActionsProject();
            System.out.print("Si pasaaaa3"); 
            /*for (int i = countLoop; i <= numProjects; i++) {

                objNewTestProject.clickCrear();

                objNewTestProject.InsertNombrePP(i);

                objNewTestProject.InsertPrefijoPP(i);

                objNewTestProject.clickGuardar();

                idProject++;

            }*/
            // Se toma imagen de evidencia
            //parametrization.Evidences.takeScreenShotTest(driver, testCaseNumber);
        }
    
    
   /* 
    @Test
    public void testCase1() throws Exception {
        boolean brake = false;
        int evidences = numProjects; // Se debe poner un caso antes del final para tomar evidencias finales
        while (idProject <= numProjects) {

            String testCaseNumber = Integer.toString(id);

            // Create Login Page object
            objLoginTestLink = new navigation.login.TestLinkLogin(driver);

            objLoginTestLink.setUserName("Msherrera");

            objLoginTestLink.setPassword("Ibague2019");

            objLoginTestLink.clickLogin();
            
            
            // Create suite Page object
            objNewSuite = new navigation.createSuite.NewSuite(driver);
            objNewSuite.selectProject(idProject);
            
           
            objNewSuite.clickeditCase();
            System.out.print("Si pasaaaa1");
            
            objNewSuite.clickProject();
            System.out.print("Si pasaaaa2");
            objNewSuite.clickActionsProject();
            System.out.print("Si pasaaaa3"); 
            for (int i = countLoop; i <= numProjects; i++) {

                objNewTestProject.clickCrear();

                objNewTestProject.InsertNombrePP(i);

                objNewTestProject.InsertPrefijoPP(i);

                objNewTestProject.clickGuardar();

                idProject++;

            }
            // Se toma imagen de evidencia
            parametrization.Evidences.takeScreenShotTest(driver, testCaseNumber);
        }
    }*/

    /*
    
    @After
    public void closeBrowser() throws Exception {

        // Se cierra el navegador para finalizar la prueba
        test.Browser.CerrarNavegador(driver);

    }
    */


    }
}
