package com.aeromexico.world.capacitacion.stepsdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aeromexico.world.capacitacion.questions.Book;
import com.aeromexico.world.capacitacion.task.Fill;
import com.aeromexico.world.capacitacion.task.openTheBrowser;
import com.aeromexico.world.capacitacion.userinterfaces.AeromexicoHome;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.findby.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AeromexicoStepDefinitions {

	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	private Actor hernan = Actor.named("Hernan");
	
	
	private AeromexicoHome aeromexicoHomePage;
	
	@Before
	public void setUp() {
		hernan.can(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().window().maximize();
	}
	
	@Given("^he wants to book a ticket$")
	public void heWantsToBookATicket() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 hernan.wasAbleTo(openTheBrowser.on(aeromexicoHomePage));
	}

	@When("^he selects from \"([^\"]*)\" to \"([^\"]*)\"$")
	public void heSelectsFromTo(String arg1, String arg2) throws Exception {
		
		hernan.wasAbleTo(Fill.flightdata(arg1, arg2));
		
	}
	

	@Then("^he shoulds see the ticket booked$")
	public void heShouldsSeeTheTicketBooked() throws Exception {
	   
		WebDriverWait wait=new WebDriverWait(hisBrowser, 60);//tiempo de espera explicito 
		Boolean radio = wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//li[@id='EtNavFlights']/a[@class='EtRutas']"), "BOG - MAD")); //Condiciones esperadas		
		hernan.should(seeThat(Book.theFlight(), equalTo("BOG - MAD"))); // Se verifica el resultado
		
	}

}
