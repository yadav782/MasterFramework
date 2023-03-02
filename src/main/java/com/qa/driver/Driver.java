package com.qa.driver;

import org.openqa.selenium.WebDriver;


public class Driver {
    static WebDriver driver = null;
public static  void initDriver() {

    WebDriver driver = LocalDriverFactory.getDriver();
    driver.get("htpp://google.co.in");
}


public static void quitDriver(){

}
}