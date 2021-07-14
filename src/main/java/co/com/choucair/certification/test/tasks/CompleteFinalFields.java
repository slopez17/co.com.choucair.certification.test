package co.com.choucair.certification.test.tasks;

import co.com.choucair.certification.test.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.test.userinterface.FinalPage.*;
import static org.openqa.selenium.Keys.ENTER;

public class CompleteFinalFields implements Task {
    private UtestData utestData;

    public CompleteFinalFields(UtestData utestData) {
        this.utestData = utestData;
    }

    public static CompleteFinalFields withYourAcceptanceAndPassword(UtestData utestData) {
        return Tasks.instrumented(CompleteFinalFields.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(utestData.getStrPassword()).into(INPUT_PASSWORD).thenHit(ENTER),
                Enter.theValue(utestData.getStrPassword()).into(INPUT_CONFIRN_PASSWORD).thenHit(ENTER),
                Click.on(CHECKBOX_TERMS),
                Click.on(CHECKBOX_POLICY)
        );

    }
}
