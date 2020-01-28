package com.petclinic;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewVeterinarianPageObject {

    private By firstNameField = By.id("firstName");
    private By lastNameField = By.cssSelector("#lastName");
    private By specialityDropdownMenu = By.id("specialties");
    private By saveSpecialityBtn = By.xpath("//*[text()='Save Vet']");

    private By invalidFirstNameField = By.xpath("//div/span[@class='help-block']");
    private By invalidLastNameField = By.xpath("//div/span[@class='help-block']");

    String invalidFirstNameFieldMessage = "First name must be at least 2 characters long";
    String invalidLastNameFieldMessage = "Last name must be at least 2 characters long";

    public  NewVeterinarianPageObject setNameOntoFirstNameField(String name){

        $(firstNameField).sendKeys(name);

       return this;
    }

    public  NewVeterinarianPageObject setInvalidNameOntoFirstNameField(String name){

        $(firstNameField).sendKeys(name);
        $(invalidFirstNameField).shouldHave(Condition.text(invalidFirstNameFieldMessage));
        return this;
    }

    public  NewVeterinarianPageObject setLastnameOntoLastnameField(String lastname){

        $(lastNameField).sendKeys(lastname);
        return this;
    }

    public  NewVeterinarianPageObject setInvalidLastnameOntoLastnameField(String lastname) {

        $(lastNameField).sendKeys(lastname);
        $(invalidLastNameField).shouldHave(Condition.text(invalidLastNameFieldMessage));
        return this;
    }

    public  NewVeterinarianPageObject chooseSpecialties(String specialties) {

        $(specialityDropdownMenu).selectOption(specialties);
        return this;
    }

    public  NewVeterinarianPageObject saveProfileOfVeterinarian() {

        $(saveSpecialityBtn).click();
        return this;
    }
}
