package com.ruandev.automationtest.conceitoscore;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.*;

public class MetodosAcoes {

    @BeforeEach
    public void configuracao() {
        Configuration.timeout = 7000;
    }

    @Test
    public void cadastro() {
        open("https://sqengineer.com");

        $("#menu-item-33").hover()
                .$("#menu-item-111 > a").click();

        $(byAttribute("value", "Submit")).should(exist);

        $("#firstName").setValue("Godofredo").pressTab();
        $("#lastName").setValue("da Nike");

        $$(By.name("gender")).findBy(value("female")).click();

        $(By.name("country")).click();
        $(By.name("status")).click();

        $(".mail-address").setValue("godofredodanike@email.com");

        $(byAttribute("value", "Submit")).click();
    }
}
