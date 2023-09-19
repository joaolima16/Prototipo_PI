
package DAO;

import DBConnection.ConnectionDB;
import Models.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public User addUser(User user){

         try{
             boolean _userExists = userExists(user.getCpf());
             if(_userExists != true){
                String sql = "INSERT INTO cliente(nome,cpf,email,sexo,telefone,dataNascimento) VALUES(?,?,?,?,?,?)";
                PreparedStatement pstmt = ConnectionDB.connDB().prepareStatement(sql);
                pstmt.setString(1, user.getNome());
                pstmt.setString(2, user.getCpf());
                pstmt.setString(3, user.getEmail());
                pstmt.setString(4, user.getSexo());
                pstmt.setString(5, user.getTelefone());
                pstmt.setDate(6, java.sql.Date.valueOf(user.getDataNascimento()));
                pstmt.executeUpdate();
                System.out.println("Registrado!");
                return user;
             }
    
         }
         catch(SQLException ex){
             System.out.println(ex.getMessage());
         }
        return null;
    };
    public boolean userExists(String cpf){
        try{
            String sql = "SELECT * FROM cliente WHERE CPF=?";
            PreparedStatement stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                return true;
            }
            return false;
        }
        catch(SQLException ex){
            throw new Error(ex.getMessage());
        }
    };
}

