package com.demo.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PracticeFormPage {

    public static final Target FULL_NAME_FIELD = Target.the("Full Name field")
            .located(By.id("fullName"));

    public static final Target EMAIL_FIELD = Target.the("Email field")
            .located(By.id("userEmail"));

    public static final Target GENDER_RADIO_BUTTON = Target.the("Gender Radio Button")
            .located(By.xpath("//label[text()='Male']"));

    public static final Target MOBILE_NUMBER_FIELD = Target.the("Mobile Number field")
            .located(By.id("userNumber"));

    public static final Target DATE_OF_BIRTH_FIELD = Target.the("Date of Birth field")
            .located(By.id("dateOfBirthInput"));

    public static final Target SUBJECTS_FIELD = Target.the("Subjects field")
            .located(By.id("subjectsInput"));

    public static final Target HOBBIES_CHECKBOX = Target.the("Hobbies Checkbox")
            .located(By.xpath("//label[text()='Sports']"));

    public static final Target CURRENT_ADDRESS_FIELD = Target.the("Current Address field")
            .located(By.id("currentAddress"));

    public static final Target STATE_FIELD = Target.the("State field")
            .located(By.id("state"));

    public static final Target CITY_FIELD = Target.the("City field")
            .located(By.id("city"));

    public static final Target SUBMIT_BUTTON = Target.the("Submit button")
            .located(By.id("submit"));

    public static final Target SUCCESS_MESSAGE = Target.the("Success message")
            .located(By.id("example-modal-sizes-title-lg"));
}
