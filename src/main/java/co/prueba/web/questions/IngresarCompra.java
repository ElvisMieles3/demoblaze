package co.prueba.web.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class IngresarCompra implements Question<String> {
	

	@Override
	public String answeredBy(Actor actor) {
		actor.attemptsTo(WaitUntil.the((co.prueba.web.userinterfaces.IngresarCompra.MENSAJE_RESPUESTA), WebElementStateMatchers.isVisible()));
        return Text.of(co.prueba.web.userinterfaces.IngresarCompra.MENSAJE_RESPUESTA).viewedBy(actor).asString();
		
	}

	public static IngresarCompra mensaje(){

		return new IngresarCompra();
	}



}
