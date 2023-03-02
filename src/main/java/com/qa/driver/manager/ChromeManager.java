package com.qa.driver.manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class ChromeManager {

    public static WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();

        return new ChromeDriver();
    }
}