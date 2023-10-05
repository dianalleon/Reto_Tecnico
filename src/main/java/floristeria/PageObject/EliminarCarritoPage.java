package floristeria.PageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class EliminarCarritoPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[6]/a[1]/i[1]")
    public WebElementFacade btnEliminar;


}
