package tests.logger_examples;

import logger.CustomLogger;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class LoggerExample {

    @Test
    public void test1() throws InterruptedException {
        clickButtonSignInOnMainPage();
        fillTheFieldEmail();
        fillTheFieldPassword();
        clickButtonSignInOnLoginForm();
        checkButtonDeposit();
    }

    public void clickButtonSignInOnMainPage() throws InterruptedException {
        sleep(3000);
        CustomLogger.logger.info("ok");
    }

    public void fillTheFieldEmail() throws InterruptedException {
        sleep(3000);
        CustomLogger.logger.info("ok");
    }

    public void fillTheFieldPassword() throws InterruptedException {
        sleep(3000);
        CustomLogger.logger.info("ok");
    }

    public void clickButtonSignInOnLoginForm() throws InterruptedException {
        sleep(3000);
        CustomLogger.logger.info("ok");
    }

    public void checkButtonDeposit() throws InterruptedException {
        sleep(3000);
        CustomLogger.logger.info("ok");
    }

}
