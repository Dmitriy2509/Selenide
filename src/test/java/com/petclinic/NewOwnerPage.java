package com.petclinic;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewOwnerPage {

    public NewOwnerPage setFirstName (String name){

        $(By.cssSelector("#firstName")).setValue(name);
        return this;
    }

    public NewOwnerPage setLastName (String name){

        $(By.id("lastName")).setValue(name);
        return this;
    }

    public NewOwnerPage setAddress (String address){

        $(By.id("address")).setValue(address);
        return this;
    }

    public NewOwnerPage setCity (String city){

        $(By.id("city")).setValue(city);
        return this;
    }

    public NewOwnerPage setTelephone (String telephone){

        $(By.id("telephone")).setValue(telephone);
        return this;
    }

    public NewOwnerPage clickBTn (){

        $("[type='submit']").shouldBe(Condition.enabled).click();
        return this;
    }





    //$("h2").shouldHave(Condition.text("Owners"));
}
