package floristeria.steps;

import floristeria.PageObject.EliminarCarritoPage;
import floristeria.utils.Metodos;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class EliminarCarritoStep {

    @Page
    EliminarCarritoPage eliminarCarritoPage;

    @Page
    Metodos metodos;

    @Step("eliminar un producto del carrito")
    public void eliminarProductoCarrito(){
        metodos.realizarHover(eliminarCarritoPage.btnEliminar);
        eliminarCarritoPage.btnEliminar.click();
    }
}
