package co.prueba.web.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/comprar.feature"
        , glue = "co.prueba.web.stepdefinitions"
        , snippets = SnippetType.CAMELCASE)
public class Comprar {
}
