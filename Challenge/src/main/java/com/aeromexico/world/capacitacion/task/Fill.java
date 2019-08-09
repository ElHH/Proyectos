package com.aeromexico.world.capacitacion.task;

import org.openqa.selenium.Keys;

import com.aeromexico.world.capacitacion.userinterfaces.AeromexicoHome;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Fill implements Task{
	
	private String arg1;
	private String arg2;

	public Fill(String arg1,String arg2) {
		this.arg1=arg1;
		this.arg2=arg2;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(//Click.on(AeromexicoHome.COIN_USE),
				//Click.on(AeromexicoHome.SOURCE_CITY),
				Enter.theValue(arg1).into(AeromexicoHome.SOURCE_CITY).thenHit(Keys.ENTER),
				Enter.theValue(arg2).into(AeromexicoHome.TARGET_CITY).thenHit(Keys.ENTER),
				Click.on(AeromexicoHome.DEPARTURE_DATE));
		
		
//				Click.on(AeromexicoHome.BUTTON_NEXT_MONTH),
//				Click.on(AeromexicoHome.BUTTON_NEXT_MONTH),
//				Click.on(AeromexicoHome.BUTTON_NEXT_MONTH),
//				Click.on(AeromexicoHome.BUTTON_NEXT_MONTH),
		
		actor.attemptsTo(Click.on(AeromexicoHome.DEPARTURE_DAY),
				Click.on(AeromexicoHome.ARRIVE_DATE),
				Click.on(AeromexicoHome.ARRIVE_DAY),
				Click.on(AeromexicoHome.ADULT_BUTTON),
				Click.on(AeromexicoHome.ADULT_QUANTITY),
				Click.on(AeromexicoHome.CHILDREN_BUTTON),
				Click.on(AeromexicoHome.CHILDREN_QUANTITY),
				Click.on(AeromexicoHome.AGE_CHILDREN),
				Click.on(AeromexicoHome.AGE_CHILDREN_BUTTON),
				Click.on(AeromexicoHome.CONFIRMAR_BUTTON),
				Click.on(AeromexicoHome.SEARCH_FLIGHT_BUTTON));
		
		
	}

	public static Fill flightdata(String arg1, String arg2) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Fill.class, arg1, arg2);
	}

}
