package com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterText implements Interaction {

    private final String text;
    private final Target target;

    public EnterText(String text, Target target) {
        this.text = text;
        this.target = target;
    }

    @Step("{0} ingresa el texto '#text' en el elemento #target")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(text).into(target)
        );
    }

    public static EnterText into(Target target, String text) {
        return instrumented(EnterText.class, text, target);
    }
}
