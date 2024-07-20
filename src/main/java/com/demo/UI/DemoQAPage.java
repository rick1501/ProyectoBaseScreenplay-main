package com.demo.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoQAPage {
    public static final Target ELEMENTS_SECTION = Target.the("Elements section")
            .located(By.xpath("//h5[contains(text(),'Elements')]"));

    public static final Target FORMS_SECTION = Target.the("Forms section")
            .located(By.xpath("//h5[contains(text(),'Forms')]"));

    public static final Target ALERTS_FRAME_WINDOWS_SECTION = Target.the("Alerts, Frame & Windows section")
            .located(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
}
