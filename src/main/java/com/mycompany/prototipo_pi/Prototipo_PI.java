/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prototipo_pi;

import DBConnection.ConnectionDB;
import java.sql.SQLException;

/**
 *
 * @author João Vitor
 */
public class Prototipo_PI {

    public static void main(String[] args) throws SQLException {
        ConnectionDB connTeste = new ConnectionDB();
        connTeste.createTables();
    }
}
