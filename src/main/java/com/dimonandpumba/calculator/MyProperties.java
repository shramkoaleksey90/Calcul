package com.dimonandpumba.calculator;

import java.io.FileInputStream;
import java.util.Properties;

public class MyProperties {

    FileInputStream fileInputStream;
    Properties properties = new Properties();
    private int scale;
    private int roundingMode;

    {
        try {
            fileInputStream = new FileInputStream("src/main/resources/config.properties");
            properties.load(fileInputStream);
            scale = Integer.parseInt(properties.getProperty("ValueOfRounding"));
            roundingMode = Integer.parseInt(properties.getProperty("RoundingMode"));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public int getScale() {
        return scale;
    }

    public int getRoundingMode() {
        return roundingMode;
    }

}
