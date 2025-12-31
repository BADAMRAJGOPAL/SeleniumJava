package com.cogmento.constants;

import com.cogmento.configreader.ConfigReader;

public class FrameworkConstants {
    private FrameworkConstants(){

    }
    public static final String URL= ConfigReader.getProperty("url");
}
