package com.mycompany.prototipo_pi.Views;

import com.mycompany.prototipo_pi.DAO.UserDAO;
import com.mycompany.prototipo_pi.Models.User;
import com.mycompany.prototipo_pi.Models.userTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Clients extends javax.swing.JFrame {

    Products productForm = new Products();
    userTableModel _userTableModel = new userTableModel();
    UserDAO _userDao = new UserDAO();

    public Clients() {
        initComponents();
        jtUsuarios.setModel(_userTableModel);
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JtfBusca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuarios = new javax.swing.JTable();
        jBtnExc = new javax.swing.JButton();
        jBtnAdd = new javax.swing.JButton();
        jBtnAlt = new javax.swing.JButton();
        jbtnList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        JtfBusca.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Lista De Clientes");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(296, 296, 296))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(JtfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JtfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jtUsuarios.setBackground(new java.awt.Color(51, 51, 51));
        jtUsuarios.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jtUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jtUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(jtUsuarios);

        jBtnExc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnExc.setText("Excluir");
        jBtnExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcActionPerformed(evt);
            }
        });

        jBtnAdd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnAdd.setText("Inserir");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        jBtnAlt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnAlt.setText("Alterar");
        jBtnAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAltActionPerformed(evt);
            }
        });

        jbtnList.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jbtnList.setText("Lista de produtos");
        jbtnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnExc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnList, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnExc)
                    .addComponent(jBtnAdd)
                    .addComponent(jBtnAlt)
                    .addComponent(jbtnList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void fillTable() {
        ResultSet rs = _userDao.findUsers();
        try {
            while (rs.next()) {
                User _user = new User();
                _user.setNome(rs.getString(2));
                _user.setCpf(rs.getString(3));
                _user.setEmail(rs.getString(4));
                _user.setTelefone(rs.getString(5));
                _user.setDataNascimento(rs.getDate(6));
                _userTableModel.addRow(_user);
            }
        } catch (SQLException ex) {
            throw new Error(ex);
        }
    }
    private void jBtnExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcActionPerformed
        if (jtUsuarios.getSelectedRow() != -1) {
            _userTableModel.removeRow(jtUsuarios.getSelectedRow());

        }
    }//GEN-LAST:event_jBtnExcActionPerformed

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        Register registerForm = new Register();
        registerForm.setVisible(true);
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jBtnAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAltActionPerformed
        if (jtUsuarios.getSelectedRow() != -1) {
            Object cpf = _userTableModel.getValueAt(jtUsuarios.getSelectedRow(), 1);
            Update updateUserForm = new Update(cpf.toString());
            updateUserForm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jBtnAltActionPerformed

    private void jbtnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnListActionPerformed
        productForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnListActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        filterUsers();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void filterUsers() {
        ResultSet rs = _userDao.findUsersForNameOrCpf(JtfBusca.getText());
        clearTable();
        try {
            while (rs.next()) {
                 User _user = new User();
                _user.setNome(rs.getString(2));
                _user.setCpf(rs.getString(3));
                _user.setEmail(rs.getString(4));
                _user.setTelefone(rs.getString(5));
                _user.setDataNascimento(rs.getDate(6));
                _userTableModel.addRow(_user);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    private void clearTable() {
        int rowCount = _userTableModel.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            _userTableModel.removeRow(i);
        }
    }

    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtfBusca;
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnAlt;
    private javax.swing.JButton jBtnExc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnList;
    private javax.swing.JTable jtUsuarios;
    // End of variables declaration//GEN-END:variables
}
