package tests.other_examples.logger_examples;

import listener.CustomListener;
import logger.CustomLogger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

@Listeners(CustomListener.class)
public class SignIn {

    @Test
    public void checkFormSignIn() throws InterruptedException {
        clickButtonSignInOnMainPage();
        fillTheFieldEmail();
        fillTheFieldPassword();
        clickButtonSignInOnLoginForm();
        checkButtonDeposit();
    }

    @Test
    public void checkFormSignOut() throws InterruptedException {
        clickButtonSignInOnMainPage();
        fillTheFieldEmail();
        fillTheFieldPassword();
        clickButtonSignInOnLoginForm();
        checkButtonDeposit();
        clickButtonSignOutOnMainPage();
        checkButtonSignInOnMainPage();
    }

    public void clickButtonSignInOnMainPage() throws InterruptedException {
        sleep(1000);
        CustomLogger.logger.info("ok");
    }

    public void clickButtonSignOutOnMainPage() throws InterruptedException {
        sleep(1000);
        CustomLogger.logger.info("ok");
    }

    public void checkButtonSignInOnMainPage() throws InterruptedException {
        sleep(1000);
        CustomLogger.logger.info("ok");
    }

    public void fillTheFieldEmail() throws InterruptedException {
        sleep(1000);
        CustomLogger.logger.info("ok");
    }

    public void fillTheFieldPassword() throws InterruptedException {
        sleep(1000);
        CustomLogger.logger.info("ok");
    }

    public void clickButtonSignInOnLoginForm() throws InterruptedException {
        sleep(1000);
        CustomLogger.logger.info("ok");
    }

    public void checkButtonDeposit() throws InterruptedException {
        sleep(1000);
        CustomLogger.logger.info("ok");
    }

}
