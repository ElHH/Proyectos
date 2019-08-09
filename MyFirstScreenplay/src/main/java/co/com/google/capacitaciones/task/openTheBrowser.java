package co.com.google.capacitaciones.task;

import co.com.google.capacitaciones.userinterfaces.GoogleHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class openTheBrowser implements Task{

	private PageObject page;

	public openTheBrowser(PageObject page) {
		this.page=page;
	}
	
	@Override
	
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
	}

	public static openTheBrowser on(PageObject page) {
	
		return instrumented(openTheBrowser.class, page);
	}

}
