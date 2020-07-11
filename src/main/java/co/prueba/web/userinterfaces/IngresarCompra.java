package co.prueba.web.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarCompra {
    public static final Target SELECCIONAR_CATEGORIA = Target
            .the("Selecciona la categoria Laptops")
            .locatedBy("//*[text() ='Laptops']");

    public static final Target SELECCIONAR_PRODUCTO = Target
            .the("Selecciona el producto a comprar")
            .locatedBy("//*[text() ='2017 Dell 15.6 Inch']");

    public static final Target SELECCIONA_BOTON_AGREGAR_CARRITO = Target
            .the("Selecciona el botón de compra")
            .locatedBy("//*[text() ='Add to cart']");
}
