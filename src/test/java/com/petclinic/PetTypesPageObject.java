package com.petclinic;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PetTypesPageObject {

    private By clickOnButton = By.xpath("//*[normalize-space(text()) ='Add']");
    private By addNewTypeOfAnimal =By.id("name");
    private By saveButton = By.xpath("//*[text()='Save']");


    public PetTypesPageObject addNewPetTypesOpenField(){

        $(clickOnButton).click();
        return this;
    }

    public PetTypesPageObject addNewType(String type){

        $(addNewTypeOfAnimal).sendKeys(type);
        return this;
    }

    public PetTypesPageObject saveButton(){

        $(saveButton).click();
        return this;
    }

}
