package DAO;

import DBConnection.ConnectionDB;
import Models.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public User addUser(User user) {

        try {
            ResultSet userExists = findUser(user.getCpf());
            if (userExists == null) {
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
            } else {
                return null;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

    ;
    public ResultSet findUser(String cpf) {
        try {
            String sql = "SELECT * FROM cliente WHERE cpf=?";
            PreparedStatement stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs;
            }
            return null;
        } catch (SQLException ex) {
            throw new Error(ex.getMessage());
        }
    }

    ;
   public boolean updateUser(User user, String cpf) {
        try {
            String sql = "UPDATE cliente SET nome =?,cpf =?,email =?,telefone =?,dataNascimento =? WHERE cpf = ?";
            PreparedStatement stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getCpf());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getTelefone());
            stmt.setDate(5, java.sql.Date.valueOf(user.getDataNascimento()));
            stmt.setString(6, cpf);
            stmt.executeUpdate();
            System.out.println("Usuário atualizado");
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

    }
}
