package com.demo.questions;

import com.demo.UI.PracticeFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateFormSubmission implements Question<Boolean> {

    private final String fullName;
    private final String email;
    private final String mobileNumber;
    private final String dateOfBirth;
    private final String subjects;
    private final String currentAddress;
    private final String state;
    private final String city;

    public ValidateFormSubmission(String fullName, String email, String mobileNumber, String dateOfBirth,
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
    public Boolean answeredBy(Actor actor) {
        return Text.of(PracticeFormPage.SUCCESS_MESSAGE).answeredBy(actor).contains(fullName) &&
                // Validate each field
                Text.of(PracticeFormPage.FULL_NAME_FIELD).answeredBy(actor).equals(fullName) &&
                Text.of(PracticeFormPage.EMAIL_FIELD).answeredBy(actor).equals(email) &&
                Text.of(PracticeFormPage.MOBILE_NUMBER_FIELD).answeredBy(actor).equals(mobileNumber) &&
                Text.of(PracticeFormPage.DATE_OF_BIRTH_FIELD).answeredBy(actor).equals(dateOfBirth) &&
                Text.of(PracticeFormPage.SUBJECTS_FIELD).answeredBy(actor).equals(subjects) &&
                Text.of(PracticeFormPage.CURRENT_ADDRESS_FIELD).answeredBy(actor).equals(currentAddress) &&
                Text.of(PracticeFormPage.STATE_FIELD).answeredBy(actor).equals(state) &&
                Text.of(PracticeFormPage.CITY_FIELD).answeredBy(actor).equals(city);
    }

    public static ValidateFormSubmission withDetails(String fullName, String email, String mobileNumber, String dateOfBirth,
                                                     String subjects, String currentAddress, String state, String city) {
        return new ValidateFormSubmission(fullName, email, mobileNumber, dateOfBirth, subjects, currentAddress, state, city);
    }
}
