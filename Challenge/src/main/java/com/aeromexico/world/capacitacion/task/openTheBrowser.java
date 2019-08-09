package com.aeromexico.world.capacitacion.task;

import com.aeromexico.world.capacitacion.userinterfaces.AeromexicoHome;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class openTheBrowser implements Task {

	private PageObject page;

	public openTheBrowser(PageObject page) {
		this.page=page;
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(page));
		
	}

	public static Performable on(PageObject page) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(openTheBrowser.class, page);
	}

}
