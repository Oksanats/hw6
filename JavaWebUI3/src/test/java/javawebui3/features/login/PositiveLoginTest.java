package javawebui3.features.login;

import javawebui3.base.BaseUITest;
import javawebui3.pages.LoginPage;
import org.junit.jupiter.api.Test;

import static javawebui3.common.Configuration.*;

public class PositiveLoginTest extends BaseUITest {


    @Test
    public void loginWithBaseUserTest() {
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickLoginButton()
                .checkUrl(BASE_URL);
    }
}
