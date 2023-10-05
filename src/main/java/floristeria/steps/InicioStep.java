package floristeria.steps;
import floristeria.PageObject.InicioPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioStep {

    @Page
    InicioPage inicioPage;

    @Step("Abre el navegador")
    public void abrirNavegador(){
        inicioPage.openUrl("https://www.floristeriamundoflor.com/");
    }

    @Step("Seleccionar Categoria Amor")
    public void clickCategoriaAmor(){
        inicioPage.btnCategoriaAmor.click();
    }

    @Step("Seleccionar Categoria Cumpleaños")
    public void clickCategoriaCumpleanos(){
        inicioPage.txtCategoriaCumple.click();
    }
}
