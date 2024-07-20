package com.demo.stepDefinitions;

import com.demo.questions.ValidarSeccion;
import com.demo.tasks.NavigateToSection;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.util.EnvironmentVariables;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DemoStepDefinition {

    private EnvironmentVariables environmentVariables;

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario abre el navegador en la página de DemoQA")
    public void queElUsuarioAbreElNavegadorEnLaPaginaDeDemoQA() {
        String baseUrl = environmentVariables.optionalProperty("environments.qa.base.url").orElse("https://demoqa.com");
        theActorCalled("user").wasAbleTo(
                Open.url(baseUrl)
        );
    }

    @Dado("que el usuario abre el navegador en la página de DemoQAdos")
    public void queElUsuarioAbreElNavegadorEnLaPaginaDeDemoQAdos() {
        String baseUrl = environmentVariables.optionalProperty("environments.qa.base.url").orElse("https://demoqa.com");
        theActorCalled("user").wasAbleTo(
                Open.url(baseUrl)
        );
    }

    @Dado("que el usuario abre el navegador en la página de DemoQAtres")
    public void queElUsuarioAbreElNavegadorEnLaPaginaDeDemoQAtres() {
        String baseUrl = environmentVariables.optionalProperty("environments.qa.base.url").orElse("https://demoqa.com");
        theActorCalled("user").wasAbleTo(
                Open.url(baseUrl)
        );
    }

    @Cuando("el usuario navega a la sección Elements")
    public void elUsuarioNavegaALaSeccion(String section) {
        theActorInTheSpotlight().attemptsTo(
                NavigateToSection.named(section)
        );
    }

    @Entonces("el usuario puede ver la sección {string}")
    public void elUsuarioPuedeVerLaSeccion(String section) {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidarSeccion.forSection(section), Matchers.equalTo(true)
                )
        );
    }

    @Cuando("el usuario navega a la sección Forms")
    public void elUsuarioNavegaALaSeccionForms() {
        theActorInTheSpotlight().attemptsTo(
                NavigateToSection.named("Forms")
        );
    }

    @Entonces("el usuario puede interactuar con los formularios de la sección Forms")
    public void elUsuarioPuedeInteractuarConLosFormulariosDeLaSeccionForms() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidarSeccion.forSection("Forms"), Matchers.equalTo(true)
                )
        );
    }

    @Cuando("el usuario navega a la sección Alerts, Frame & Windows")
    public void elUsuarioNavegaALaSeccionAlertsFrameWindows() {
        theActorInTheSpotlight().attemptsTo(
                NavigateToSection.named("Alerts, Frame & Windows")
        );
    }

    @Entonces("el usuario puede interactuar con los elementos de la sección Alerts, Frame & Windows")
    public void elUsuarioPuedeInteractuarConLosElementosDeLaSeccionAlertsFrameWindows() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidarSeccion.forSection("Alerts, Frame & Windows"), Matchers.equalTo(true)
                )
        );
    }

    @Cuando("el usuario navega a Elements seccion TextBox")
    public void elUsuarioNavegaAElementsSeccionTextBox() {
        
        
    }

    @Entonces("el usuario puede ver la sección  Elements")
    public void elUsuarioPuedeVerLaSecciónElements() {
        
    }

    @Entonces("validamos la informacion ingresada <Mensaje>")
    public void validamosLaInformacionIngresadaMensaje() {
    }

    @Y("intectarua con los elementos de la seccion")
    public void intectaruaConLosElementosDeLaSeccion() {
    }
}
