package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {

    public static Connection connDB() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/pi", "root", "");
            System.out.println("Conectado");
        } catch (ClassNotFoundException ex) {
            throw new Error(ex);
        }
        return conn;
    }

    public void createTables() throws SQLException {
        Statement stmt = connDB().createStatement();

        String tableUsers = """
                    CREATE TABLE IF NOT EXISTS cliente (
                    codigoCliente INT AUTO_INCREMENT NOT NULL, nome VARCHAR(60), senha VARCHAR(50), cpf  CHAR(11) UNIQUE,
                    email VARCHAR(100),sexo ENUM('M','F'),estado_civil ENUM('casado','solteiro'), telefone CHAR(11) NOT NULL, dataNascimento DATE
                    CONSTRAINT pk1 PRIMARY KEY (codigoCliente)
                            );""";
        String tableAdress = """
                        CREATE TABLE IF NOT EXISTS endereco (
                        id INT AUTO_INCREMENT NOT NULL, logradouro VARCHAR(50) NOT NULL, numero VARCHAR(8), bairro VARCHAR(50), 
                        cep CHAR(8), cidade VARCHAR(20), 
                        CONSTRAINT pk1 PRIMARY KEY(id),
                        id_cliente INTEGER NOT REFERENCES cliente(codigoCliente)     
                             );
                             """;
        String tableProducts = """
                        CREATE TABLE IF NOT EXISTS produto (
                        codigoProduto INT AUTO_INCREMENT NOT NULL,
                        nome_produto VARCHAR(50), 
                        marca VARCHAR(20),
                        estoque INTEGER(10), 
                        preco DECIMAL(10,4)
                        
                               )
                               """;
        stmt.executeUpdate(tableUsers);
        stmt.executeUpdate(tableAdress);
        System.out.println("Tabela criada");
    }
;
}
