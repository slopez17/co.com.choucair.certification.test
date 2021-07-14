package co.com.choucair.certification.test.questions;

import co.com.choucair.certification.test.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.test.userinterface.FinalPage.TEXT_FINAL;

public class Answer implements Question {
    private UtestData utestData;

    public Answer(UtestData utestData) {
        this.utestData = utestData;
    }

    public static Answer toThe(UtestData utestData) {
        return new Answer(utestData);
    }

    @Override
    public Object answeredBy(Actor actor) {
        String question = Text.of(TEXT_FINAL).viewedBy(actor).asString();
        if(question.equals(utestData.getStrMessage())){
            return true;
        }
        return false;
    }
}
