package com.demoqa;

import org.junit.jupiter.api.Test;

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
        $("#userNumber").setValue("888000009");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").$(byText("March")).click();
        $(".react-datepicker__year-select").$(byText("1977")).click();
        $(".react-datepicker__month").$(byText("8")).click();
        $("#subjectsInput").setValue("History").pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();






    }
}
