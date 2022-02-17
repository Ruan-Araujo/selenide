package com.ruandev.automationtest.conceitoscore;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.*;

public class MetodosDeStatus {

    @Test
    public void cadastro() {
        open("https://sqengineer.com");

        $("#menu-item-33").hover()
                .$("#menu-item-111 > a").click();

        $(byAttribute("value", "Submit")).should(exist);

        $("#firstName").setValue("ruanzinho").pressTab();
        $("#lastName").setValue("da Nike");

        $$(By.name("gender")).findBy(value("other")).click();

        $(By.name("country")).click();
        $(By.name("status")).click();

        $(".mail-address").setValue("ruanzinhodanike@email.com");
        $("#selectBox").selectOptionByValue("Sydney");
        status();

        $(byAttribute("value", "Submit")).click();
    }


    public void status() {

        System.out.println("Get value: " + $("#firstName").getValue());
        System.out.println("Get atributo: " + $("#firstName").attr("name"));
        System.out.println("Get text: " + $(byAttribute("value", "Submit"))
                .getText());
        System.out.println("Get value: " + $("#firstName").innerText());
        System.out.println("Get value: " + $("#firstName").innerText());

        System.out.println("Select Option " + $("#selectBox").getSelectedOption());
        System.out.println("Select Option " + $("#selectBox").getSelectedText());
        System.out.println("Select Option " + $("#selectBox").getSelectedValue());
    }
}
