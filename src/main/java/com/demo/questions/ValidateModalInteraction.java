package com.demo.questions;

import com.demo.UI.ModalDialogPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateModalInteraction implements Question<Boolean> {

    private final String expectedTitle;
    private final String expectedBodyText;

    public ValidateModalInteraction(String expectedTitle, String expectedBodyText) {
        this.expectedTitle = expectedTitle;
        this.expectedBodyText = expectedBodyText;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String actualTitle = Text.of(ModalDialogPage.MODAL_TITLE).answeredBy(actor);
        String actualBodyText = Text.of(ModalDialogPage.MODAL_BODY_TEXT).answeredBy(actor);
        return actualTitle.equals(expectedTitle) && actualBodyText.contains(expectedBodyText);
    }

    public static ValidateModalInteraction withDetails(String expectedTitle, String expectedBodyText) {
        return new ValidateModalInteraction(expectedTitle, expectedBodyText);
    }
}
