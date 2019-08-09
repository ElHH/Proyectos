package co.com.google.capacitaciones.questions;

import co.com.google.capacitaciones.userinterfaces.GoogleComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return  Text.of(GoogleComponents.RESULT_SEARCH).viewedBy(actor).asString();
	}

	public static TheResult OfTheSearch() {
		// TODO Auto-generated method stub
		return new TheResult();
	
	}

}
