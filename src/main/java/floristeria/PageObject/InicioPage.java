package floristeria.PageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class InicioPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//ul[@id='primary-menu']//a[normalize-space()='Amor']")
    public WebElementFacade btnCategoriaAmor;

    @FindBy(how = How.XPATH, using = "//li[@id='menu-item-2799']//a[normalize-space()='Cumpleaños']")
    public WebElementFacade txtCategoriaCumple;

}
