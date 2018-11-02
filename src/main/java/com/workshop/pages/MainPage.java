package com.workshop.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public SelenideElement userName = $("span._1vp5");

//    public MainPage() {
//        userName.waitUntil(Condition.appear, 3000);
//    }
}
