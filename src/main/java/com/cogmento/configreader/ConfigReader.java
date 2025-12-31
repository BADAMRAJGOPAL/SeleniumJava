package com.cogmento.configreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class ConfigReader {
    private static final Properties properties;

    static {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Failed to find config.properties file", e);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties file", e);
        }
    }

    private ConfigReader() {
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}