package com.qa.config;

import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

    public ConfigFactory(){

    }

    public static FrameWorkConfig getConfig(){
        return  ConfigCache.getOrCreate(FrameWorkConfig.class);
    }
}