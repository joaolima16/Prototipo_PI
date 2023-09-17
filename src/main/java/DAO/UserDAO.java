
package DAO;

import DBConnection.ConnectionDB;
import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserDAO {
    public User addUser(User user){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();     
         try{
             String sql = "INSERT INTO cliente(nome,cpf,email,sexo,telefone,dataNascimento) VALUES(?,?,?,?,?,?)";
             
             PreparedStatement pstmt = ConnectionDB.connDB().prepareStatement(sql);
             pstmt.setString(1, user.getNome());
             pstmt.setString(2, user.getCpf());
             pstmt.setString(3, user.getEmail());
             pstmt.setString(4, user.getSexo());
             pstmt.setString(5, user.getTelefone());
             pstmt.setDate(6, java.sql.Date.valueOf("2022-05-23"));
             pstmt.executeUpdate();
             System.out.println("Registrado!");
         }
         catch(SQLException ex){
             System.out.println(ex);
         }
        return null;
    };
}

