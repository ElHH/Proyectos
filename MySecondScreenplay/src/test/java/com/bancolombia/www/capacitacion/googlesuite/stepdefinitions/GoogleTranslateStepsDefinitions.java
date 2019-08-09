package com.bancolombia.www.capacitacion.googlesuite.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import com.bancolombia.www.capacitacion.googlesuite.questions.TheWord;
import com.bancolombia.www.capacitacion.googlesuite.tasks.Translate;
import com.bancolombia.www.capacitacion.googlesuite.tasks.goTo;
import com.bancolombia.www.capacitacion.googlesuite.tasks.openTheBrowser;
import com.bancolombia.www.capacitacion.googlesuite.userinterfaces.GoogleAppsComponent;
import com.bancolombia.www.capacitacion.googlesuite.userinterfaces.GoogleHomePage;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepsDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	
	private Actor hernan = Actor.named("hernan");
	
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setUp() {
		hernan.can(BrowseTheWeb.with(hisBrowser));
	}

@Given("^that Hernan wants to translate a word$")
public void thatHernanWantsToTranslateAWord() throws Exception {
	
    hernan.wasAbleTo(openTheBrowser.on(googleHomePage));
    hernan.wasAbleTo(goTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
}


@When("^he translate the word cheese from english to spanish$")
public void HeTranslateTheWordCheeseFromEnglishToSpanish() throws Exception {
   //Condiciones: traducir una palabra
	hernan.wasAbleTo(Translate.the());
}

@Then("^he should see the word queso in the screen$")
public void HeShouldSeeTheWordQuesoInTheScreen() throws Exception {
   //Consecuencias: aparece palabra traducida
	hernan.should(seeThat(TheWord.translate(), equalTo("queso")));
}



}
