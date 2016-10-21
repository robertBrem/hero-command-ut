package ch.adesso.hero.boundary;

import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.graphene.page.Location;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Location("https://www.adesso.ch/de/")
public class AdessoPage {

    @FindBy
    WebElement textfield;

    @FindBy(className = "inputicon")
    WebElement search;

    public void search(String inputText) {
        textfield.clear();
        textfield.sendKeys(inputText);
        Graphene.guardHttp(search).click();
    }
}
