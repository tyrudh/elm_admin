package com.elm.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
public class ConfigUtil {
    private static final Properties conf  = new Properties();
    static {
        InputStream in  = ConfigUtil.class.getClassLoader().getResourceAsStream("elm.properties");
        try {
            conf.load(in);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String getProp(String key){
        return conf.getProperty(key);
    }
}
