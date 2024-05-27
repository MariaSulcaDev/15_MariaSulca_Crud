/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package config;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class Conexion {

    Connection con;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/persona?characterEncoding=UTF-8", "root", "admin");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error conexion " + e);
        }
    }

    public Connection getConnection() {
        return con;
    }
}
