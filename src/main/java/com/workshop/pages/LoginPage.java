package com.workshop.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.workshop.pages.domain.User;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

   private SelenideElement
           password = $("#pass"),
           buttonLogin = $("#loginbutton"),
           login = $("#email");

    public LoginPage open() {
        Selenide.open("/");
        return this;
    }

    public MainPage loginAs(User user) {
        login.val(user.getName());
        password.val(user.getPassword());
        buttonLogin.click();
        return new MainPage();
    }

}
