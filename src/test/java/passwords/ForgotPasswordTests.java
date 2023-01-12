package passwords;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
      var forgotPassword = homePage.clickForgotPassword();
      forgotPassword.setEmail("tui@example.com");
     var emailSentPage =  forgotPassword.clickRetrieveButton();
     assertTrue(emailSentPage.getMessage().contains("Your e-mail's been sent!"),  "The page didn't open");

    }
}
