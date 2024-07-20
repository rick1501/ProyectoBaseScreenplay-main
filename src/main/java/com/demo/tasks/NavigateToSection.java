package com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.demo.UI.DemoQAPage.*;

public class NavigateToSection implements Task {

    private final String sectionName;

    public NavigateToSection(String sectionName) {
        this.sectionName = sectionName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target section;
        switch (sectionName) {
            case "Elements":
                section = ELEMENTS_SECTION;
                break;
            case "Forms":
                section = FORMS_SECTION;
                break;
            case "Alerts, Frame & Windows":
                section = ALERTS_FRAME_WINDOWS_SECTION;
                break;
            default:
                throw new IllegalArgumentException("Sección desconocida: " + sectionName);
        }
        actor.attemptsTo(
                Click.on(section)
        );
    }

    public static NavigateToSection named(String sectionName) {
        return instrumented(NavigateToSection.class, sectionName);
    }
}
