package co.com.choucair.certification.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalPage {
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRN_PASSWORD = Target.the("where do we write the password for second time")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_TERMS = Target.the("where do we accept terms of use")
            .located(By.id("termOfUse"));
    public static final Target CHECKBOX_POLICY = Target.the("where do we accept privacy and security policy")
            .located(By.id("privacySetting"));
    public static final Target TEXT_FINAL = Target.the("text to accept the test")
            .located(By.xpath("//a[@id='laddaBtn']//span"));
}
