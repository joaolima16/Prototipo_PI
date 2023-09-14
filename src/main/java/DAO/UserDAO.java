
package DAO;

import DBConnection.ConnectionDB;
import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    public User addUser(User user){
         try(Connection conn = ConnectionDB.connDB()){
             String sql = "INSERT INTO cliente VALUES(joao,13313131,joao@teste,M,31311,30/11/2004)";
             PreparedStatement pstmt = conn.prepareStatement(sql);
             pstmt.executeUpdate();
             System.out.println("Registrado!");
         }
         catch(SQLException ex){
             throw new Error(ex);
         }
        return null;
    };
}

