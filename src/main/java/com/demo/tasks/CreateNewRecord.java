package com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.demo.UI.WebTablePage;

public class CreateNewRecord implements Task {

    private final String fullName;
    private final String email;
    private final String age;
    private final String salary;
    private final String department;

    public CreateNewRecord(String fullName, String email, String age, String salary, String department) {
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WebTablePage.ADD_BUTTON),
                Enter.theValue(fullName).into(WebTablePage.FULL_NAME_FIELD),
                Enter.theValue(email).into(WebTablePage.EMAIL_FIELD),
                Enter.theValue(age).into(WebTablePage.AGE_FIELD),
                Enter.theValue(salary).into(WebTablePage.SALARY_FIELD),
                Enter.theValue(department).into(WebTablePage.DEPARTMENT_FIELD),
                Click.on(WebTablePage.SAVE_BUTTON)
        );
    }

    public static CreateNewRecord withDetails(String fullName, String email, String age, String salary, String department) {
        return instrumented(CreateNewRecord.class, fullName, email, age, salary, department);
    }
}
