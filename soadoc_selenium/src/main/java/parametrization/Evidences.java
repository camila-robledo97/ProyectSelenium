package parametrization;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Evidences {

	public static int id = 1;

	public static void takeScreenShotTest(WebDriver driver, String testCaseNumber) throws InterruptedException {

		// Directorio donde quedaran las imagenes de evidencias guardadas
		String path = "evidences/testCase" + testCaseNumber;
		File directory = new File(path);

		int consecutive;
		consecutive = id++;
		String fileName = Integer.toString(consecutive);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		try {
			if (directory.isDirectory()) {
				// Toma la captura de imagen
				File image = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// Mueve el archivo a la carpeta especificada con el respectivo nombre
				FileUtils.copyFile(image, new File(directory.getAbsolutePath() + "\\" + "Step_" + fileName + ".png"));
			} else {
				// Se lanza la excepcion cuando no encuentre el directorio
				throw new IOException("ERROR : La ruta especificada no es un directorio!");
			}
		} catch (IOException e) {
			// Impresion de Excepciones
			e.printStackTrace();
		}
	}

	public static void DeleteFilesDirectory(String testCaseNumber) {

		// Directorio donde quedan las imagenes guardadas
		String path = "evidences/testCase" + testCaseNumber;

		File directory = new File(path);
		File f;

		// Se recorre el directorio de evidencias para eliminar cada una de las imagenes
		// que contiene
		try {
			if (directory.isDirectory()) {
				String[] files = directory.list();
				if (files.length > 0) {

					for (String file : files) {
						f = new File(path + File.separator + file);

						// Attempt to delete it
						f.delete();
						System.out.println("El archivo " + path + file + " fue eliminado");

					}
				}

				else
					System.out.println("El directorio " + path + " está vacio");
			} else {
				// Se lanza la excepcion cuando no encuentre el directorio
				throw new IOException("ERROR : La ruta especificada no es un directorio!");
			}
		} catch (IOException e) {
			// Impresion de Excepciones
			e.printStackTrace();
		}

	}

}
