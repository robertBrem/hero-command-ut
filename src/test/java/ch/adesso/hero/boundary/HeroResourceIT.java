package ch.adesso.hero.boundary;


import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.InitialPage;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

@RunAsClient
@RunWith(Arquillian.class)
public class HeroResourceIT {

    @Drone
    WebDriver browser;

    @Test
    public void copy(@InitialPage HeroPage page) {
        String expected = "Black Panther";
        String pageSource = browser.getPageSource();
        assertThat(pageSource, containsString(expected));
    }

}
