package co.com.choucair.certification.test.stepdefinitions;

import co.com.choucair.certification.test.model.UtestData;
import co.com.choucair.certification.test.questions.Answer;
import co.com.choucair.certification.test.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.choucair.certification.test.util.Constant.ACTOR_NAME;
import static co.com.choucair.certification.test.util.Constant.ZERO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepDefinition {

    @Before()
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Given("^than the user wants to sign up at utest web page$")
    public void thanTheUserWantsToSignUpAtUtestWebPage() {
        theActorCalled(ACTOR_NAME).wasAbleTo(
                OpenUp.thePage(),
                StartSignUpProccess.withRegisterForm()
        );

    }


    @When("^the user enters its log information$")
    public void theUserEntersItsLogInformation(List<UtestData> utestDataList) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                CompletePersonalFields.withYourselfData(utestDataList.get(ZERO)),
                CompleteLocationFields.withYourAddressData(utestDataList.get(ZERO)),
                CompleteDeviceFields.withYourDeviceData(utestDataList.get(ZERO)),
                CompleteFinalFields.withYourAcceptanceAndPassword(utestDataList.get(ZERO))
        );

    }

    @Then("^the user can read$")
    public void theUserCanRead(List<UtestData> utestDataList) throws Exception {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(utestDataList.get(ZERO))));

    }
}
