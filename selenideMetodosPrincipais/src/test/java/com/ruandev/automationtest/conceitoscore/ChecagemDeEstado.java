package com.ruandev.automationtest.conceitoscore;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.*;

public class ChecagemDeEstado {

    @BeforeEach
    public void configuracoes() {
        Configuration.timeout = 7000;
        //Configuration.holdBrowserOpen = true;
    }

    @Test
    public void checagemDeEstado() {
        open("https://the-internet.herokuapp.com/");
        $(By.linkText("Dynamic Loading")).click();
        $(By.linkText("Example 1: Element on page that is hidden")).click();
        $("#start > button").should(exist);
        $("#start > button").shouldHave(exactText("Start")).click();
        $("#finish > h4").should(exist).shouldBe(visible);
    }
}
