package com.demo.questions;

import com.demo.UI.RadioButtonPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyRadioButtonSelection implements Question<Boolean> {

    private final String radioButtonName;

    public VerifyRadioButtonSelection(String radioButtonName) {
        this.radioButtonName = radioButtonName;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        switch (radioButtonName) {
            case "Yes":
                return RadioButtonPage.YES_RADIO_BUTTON.resolveFor(actor).isSelected();
            case "Impressive":
                return RadioButtonPage.IMPRESSIVE_RADIO_BUTTON.resolveFor(actor).isSelected();
            case "No":
                return RadioButtonPage.NO_RADIO_BUTTON.resolveFor(actor).isSelected();
            default:
                throw new IllegalArgumentException("Radio button desconocido: " + radioButtonName);
        }
    }

    public static VerifyRadioButtonSelection isSelected(String radioButtonName) {
        return new VerifyRadioButtonSelection(radioButtonName);
    }
}

