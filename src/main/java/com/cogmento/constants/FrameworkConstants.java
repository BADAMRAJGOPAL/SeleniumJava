package com.cogmento.constants;

import com.cogmento.configreader.ConfigReader;

public class FrameworkConstants {
    private FrameworkConstants(){

    }
    public static final String URL= ConfigReader.getProperty("url");
    public static final String SHORTWAIT= ConfigReader.getProperty("short_wait");
    public static final String MEDIUMWAIT= ConfigReader.getProperty("medium_wait");
    public static final String LONGWAIT= ConfigReader.getProperty("long_wait");
}
