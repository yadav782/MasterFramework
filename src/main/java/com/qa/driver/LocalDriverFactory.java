package com.qa.driver;

import com.qa.config.ConfigFactory;
import com.qa.driver.manager.ChromeManager;
import com.qa.driver.manager.FireFoxManager;
import com.qa.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){

    }

    public static WebDriver getDriver(){
        WebDriver driver = null;
        if(isBrowserChrome())  driver = ChromeManager.getDriver();
         else driver = FireFoxManager.getDriver();

        return driver;
    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }

}