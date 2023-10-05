package floristeria.PageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AgregarCarritoPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//div[@class='col-xs-12 col-lg-4 col-md-4 col-sm-6 grid post-4100 product type-product status-publish has-post-thumbnail product_cat-amor product_cat-aniversario product_cat-cumpleanos first instock shipping-taxable purchasable product-type-simple']//span[@class='title-cart'][normalize-space()='Añadir al carrito']")
    public WebElementFacade btnAgregarCarrito;

    @FindBy(how = How.XPATH, using = "//a[@class='button wc-forward']")
    public WebElementFacade btnSeguirComprando;




}
