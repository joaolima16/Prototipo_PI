package com.mycompany.prototipo_pi;

import DBConnection.ConnectionDB;
import java.sql.SQLException;

public class Prototipo_PI {

    public static void main(String[] args) throws SQLException {
        ConnectionDB connTeste = new ConnectionDB();
        connTeste.createTables();
    }
}
