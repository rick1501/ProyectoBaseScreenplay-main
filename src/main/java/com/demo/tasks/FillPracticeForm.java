package com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.demo.UI.PracticeFormPage;

public class FillPracticeForm implements Task {

    private final String fullName;
    private final String email;
    private final String mobileNumber;
    private final String dateOfBirth;
    private final String subjects;
    private final String currentAddress;
    private final String state;
    private final String city;

    public FillPracticeForm(String fullName, String email, String mobileNumber, String dateOfBirth,
                            String subjects, String currentAddress, String state, String city) {
        this.fullName = fullName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.dateOfBirth = dateOfBirth;
        this.subjects = subjects;
        this.currentAddress = currentAddress;
        this.state = state;
        this.city = city;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(fullName).into(PracticeFormPage.FULL_NAME_FIELD),
                Enter.theValue(email).into(PracticeFormPage.EMAIL_FIELD),
                Click.on(PracticeFormPage.GENDER_RADIO_BUTTON),
                Enter.theValue(mobileNumber).into(PracticeFormPage.MOBILE_NUMBER_FIELD),
                Enter.theValue(dateOfBirth).into(PracticeFormPage.DATE_OF_BIRTH_FIELD),
                Enter.theValue(subjects).into(PracticeFormPage.SUBJECTS_FIELD),
                Click.on(PracticeFormPage.HOBBIES_CHECKBOX),
                Enter.theValue(currentAddress).into(PracticeFormPage.CURRENT_ADDRESS_FIELD),
                Enter.theValue(state).into(PracticeFormPage.STATE_FIELD),
                Enter.theValue(city).into(PracticeFormPage.CITY_FIELD),
                Click.on(PracticeFormPage.SUBMIT_BUTTON)
        );
    }

    public static FillPracticeForm withDetails(String fullName, String email, String mobileNumber, String dateOfBirth,
                                               String subjects, String currentAddress, String state, String city) {
        return instrumented(FillPracticeForm.class, fullName, email, mobileNumber, dateOfBirth, subjects, currentAddress, state, city);
    }
}
