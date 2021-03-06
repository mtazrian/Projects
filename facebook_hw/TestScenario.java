package facebook_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Mo Tazrian on 1/25/18.
 */
public class TestScenario extends BasePage {

    @Test
    public void testOne() throws InterruptedException {

//        Navigate to Facebook sign up page
        navigateToUrl("https://www.facebook.com/");

//        Enter first name
        sendInput(By.cssSelector("#u_0_e"), "mo");

//        Enter last name
        sendInput(By.cssSelector("#u_0_g"), "tazrian");

//        Enter mobile number
        sendInput(By.cssSelector("#u_0_j"), "800-555-6789");

//        Enter password
        sendInput(By.cssSelector("#u_0_q"), "Abcd1234");

//        Select month of birthday from dropdown
        selectDropDownByVisibleText(By.cssSelector("#month"), "Aug");

//        Select day of birthday from dropdown
        selectDropDownByVisibleText(By.cssSelector("#day"), "27");

//        Select year of birthday from dropdown
        selectDropDownByVisibleText(By.cssSelector("#year"), "1995");

//        Click gender
        clickOn(By.cssSelector("#u_0_c"));

//        Sleep for 2 seconds
        Thread.sleep(2000);

//        Verify Male radio button is selected
        isSelected(By.cssSelector("#u_0_c"));
    }
}
