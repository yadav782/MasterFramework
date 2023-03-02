package com.qa.tests;

import com.qa.config.ConfigFactory;
import org.testng.annotations.Test;

public class DemoTests {

    @Test
    public void testLogin() {

        System.out.println(ConfigFactory.getConfig().browser());
    }
}