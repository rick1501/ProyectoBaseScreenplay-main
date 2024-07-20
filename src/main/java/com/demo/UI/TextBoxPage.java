package com.demo.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TextBoxPage {
    public static final Target FULL_NAME_FIELD = Target.the("Full Name field")
            .located(By.id("userName"));

    public static final Target EMAIL_FIELD = Target.the("Email field")
            .located(By.id("userEmail"));

    public static final Target CURRENT_ADDRESS_FIELD = Target.the("Current Address field")
            .located(By.id("currentAddress"));

    public static final Target PERMANENT_ADDRESS_FIELD = Target.the("Permanent Address field")
            .located(By.id("permanentAddress"));

    public static final Target SUBMIT_BUTTON = Target.the("Submit button")
            .located(By.id("submit"));
}
