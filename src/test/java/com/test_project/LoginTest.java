package com.test_project;

import com.workshop.pages.LoginPage;
import com.workshop.pages.domain.User;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;

public class LoginTest extends BaseTest {

    private String userEmail = "+380934733286",
            userPassword     = "Gennadiy64";

    @Test
    public void testSuccessLoginPage() {
        User user = new User(userEmail, userPassword);
        new LoginPage()
                .open()
                .loginAs(user).userName.shouldHave(text("Степан"));
    }
}
