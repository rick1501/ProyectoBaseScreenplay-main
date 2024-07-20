package com.demo.questions;

import com.demo.UI.DemoQAPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarSeccion implements Question<Boolean> {

    private final String section;

    public ValidarSeccion(String section) {
        this.section = section;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Target target;
        switch (section) {
            case "Elements":
                target = DemoQAPage.ELEMENTS_SECTION;
                break;
            case "Forms":
                target = DemoQAPage.FORMS_SECTION;
                break;
            case "Alerts, Frame & Windows":
                target = DemoQAPage.ALERTS_FRAME_WINDOWS_SECTION;
                break;
            default:
                throw new IllegalArgumentException("Sección desconocida: " + section);
        }
        return target.resolveFor(actor).isCurrentlyVisible();
    }

    public static ValidarSeccion forSection(String section) {
        return new ValidarSeccion(section);
    }
}
