package com.petclinic;

import com.codeborne.selenide.Condition;
import com.sun.org.glassfish.external.probe.provider.annotations.ProbeListener;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class AddNewOwnerPageObject {

    private By firstNameField = By.id("firstName");
    private By lastNameFieldId  = By.id("lastName");
    private By adressField = By.id("address");
    private By cityField = By.cssSelector("#city");
    private By telephoneField = By.id("telephone");
    private By AddOwnerBtn = By.xpath("//*[text()='Add Owner']");

    private By invalidFirstNameField = By.xpath("//div/span[@class='help-block']");
    private By invalidLastNameField = By.xpath("//div/span[@class='help-block']");
    private By invalidAddressField = By.xpath("//div/span[@class='help-block']");
    private By invalidCityField = By.xpath("//div/span[@class='help-block']");
    private By invalidPhoneNumberField = By.xpath("//div/span[@class='help-block']");

    //inf messages

    String invalidFirstFieldInfMessage = "First name must be at least 2 characters long";
    String invalidSecondFieldInfMessage = "Last name must be at least 2 characters long";
    String invalidAddressFieldMessage = "Address is required";
    String invalidCityFieldMessage = "City is required";
    String invalidPhoneNumberFieldMessage = "Phone number is required";

    public AddNewOwnerPageObject setNameOntoFirstNameField (String name){

        $(firstNameField).sendKeys(name);
        return this;
    }

    public AddNewOwnerPageObject setInvalidNameOntoFirstNameField(String name){

        $(firstNameField).setValue(name);
        $(invalidFirstNameField).shouldHave(Condition.text(invalidFirstFieldInfMessage));
        return this;
    }

    public AddNewOwnerPageObject setLastnameOntoLastnameField(String lastname){

        $(lastNameFieldId).setValue(lastname);
        return this;
    }

    public  AddNewOwnerPageObject setInvalidLastnameOntoLastnameField(String lastname){

        $(lastNameFieldId).setValue(lastname);
        $(invalidLastNameField).shouldHave(Condition.text(invalidSecondFieldInfMessage));
        return this;
    }

    public AddNewOwnerPageObject setAddressOntoAddressField(String addressOfPet){

        $(adressField).setValue(addressOfPet);
        return this;
    }

    public AddNewOwnerPageObject setInvalidAddressOntoAddressField(String addressOfPet){

        $(adressField).setValue(addressOfPet).sendKeys(Keys.BACK_SPACE);
        $(invalidAddressField).shouldHave(Condition.text(invalidAddressFieldMessage));
        return this;
    }

    public AddNewOwnerPageObject setInvalidCityOntoAddressField(String city){
        $(cityField).setValue(city).sendKeys(Keys.BACK_SPACE);
        $(invalidCityField).shouldHave(Condition.text(invalidCityFieldMessage));
        return this;
    }

    public AddNewOwnerPageObject setCityOntoCityField(String city){

        $(cityField).setValue(city);
        return this;
    }

    public AddNewOwnerPageObject setPhoneNumberOntoPhoneNumberField(String number){

        $(telephoneField).setValue(number);
        return this;
    }

    public AddNewOwnerPageObject setInvalidPhoneNumberOntoPhoneNumberField(String number){

        $(telephoneField).setValue(number).sendKeys(Keys.BACK_SPACE);
        $(invalidPhoneNumberField).shouldHave(Condition.text(invalidPhoneNumberFieldMessage));
        return this;
    }

    public AddNewOwnerPageObject clickAddOwnerButton(){

        $(AddOwnerBtn).click();
        return this;
    }

}
