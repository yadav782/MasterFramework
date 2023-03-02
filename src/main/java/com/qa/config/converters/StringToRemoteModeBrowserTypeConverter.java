package com.qa.config.converters;

import java.lang.reflect.Method;

import com.qa.enums.BrowserRemoteModeType;
import org.aeonbits.owner.Converter;

public class StringToRemoteModeBrowserTypeConverter implements Converter<BrowserRemoteModeType> {

    @Override
    public  BrowserRemoteModeType convert(Method method, String remoteMode) {
        return BrowserRemoteModeType.valueOf(remoteMode.toUpperCase());
    }
}