package selenide.padrao.page;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private SelenideElement inputBusca = $("#cb1-edit"),
                            btnDeBusca = $(".nav-search-btn"),
                            btnCookies = $("#newCookieDisclaimerButton");

    public SelenideElement getInputBusca() {
        return inputBusca;
    }

    public void setInputBusca(SelenideElement inputBusca) {
        this.inputBusca = inputBusca;
    }

    public SelenideElement getBtnDeBusca() {
        return btnDeBusca;
    }

    public void setBtnDeBusca(SelenideElement btnDeBusca) {
        this.btnDeBusca = btnDeBusca;
    }

    public void buscarProduto(String produto) {
           btnCookies.click();
           inputBusca.setValue(produto);
           btnDeBusca.click();
    }

    public void abrir() {
        open("https://www.mercadolivre.com.br/");
    }
}
