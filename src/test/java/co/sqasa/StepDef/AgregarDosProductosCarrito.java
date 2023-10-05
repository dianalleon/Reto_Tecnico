package co.sqasa.StepDef;

import floristeria.steps.AgregarCarritoStep;
import floristeria.steps.InicioStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class AgregarDosProductosCarrito {

    @Steps
    InicioStep inicioStep;

    @Steps
    AgregarCarritoStep agregarCarritoStep;

    @Dado("que el usuario abre la aplicacion y selecciona en el menu la categoria amor")
    public void queElUsuarioAbreLaAplicacionYSeleccionaEnElMenuLaCategoriaAmor() {
        inicioStep.abrirNavegador();
        inicioStep.clickCategoriaAmor();
    }

    @Cuando("el usuario da click en añadir al carrito y selecciona seguir comprando")
    public void elUsuarioDaClickEnAñadirAlCarritoYSeleccionaSeguirComprando() {
        agregarCarritoStep.agregarProductoCategoria();
        agregarCarritoStep.seguirComprando();
    }
    @Entonces("el usuario añade otro producto al carrito")
    public void elUsuarioAñadeOtroProductoAlCarrito() {
        agregarCarritoStep.agregarProductoCategoria();
    }


}
