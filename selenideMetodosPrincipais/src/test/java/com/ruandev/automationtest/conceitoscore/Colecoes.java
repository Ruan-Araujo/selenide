package com.ruandev.automationtest.conceitoscore;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.*;

public class Colecoes {

    @Before
    public void configuracao() {
        Configuration.timeout = 7000;
    }

    @Test
    public void colecoes() {
        open("https://www.mercadolivre.com");

        $("#newCookieDisclaimerButton").click();

        $("#cb1-edit").setValue("celular").pressEnter();

        ElementsCollection colecao = $$(".ui-search-item__title");
        System.out.println(colecao.size());
        colecao.shouldHave(CollectionCondition.size(56));
        Assert.assertTrue(colecao.size() > 0);
    }

}
