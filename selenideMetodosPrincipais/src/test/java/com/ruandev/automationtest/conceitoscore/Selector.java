package com.ruandev.automationtest.conceitoscore;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.collections.ListSize.*;

public class Selector {

    @BeforeEach
    public void configuracoes() {
        Configuration.timeout = 6000;
    }

    @Test
    public void seletoresTeste() {
        open("https://www.mercadolivre.com.br/");
        $("#cb1-edit").setValue("celular").pressEnter();

        $$(".ui-search-carousel__item__image-container").shouldHave(size(16));

    }

    @Test
    public void elementoFilhoTeste() {

        open("https://sqengineer.com");
        $("#menu-item-33").hover();
        $(By.linkText("Practice Tables")).click();
        //$("#table1").find(withText(" Complete")).click();
        $("#table1").$(By.linkText("Test Complete")).click();
    }
}
