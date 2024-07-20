package com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillTextBox implements Task {

    private final String fullName;
    private final String email;
    private final String currentAddress;
    private final String permanentAddress;

    public FillTextBox(String fullName, String email, String currentAddress, String permanentAddress) {
        this.fullName = fullName;
        this.email = email;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
    }

    @Override
    @Step("{0} fills in the text boxes")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(fullName).into(By.id("userName")),
                Enter.theValue(email).into(By.id("userEmail")),
                Enter.theValue(currentAddress).into(By.id("currentAddress")),
                Enter.theValue(permanentAddress).into(By.id("permanentAddress"))
        );
    }

    public static FillTextBox withData(String fullName, String email, String currentAddress, String permanentAddress) {
        return instrumented(FillTextBox.class, fullName, email, currentAddress, permanentAddress);
    }
}
