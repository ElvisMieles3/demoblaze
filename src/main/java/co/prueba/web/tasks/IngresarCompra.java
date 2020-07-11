package co.prueba.web.tasks;

import co.prueba.web.interation.ScrollDown;
import co.prueba.web.interation.WaitInteration;
import co.prueba.web.models.DatosComprar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarCompra implements Task {

    private DatosComprar datosComprar;

    public IngresarCompra(DatosComprar datosComprar) {

        this.datosComprar = datosComprar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(co.prueba.web.userinterfaces.IngresarCompra.SELECCIONAR_CATEGORIA));
        actor.attemptsTo(Click.on(co.prueba.web.userinterfaces.IngresarCompra.SELECCIONAR_PRODUCTO), ScrollDown.on(5), WaitInteration.waitFor(15));
        actor.attemptsTo(Click.on(co.prueba.web.userinterfaces.IngresarCompra.SELECCIONA_BOTON_AGREGAR_CARRITO));

    }

    public static IngresarCompra conDatos( DatosComprar datosComprar){
        return new IngresarCompra(datosComprar);
    }


}
