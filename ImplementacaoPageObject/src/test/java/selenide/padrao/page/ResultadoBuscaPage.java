package selenide.padrao.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ResultadoBuscaPage {

    private ElementsCollection resultados = $$(".ui-search-item__title");

    public ElementsCollection getResultados() {
        return resultados;
    }

    public void setResultados(ElementsCollection resultados) {
        this.resultados = resultados;
    }

    public void escolhaItem(String item) {
        resultados.filter(Condition.text(item)).get(0).click();
    }
}
