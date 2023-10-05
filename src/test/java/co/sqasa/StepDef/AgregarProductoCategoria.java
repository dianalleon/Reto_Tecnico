package co.sqasa.StepDef;

import floristeria.steps.AgregarCarritoStep;
import floristeria.steps.EliminarCarritoStep;
import floristeria.steps.InicioStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class AgregarProductoCategoria {

    @Steps
    InicioStep inicioStep;

    @Steps
    AgregarCarritoStep agregarCarritoStep;

    @Steps
    EliminarCarritoStep eliminarCarritoStep;

    @Dado("que el usuario abre la aplicacion se dirije a las categorias selecciona cumpleaños")
    public void queElUsuarioAbreLaAplicacionSeDirijeALasCategoriasSeleccionaCumpleaños() {
        inicioStep.abrirNavegador();
        inicioStep.clickCategoriaCumpleanos();
    }
    @Cuando("el usuario da click en añadir al carrito")
    public void elUsuarioDaClickEnAñadirAlCarrito() {
        agregarCarritoStep.agregarProductoCategoria();
    }

    @Entonces("da click en eliminar")
    public void daClickEnEliminar() {
        eliminarCarritoStep.eliminarProductoCarrito();
    }
}
