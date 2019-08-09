package com.aeromexico.world.capacitacion.questions;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.aeromexico.world.capacitacion.userinterfaces.AeromexicoBooks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.findby.By;

public class Book implements Question<String>{

	
	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		WebElement element;
		
//		try {
//			actor.wait();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	//element =  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@id = 'EtNavFlights']//a[contains(text(), '')]"))));
//		element = wait.until(ExpectedConditions.textToBe		
		return Text.of(AeromexicoBooks.ROUTE).viewedBy(actor).asString();
		
	}
	

	public static Book theFlight() {
		// TODO Auto-generated method stub
		return new Book();
				
	}

	

	

}
