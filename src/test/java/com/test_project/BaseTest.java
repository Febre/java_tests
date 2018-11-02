package com.test_project;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.BeforeClass;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

public class BaseTest {


    @BeforeClass
    public static void setUp() {
        ChromeDriverManager.getInstance(CHROME).setup();
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://facebook.com";
    }
}
