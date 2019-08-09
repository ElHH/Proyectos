package co.com.google.capacitaciones.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;

import co.com.google.capacitaciones.userinterfaces.GoogleComponents;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search implements Task{

	
	private Target Option;

	public Search(Target Option) {
		this.Option=Option;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue("Quesito").into(GoogleComponents.INPUT_SEARCH),
				Click.on(GoogleComponents.BUTTON_SEARCH));		
		
	}

	public static Search something(Target Option) {
		// TODO Auto-generated method stub
		return instrumented(Search.class, Option);
	}

}
