package com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.demo.UI.ModalDialogPage;

public class InteractWithModal implements Task {

    private final String modalText;

    public InteractWithModal(String modalText) {
        this.modalText = modalText;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ModalDialogPage.OPEN_MODAL_BUTTON),
                // Aquí puedes interactuar con elementos dentro del modal si es necesario
                // Por ejemplo, ingresar texto o hacer clic en botones dentro del modal
                // Enter.theValue(modalText).into(ModalDialogPage.SOME_TEXT_FIELD),
                Click.on(ModalDialogPage.CLOSE_MODAL_BUTTON)
        );
    }

    public static InteractWithModal withText(String modalText) {
        return instrumented(InteractWithModal.class, modalText);
    }
}
