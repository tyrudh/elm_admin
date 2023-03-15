package com.elm.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getConnection(){
     Connection conn = null;
     try {
         Class.forName(ConfigUtil.getProp("driverClassName"));
         conn = DriverManager.getConnection(ConfigUtil.getProp("url"),ConfigUtil.getProp("username"),ConfigUtil.getProp("password"));
     }catch (Exception e){
         e.printStackTrace();
     }
    return conn;
    }
}

