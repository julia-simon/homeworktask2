package com.demoqa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestForm extends TestBase {

    @Test
    void succesfullFillFormTest() {
        open("/automation-practice-form");

        $("").setValue()


    }
}
