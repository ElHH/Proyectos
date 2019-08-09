package com.bancolombia.www.capacitacion.googlesuite.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.www.capacitacion.googlesuite.userinterfaces.GoogleHomePage;

public class openTheBrowser implements Task{
	
	private PageObject page;

	public openTheBrowser(PageObject page) {
		this.page=page;
	}
	
	@Override
	@Step("{0} opens the browser on Google Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
	}

	public static openTheBrowser on(PageObject page) {
		// TODO Auto-generated method stub
		//return new openTheBrowser();
		return instrumented(openTheBrowser.class, page);
	}	
	
}
