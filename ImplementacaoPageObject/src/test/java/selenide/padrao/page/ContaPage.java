package selenide.padrao.page;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ContaPage {

    private SelenideElement btnSouNovo = $("#registration-link > span");

    public SelenideElement getBtnSouNovo() {
        return btnSouNovo;
    }

    public void setBtnSouNovo(SelenideElement btnSouNovo) {
        this.btnSouNovo = btnSouNovo;
    }

    public void continuarCompra() {
        btnSouNovo.click();
    }
}
