/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author João Vitor
 */
public class ConnectionDB {
    public Connection connDB() throws SQLException{
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/pi","root","");
            System.out.println("Conectado");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Erro ao criar conexão");
            System.out.println(ex);
        }
        return conn;
    }
}
