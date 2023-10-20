package com.mycompany.prototipo_pi.Models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class productTableModel extends AbstractTableModel {

    private List<Produto> produtos = new ArrayList<>();
    private String[] colunas = {"Nome", "Marca", "Tamanho", "Estoque"};

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
         switch (coluna) {
            case 0:
                 produtos.get(linha).setNome((String)valor);
                 break;
            case 1:
                 produtos.get(linha).setMarca((String)valor);
                 break;
            case 2:
                 produtos.get(linha).setTamanho(Integer.parseInt((String) valor));
                 break;
            case 3:
                produtos.get(linha).setEstoque(Integer.parseInt((String) valor));
                break;
        }
         this.fireTableRowsUpdated(linha, linha);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return produtos.get(rowIndex).getNome();
            case 1:
                return produtos.get(rowIndex).getMarca();
            case 2:
                return produtos.get(rowIndex).getTamanho();
            case 3:
                return produtos.get(rowIndex).getEstoque();
        }
        return null;
    }

    public void addRow(Produto produto) {
        this.produtos.add(produto);
        this.fireTableDataChanged();

    }

    public void removeRow(int row) {
        this.produtos.remove(row);
        this.fireTableRowsDeleted(row, row);
    }
}
