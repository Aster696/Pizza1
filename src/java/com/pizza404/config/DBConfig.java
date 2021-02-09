/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizza404.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aster
 */
public class DBConfig {
    private final String sql = "jdbc:derby://localhost:1527/pizza404";
    private final String name = "boot";
    private final String pass = "boot";
    
    public void Derby(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection(sql,name,pass);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
