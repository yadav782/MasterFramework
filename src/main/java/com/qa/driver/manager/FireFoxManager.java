package com.qa.driver.manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class FireFoxManager {


    public static WebDriver getDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}