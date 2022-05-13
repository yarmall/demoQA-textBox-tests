package com.simbirsoft.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        String permanentAddress = "some street 1";

        open("/automation-practice-form");
        $("#firstName").setValue("Andrey");
        $("#lastName").setValue("Yarmolchuk");
        $("#userEmail").setValue("andrey@ss.com");
        $("#genterWrapper").$(new ByText("Male")).click();
        $("#userNumber").setValue("89876371777");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("June");
        $(".react-datepicker__year-select").selectOption("1996");
        $(".react-datepicker__day--021").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbiesWrapper").$(new ByText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("txt/test2.txt");
        $("#currentAddress").setValue("some street 1");
        $("#state").click();
        $("#stateCity-wrapper").$(new ByText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(new ByText("Noida")).click();
        $("#submit").click();
    }

}
