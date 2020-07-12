package co.prueba.web.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;


public class IngresarCompra implements Question<String> {
	private String mensaje;

	public IngresarCompra(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	@Override
	public String answeredBy(Actor actor) {

		return this.mensaje;
	}

	public static IngresarCompra mensaje(String mensaje){
		return new IngresarCompra(mensaje);
	}
}
