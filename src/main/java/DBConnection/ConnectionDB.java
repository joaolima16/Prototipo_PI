package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author João Vitor
 */
public class ConnectionDB {
    public static Connection connDB() throws SQLException{
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/pi","root","");
            System.out.println("Conectado");
        }
        catch(ClassNotFoundException ex){
            throw new Error(ex);
        }
        return conn;
    }
    public void createTables() throws SQLException{
        Statement stmt = connDB().createStatement();
        
        String tableUsers = """
                    CREATE TABLE IF NOT EXISTS cliente (
                   id INT AUTO_INCREMENT PRIMARY KEY NOT NULL, nome VARCHAR(120), senha VARCHAR(50), cpf  VARCHAR(30) UNIQUE,
                   email VARCHAR(100),sexo ENUM('M','F'), telefone VARCHAR(50), dataNascimento DATE
                         );""";    
        stmt.executeUpdate(tableUsers);
        System.out.println("Tabela criada");
    };
}
