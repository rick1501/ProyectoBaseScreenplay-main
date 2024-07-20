package com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFromDropdown implements Interaction {

    private final String option;
    private final Target target;

    public SelectFromDropdown(String option, Target target) {
        this.option = option;
        this.target = target;
    }

    @Step("{0} selecciona la opción '#option' del desplegable #target")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(option).from(target)
        );
    }

    public static SelectFromDropdown byVisibleText(Target target, String option) {
        return instrumented(SelectFromDropdown.class, option, target);
    }
}
