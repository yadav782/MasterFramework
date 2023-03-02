package com.qa.tests;

import com.github.dockerjava.api.model.Frame;
import com.qa.config.ConfigFactory;
import com.qa.config.FrameWorkConfig;
import org.aeonbits.owner.ConfigCache;
import org.testng.annotations.Test;

public class DemoTests {

    @Test
    public void testLogin() {

        System.out.println(ConfigFactory.getConfig().browser());
    }
}