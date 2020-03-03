package com.petclinic;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OwnerTest {
    //check comment
    static {
        Configuration.baseUrl="http://139.59.149.247:8000/petclinic";
        Configuration.timeout = 7000;
        //Configuration.browser = "firefox";
    }

    @Test
    public void addNewOwnerTest(){
//        open("http://139.59.149.247:8000/petclinic/");
        //open(Configuration.baseUrl);

        open("/owners/add");
        //$("h2").shouldHave(Condition.text("New Owner"));

        NewOwnerPage newOwnerPage= new NewOwnerPage();

        newOwnerPage
                .setFirstName("Dfgf")
                .setLastName("cool")
                .setCity("Dnipro")
                .setAddress("D5")
                .setTelephone("3800659596")
                .clickBTn();


    }
}
