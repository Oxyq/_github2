package com.Romka;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBoxTests {

    @BeforeAll
    static void setUP() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        String name ="Roma";

        open("/text-box");
       // $("[id=userName]").setValue();
        $("#userName").setValue(name);
        $("#userEmail").setValue("Roma@roma.com");
        $("#currentAddress").setValue("Some address 1");
        $("#permanentAddress").setValue("Another address 1");
        $("#submit").click();

        $("#output #name").shouldHave(text(name));
        $("#output #email").shouldHave(text("Roma@roma.com"));
        $("#output #currentAddress").shouldHave(text("Some address 1"));
        $("#output #permanentAddress").shouldHave(text("Another address 1"));

    }
}