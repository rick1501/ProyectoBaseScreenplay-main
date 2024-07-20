package com.demo.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebTablePage {

    public static final Target ADD_BUTTON = Target.the("Add button")
            .located(By.id("addButton"));

    public static final Target FULL_NAME_FIELD = Target.the("Full Name field")
            .located(By.id("fullName"));

    public static final Target EMAIL_FIELD = Target.the("Email field")
            .located(By.id("email"));

    public static final Target AGE_FIELD = Target.the("Age field")
            .located(By.id("age"));

    public static final Target SALARY_FIELD = Target.the("Salary field")
            .located(By.id("salary"));

    public static final Target DEPARTMENT_FIELD = Target.the("Department field")
            .located(By.id("department"));

    public static final Target SAVE_BUTTON = Target.the("Save button")
            .located(By.id("saveButton"));

    public static final Target TABLE_ROW = Target.the("Table row")
            .located(By.xpath("//table//tr[td[text()='%s']]")); // XPath para encontrar una fila con un texto específico
}
