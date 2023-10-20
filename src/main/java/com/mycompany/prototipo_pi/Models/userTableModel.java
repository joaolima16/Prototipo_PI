package com.mycompany.prototipo_pi.Models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class userTableModel extends AbstractTableModel {
    private List<Usuario> usuarios = new ArrayList<>();
    private String[] colunas =  {"Nome", "CPF", "Email","Telefone", "Data de nascimento"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    

    @Override
    public int getRowCount(){
        return usuarios.size();
    }
    @Override
    public int getColumnCount(){
        return colunas.length;
        
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
    switch(columnIndex){
        case 0:
            return usuarios.get(rowIndex).getNome();
        case 1:
            return usuarios.get(rowIndex).getCpf();
        case 2:
            return usuarios.get(rowIndex).getEmail();
        case 3:
            return usuarios.get(rowIndex).getTelefone();
        case 4:
            return usuarios.get(rowIndex).getDataNascimento();
    }
    return null;
   }
    public void addRow(Usuario user ){
        this.usuarios.add(user);
        this.fireTableDataChanged();
    
    }
    public void removeRow(int row){
        this.usuarios.remove(row);
        this.fireTableRowsDeleted(row, row);
    }
}