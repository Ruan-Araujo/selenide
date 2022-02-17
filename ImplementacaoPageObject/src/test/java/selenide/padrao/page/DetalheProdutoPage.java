package selenide.padrao.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class DetalheProdutoPage {

    private SelenideElement btnComprar =
            $(By.cssSelector("button.andes-button--quiet:nth-child(2)"));

    public SelenideElement getBtnAddCarrinho() {
        return btnComprar;
    }

    public void setBtnAddCarrinho(SelenideElement btnAddCarrinho) {
        this.btnComprar = btnAddCarrinho;
    }

    public void comprar() {
        btnComprar.click();
    }
}
