package co.com.choucair.certification.test.userinterface;

import co.com.choucair.certification.test.util.Constant;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl(Constant.URL)
public class UtestHomePage extends PageObject {
    public static final Target BUTTON_SIGN_UP = Target.the("button to start sign up procces and open register form")
            .located(By.xpath("//a[@href='/signup/personal']"));
}
