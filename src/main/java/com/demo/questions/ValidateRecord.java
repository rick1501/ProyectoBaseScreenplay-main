package com.demo.questions;

import com.demo.UI.WebTablePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateRecord implements Question<Boolean> {

    private final String fullName;
    private final String email;
    private final String age;
    private final String salary;
    private final String department;

    public ValidateRecord(String fullName, String email, String age, String salary, String department) {
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // Verifica que cada celda del registro en la tabla tenga el valor correcto
        boolean isFullNameCorrect = Text.of(WebTablePage.TABLE_ROW.of(fullName) + "//td[1]").answeredBy(actor).equals(fullName);
        boolean isEmailCorrect = Text.of(WebTablePage.TABLE_ROW.of(fullName) + "//td[2]").answeredBy(actor).equals(email);
        boolean isAgeCorrect = Text.of(WebTablePage.TABLE_ROW.of(fullName) + "//td[3]").answeredBy(actor).equals(age);
        boolean isSalaryCorrect = Text.of(WebTablePage.TABLE_ROW.of(fullName) + "//td[4]").answeredBy(actor).equals(salary);
        boolean isDepartmentCorrect = Text.of(WebTablePage.TABLE_ROW.of(fullName) + "//td[5]").answeredBy(actor).equals(department);

        return isFullNameCorrect && isEmailCorrect && isAgeCorrect && isSalaryCorrect && isDepartmentCorrect;
    }

    public static ValidateRecord withDetails(String fullName, String email, String age, String salary, String department) {
        return new ValidateRecord(fullName, email, age, salary, department);
    }
}
