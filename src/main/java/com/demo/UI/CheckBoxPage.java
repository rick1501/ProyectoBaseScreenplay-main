package com.demo.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckBoxPage {
    public static final Target NOTES_CHECKBOX = Target.the("Notes checkbox")
            .located(By.xpath("//span[text()='Notes']/preceding-sibling::span[@class='rct-checkbox']"));

    public static final Target WORKSPACE_CHECKBOX = Target.the("Workspace checkbox")
            .located(By.xpath("//span[text()='WorkSpace']/preceding-sibling::span[@class='rct-checkbox']"));

    public static final Target OFFICE_CHECKBOX = Target.the("Office checkbox")
            .located(By.xpath("//span[text()='Office']/preceding-sibling::span[@class='rct-checkbox']"));

    public static final Target WORD_FILE_CHECKBOX = Target.the("Word File.doc checkbox")
            .located(By.xpath("//span[text()='Word File.doc']/preceding-sibling::span[@class='rct-checkbox']"));
}
