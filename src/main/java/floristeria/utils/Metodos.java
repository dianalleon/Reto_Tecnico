package floristeria.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Metodos extends PageObject{

    public void realizarHover(WebElementFacade webElementFacade) {
        withAction().moveToElement(webElementFacade).build().perform();
    }
}
