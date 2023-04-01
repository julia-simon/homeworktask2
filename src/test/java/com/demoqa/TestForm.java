package com.demoqa;

import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestForm extends TestBase {

    @Test
    void succesfullFillFormTest() {
        open("/automation-practice-form");

        $("#firstName").setValue("Chandler");
        $("#lastName").setValue("Bing");
        $("#userEmail").setValue("bing@gmail.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("8880000097");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").$(byText("March")).click();
        $(".react-datepicker__year-select").$(byText("1977")).click();
        $(".react-datepicker__month").$(byText("8")).click();
        $("#subjectsInput").setValue("History").pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("1.jpg");
        $("#currentAddress").setValue("My address");
        $("#state").click();
        $(".css-26l3qy-menu").$(byText("NCR")).click();
        $("#city").click();
        $(".css-26l3qy-menu").$(byText("Noida")).click();
        $("#submit").click();
        $(".table-responsive").shouldHave(text("Chandler"),
                text("Bing"),
                text("bing@gmail.com"),
                text("Male"),
                text("8880000097"),
                text("08 March,1977"),
                text("History"),
                text("Music"),
                text("1.jpg"),
                text("My address"),
                text("NCR"),
                text("Noida"));
    }
}
