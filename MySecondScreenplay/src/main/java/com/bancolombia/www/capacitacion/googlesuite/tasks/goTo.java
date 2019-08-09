package com.bancolombia.www.capacitacion.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.www.capacitacion.googlesuite.userinterfaces.GoogleAppsComponent;

public class goTo implements Task{
	
	private Target googleApp;
	
	public goTo(Target googleApp ) {
		this.googleApp = googleApp;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS));
//		
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		actor.attemptsTo(Click.on(googleApp));
//		// TODO Auto-generated method stub
		
	}

	public static goTo theApp(Target googleApp) {
		// TODO Auto-generated method stub
		return instrumented(goTo.class, googleApp );
	}

}
