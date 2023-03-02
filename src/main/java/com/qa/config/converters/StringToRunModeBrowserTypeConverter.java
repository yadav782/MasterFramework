package com.qa.config.converters;

import java.lang.reflect.Method;

import com.qa.enums.RunModeBrowserType;
import org.aeonbits.owner.Converter;

public class StringToRunModeBrowserTypeConverter implements Converter<RunModeBrowserType> {

    @Override
    public RunModeBrowserType convert(Method method, String runMode) {
        return RunModeBrowserType.valueOf(runMode.toUpperCase());
    }
}