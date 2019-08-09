package co.com.google.capacitaciones.stepdefinitions;

import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import co.com.google.capacitaciones.questions.TheResult;
import co.com.google.capacitaciones.task.Search;
import co.com.google.capacitaciones.task.openTheBrowser;
import co.com.google.capacitaciones.userinterfaces.GoogleComponents;
import co.com.google.capacitaciones.userinterfaces.GoogleHomePage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BuscarGoogleStepsDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	private Actor hernan = Actor.named("Hernan");
	
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setUp() {
		hernan.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that hernan wants to search a word in google$")
	public void thatHernanWantsToSearchAWordInGoogle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 hernan.wasAbleTo(openTheBrowser.on(googleHomePage));
		 
	  
	}


	@When("^he search the word cheese$")
	public void heSearchTheWordCheese() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		hernan.wasAbleTo(Search.something(GoogleComponents.INPUT_SEARCH));
	    
	}

	@Then("^he should see the result in the screen$")
	public void heShouldSeeTheResultInTheScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		hernan.should(seeThat(TheResult.OfTheSearch(), equalTo("Quesito - Wikipedia, la enciclopedia libre")));
	    
	}

}
