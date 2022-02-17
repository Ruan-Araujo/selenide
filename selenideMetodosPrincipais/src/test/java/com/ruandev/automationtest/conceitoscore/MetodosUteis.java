package com.ruandev.automationtest.conceitoscore;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class MetodosUteis {

    @BeforeEach
    void configuracao() {
        Configuration.browser = "firefox";
    }

    @Test
    public void upload() throws InterruptedException {
        open("https://the-internet.herokuapp.com/");

        $(By.linkText("File Upload")).click();
        File file = $("#file-upload").uploadFile(new File("src/upload.txt"));
        $("#file-submit").click();
        Thread.sleep(1000);
        $("#uploaded-files").should(appear);

    }

    @Test
    public void download() throws FileNotFoundException {
        open("https://the-internet.herokuapp.com/");

        $(By.linkText("File Download")).click();

        File file = $(By.linkText("some-file.txt")).download();
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.getPath());
    }
}
