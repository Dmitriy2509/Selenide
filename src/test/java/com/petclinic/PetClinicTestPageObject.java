package com.petclinic;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class PetClinicTestPageObject {

    static {
        Configuration.baseUrl="http://139.59.149.247:8000/petclinic";
        Configuration.timeout = 7000;
        //Configuration.browser = "firefox";
    }

    @Test
    public void AddNewOwnerValidData(){

        open("/owners/add");

        AddNewOwnerPageObject addNewOwnerPageObject = new AddNewOwnerPageObject();

        addNewOwnerPageObject
                .setNameOntoFirstNameField("Tom")
                .setLastnameOntoLastnameField("Cruz")
                .setAddressOntoAddressField("jfsd")
                .setCityOntoCityField("New-York")
                .setPhoneNumberOntoPhoneNumberField("821656564")
                .clickAddOwnerButton();
    }

    @Test
    public void firstNameFieldCheckInfMessage(){
        open("/owners/add");

        AddNewOwnerPageObject addNewOwnerPageObject = new AddNewOwnerPageObject();

        addNewOwnerPageObject.setInvalidNameOntoFirstNameField("D");
    }
    @Test
    public void lastNameFieldCheckInfMessage(){
        open("/owners/add");

        AddNewOwnerPageObject addNewOwnerPageObject = new AddNewOwnerPageObject();

        addNewOwnerPageObject.setInvalidLastnameOntoLastnameField("B");
    }
    @Test
    public void addressFieldCheckInfMessage(){
        open("/owners/add");

        AddNewOwnerPageObject addNewOwnerPageObject = new AddNewOwnerPageObject();

        addNewOwnerPageObject.setInvalidAddressOntoAddressField("Z");
    }
    @Test
    public void cityFieldCheckInfMessage(){
        open("/owners/add");

        AddNewOwnerPageObject addNewOwnerPageObject = new AddNewOwnerPageObject();

        addNewOwnerPageObject.setInvalidCityOntoAddressField("U");
    }
    @Test
    public void telephoneFieldCheckInfMessage(){
        open("/owners/add");

        AddNewOwnerPageObject addNewOwnerPageObject = new AddNewOwnerPageObject();

        addNewOwnerPageObject.setInvalidPhoneNumberOntoPhoneNumberField("a");
    }
    //add veterenarian
    @Test
    public void addNewVeterinarian() {
        open("/vets/add");

        NewVeterinarianPageObject newVeterinarianPageObject = new NewVeterinarianPageObject();

        newVeterinarianPageObject
                .setNameOntoFirstNameField("Jack")
                .setLastnameOntoLastnameField("London")
                .chooseSpecialties(" dentistry ")
                .saveProfileOfVeterinarian();

    }

    @Test
    public void checkInfMessageFirstName(){
        open("/vets/add");

        NewVeterinarianPageObject newVeterinarianPageObject = new NewVeterinarianPageObject();

        newVeterinarianPageObject.setInvalidNameOntoFirstNameField("P");
    }
    @Test
    public void checkInfMessageLastName(){
        open("/vets/add");

        NewVeterinarianPageObject newVeterinarianPageObject = new NewVeterinarianPageObject();

        newVeterinarianPageObject.setInvalidLastnameOntoLastnameField("h");
    }
    //add new pet type
    @Test
    public void createPetTypes(){
        open("/pettypes");

        PetTypesPageObject petTypesPageObject = new PetTypesPageObject();

        petTypesPageObject
                .addNewPetTypesOpenField()
                .addNewType("guinea pig")
                .saveButton();
    }
    //add Specialties
    @Test
    public void addSpecialty  (){
        open("/specialties");

        SpecialtiesPageObject specialtiesPageObject = new SpecialtiesPageObject();

        specialtiesPageObject
                .clickAddButton()
                .setNameSpeciality("tough man")
                .clickSaveBtn();
    }

}
