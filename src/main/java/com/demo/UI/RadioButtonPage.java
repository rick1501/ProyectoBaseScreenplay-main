package com.demo.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RadioButtonPage {

    public static final Target YES_RADIO_BUTTON = Target.the("Yes radio button")
            .located(By.id("yesRadio"));

    public static final Target IMPRESSIVE_RADIO_BUTTON = Target.the("Impressive radio button")
            .located(By.id("impressiveRadio"));

    public static final Target NO_RADIO_BUTTON = Target.the("No radio button")
            .located(By.id("noRadio"));
}
