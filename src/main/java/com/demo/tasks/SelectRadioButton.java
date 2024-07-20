package com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import com.demo.UI.RadioButtonPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectRadioButton implements Task {

    private final String radioButtonName;

    public SelectRadioButton(String radioButtonName) {
        this.radioButtonName = radioButtonName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (radioButtonName) {
            case "Yes":
                actor.attemptsTo(Click.on(RadioButtonPage.YES_RADIO_BUTTON));
                break;
            case "Impressive":
                actor.attemptsTo(Click.on(RadioButtonPage.IMPRESSIVE_RADIO_BUTTON));
                break;
            case "No":
                actor.attemptsTo(Click.on(RadioButtonPage.NO_RADIO_BUTTON));
                break;
            default:
                throw new IllegalArgumentException("Radio button desconocido: " + radioButtonName);
        }
    }

    public static SelectRadioButton named(String radioButtonName) {
        return instrumented(SelectRadioButton.class, radioButtonName);
    }
}
