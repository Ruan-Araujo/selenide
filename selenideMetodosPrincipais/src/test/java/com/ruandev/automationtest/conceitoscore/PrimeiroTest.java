package com.ruandev.automationtest.conceitoscore;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class PrimeiroTest {

    @Before
    public void antes() {
        Configuration.browser = "firefox";
        //Configuration.headless = true;
    }

    @Test
    public void teste() {
        open("https://www.facebook.com/");
        $("#email").setValue("ruan@email.com").pressTab();
        $(By.name("pass")).setValue("12345").pressEnter();
        $(".fb_logo ._8ilh .img").shouldNot(appear);
    }

}
