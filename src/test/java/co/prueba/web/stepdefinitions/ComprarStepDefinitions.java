package co.prueba.web.stepdefinitions;


import co.prueba.web.models.DatosComprar;
import co.prueba.web.tasks.AbrirNavegador;
import co.prueba.web.tasks.IngresarCompra;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class ComprarStepDefinitions {

    @Managed
    private WebDriver miNavegador;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(miNavegador)));

        theActorCalled("Elvis");
    }

    @Given("^que Elvis esta en el portal$")
    public void queElvisEstaEnElPortal() {

        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirNavegador.navegador());
    }

    @When("^el seleciona el producto a comprar$")
    public void elSelecionaElProductoAComprar(List<DatosComprar> datosCompra) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCompra.conDatos(datosCompra.get(0)));
    }

    @Then("^el usuario debe ver el nombre (.*)$")
    public void elUsuarioDebeVerElNombreProductAdded(String descripcionPoPup) throws Exception {
        Thread.sleep(2000);
        Alert alert = miNavegador.switchTo().alert();
        theActorInTheSpotlight().should(seeThat(co.prueba.web.questions.IngresarCompra.mensaje(alert.getText()),
                org.hamcrest.Matchers.is(descripcionPoPup)));



    }
}
