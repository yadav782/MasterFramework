package com.qa.config;

import com.qa.config.converters.StringToBrowserTypeConverter;
import org.aeonbits.owner.Config;
import org.openqa.selenium.remote.BrowserType;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/main/resources/config.properties"
})
public interface FrameWorkConfig extends Config {

    @DefaultValue("Chrome")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();
}