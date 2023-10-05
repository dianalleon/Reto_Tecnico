package floristeria.steps;

import floristeria.PageObject.AgregarCarritoPage;
import floristeria.utils.Metodos;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class AgregarCarritoStep {

    @Page
    AgregarCarritoPage agregarCarritoPage;

    @Page
    Metodos metodos;

    @Step("añadir un producto de la categoria Amor")
    public void agregarProductoCategoria(){
        metodos.realizarHover(agregarCarritoPage.btnAgregarCarrito);
        agregarCarritoPage.btnAgregarCarrito.click();
    }

    @Step("Seguir Comprando")
    public void seguirComprando(){
        agregarCarritoPage.btnSeguirComprando.click();
    }


}
