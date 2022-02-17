package com.ruandev.automationtest.conceitoscore;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.*;

public class MetodosCondicionais {

    @BeforeEach
    public void configuracao() {
        browser = "firefox";
        timeout = 7000;
    }

    @Test
    public void testeCondicao() throws InterruptedException {
        open("https://the-internet.herokuapp.com/");

        $(By.linkText("Dynamic Loading")).should(exist).click();

        $(By.linkText("Example 1: Element on page that is hidden")).click();

        $("#start > button").click();

        //$("#loading").find(By.tagName("img"));

        Thread.sleep(5000);

        String element = $("#finish").find(By.tagName("h4")).text();

        System.out.println(element);
    }

}
