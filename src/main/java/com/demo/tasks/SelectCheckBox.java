package com.demo.tasks;

import com.demo.UI.CheckBoxPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectCheckBox implements Task {

    private final String[] checkboxes;

    public SelectCheckBox(String... checkboxes) {
        this.checkboxes = checkboxes;
    }

    @Override
    @Step("{0} selects checkboxes")
    public <T extends Actor> void performAs(T actor) {
        for (String checkbox : checkboxes) {
            switch (checkbox.toLowerCase()) {
                case "notes":
                    actor.attemptsTo(Click.on(CheckBoxPage.NOTES_CHECKBOX));
                    break;
                case "workspace":
                    actor.attemptsTo(Click.on(CheckBoxPage.WORKSPACE_CHECKBOX));
                    break;
                case "office":
                    actor.attemptsTo(Click.on(CheckBoxPage.OFFICE_CHECKBOX));
                    break;
                case "word file.doc":
                    actor.attemptsTo(Click.on(CheckBoxPage.WORD_FILE_CHECKBOX));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown checkbox: " + checkbox);
            }
        }
    }

    public static SelectCheckBox withOptions(String... checkboxes) {
        return instrumented(SelectCheckBox.class, (Object) checkboxes);
    }
}
