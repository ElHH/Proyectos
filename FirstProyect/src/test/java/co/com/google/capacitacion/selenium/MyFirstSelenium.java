package co.com.google.capacitacion.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver ", "C://chromedriver.exe");
	
		WebDriver HH = new ChromeDriver();
		HH.manage().window().maximize();
		HH.get("http://newtours.demoaut.com/");
		HH.findElement(By.name("userName")).sendKeys("Hernan7589");
		HH.findElement(By.name("password")).sendKeys("Prueba999*");
		HH.findElement(By.name("login")).sendKeys(Keys.ENTER);
		
		//Cambiar radio button
		WebElement element;
		
		
		element = HH.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
		element.click();
	
				
		Select pasajeros = new Select(HH.findElement(By.name("passCount")));
		pasajeros.selectByVisibleText("3");
		
		Select paisOrigen = new Select(HH.findElement(By.name("fromPort")));
		paisOrigen.selectByVisibleText("London");
		
		Select mesInicio = new Select(HH.findElement(By.name("fromMonth")));
		mesInicio.selectByVisibleText("April");
		
		Select diaInicio = new Select(HH.findElement(By.name("fromDay")));
		diaInicio.selectByVisibleText("20");
		
		Select paisDest = new Select(HH.findElement(By.name("toPort")));
		paisDest.selectByVisibleText("Portland");
		
		Select mesFinal = new Select(HH.findElement(By.name("toMonth")));
		mesFinal.selectByVisibleText("December");
		
		Select diaFin = new Select(HH.findElement(By.name("toDay")));
		diaFin.selectByVisibleText("10");
		
		element = HH.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"));
		element.click();
		
		Select aerolinea = new Select(HH.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select\r\n")));
		aerolinea.selectByVisibleText("Pangea Airlines");
		
		HH.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input\r\n")).sendKeys(Keys.ENTER);
		
		element = HH.findElement(By.name("outFlight"));
		element.click();
		
		element = HH.findElement(By.name("inFlight"));
		element.click();
		
		
		
		
	}

}
