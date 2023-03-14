package com.Romka;

import org.openqa.selenium.By;
//import sun.java2d.pipe.hw.ExtendedBufferCapabilities;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void cssXpathExamples() {
        //  <input type="email" class="inputtext login_from_input_box" name=" id="email" data-testid="email">
        $("[data-testid=email]").setValue("a@a.com");
        $(by("data-testid", "email")).setValue("a@a.com");

        //  <input type="email" class="inputtext login_from_input_box" name=" id="email">
        $("#email").setValue("a@a.com");
        $("input#email").setValue("a@a.com");
        $(byId("email")).setValue("a@a.com");
        $(By.id("email")).setValue("a@a.com");
        $x("//*[@id='email']").setValue("a@a.com");
        $(By.xpath("//*[@id='email']")).setValue("a@a.com");

        //  <input type="email" class="inputtext login_from_input_box" name=" id="email">
        $("name=email").setValue("a@a.com");
        $(byName("email")).setValue("a@a.com");

        //  <input type="email" class="inputtext login_from_input_box">
        $("class=login_from_input_box").setValue("a@a.com");
        $(".login_from_input_box").setValue("a@a.com");
        $(".inputtext.login_from_input_box").setValue("a@a.com");
        $(".input.login_from_input_box").setValue("a@a.com");
        $x("//input[@class='inputtext'][@class='login_from_input_box']").setValue("a@a.com");

        // <div class="inputtext >
        //      <input type="email" class="login_from_input_box">
        //  </div>
        $(".inputtext .login_from_input_box").setValue("a@a.com");
        $(".inputtext").$(".login_from_input_box").setValue("a@a.com");

        // <div>Hello qa.guru</div>
        $x("//div[text()='Hello qa.guru']");
        $x("//div[contains(text(), 'llo qa.gur')]");
        $(byText("Hello qa.guru"));
        $(withText("llo qa.gur"));

    }
}
