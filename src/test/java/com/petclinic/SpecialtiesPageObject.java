package com.petclinic;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SpecialtiesPageObject {

    private By clickAddButton = By.xpath("//*[normalize-space(text())='Add']");
    private By nameField = By.id("name");
    private By clickSaveBtn = By.xpath("//*[text()='Save']");

    public SpecialtiesPageObject clickAddButton(){

        $(clickAddButton).click();
        return this;
    }

    public SpecialtiesPageObject setNameSpeciality(String nameSpeciality){

        $(nameField).sendKeys(nameSpeciality);
        return this;
    }

    public SpecialtiesPageObject clickSaveBtn(){

        $(clickSaveBtn).click();
        return this;
    }
}
