package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void Chrome(WebDriver driver) throws Exception {

		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://192.168.1.87:8080/toolbox-front/#/login");

		test.TestMain.driver = driver;


	}

	public static void CerrarNavegador(WebDriver driver) throws Exception {

		driver.quit();

	}

}
