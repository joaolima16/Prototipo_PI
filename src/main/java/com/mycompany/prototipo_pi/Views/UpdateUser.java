package com.mycompany.prototipo_pi.Views;

import com.mycompany.prototipo_pi.DAO.UserDAO;
import com.mycompany.prototipo_pi.Models.Usuario;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

public final class UpdateUser extends javax.swing.JFrame {

    UserDAO userDao = new UserDAO();
    private String cpf;

    public UpdateUser() {
        initComponents();
        // showInformations("4141");
        this.cpf = "4141";
    }

    public UpdateUser(String cpf) {
        initComponents();
        this.setLocationRelativeTo(null);
        // showInformations(cpf);
        this.cpf = cpf;
    }

    ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JtfNome = new javax.swing.JTextField();
        JtfCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JtfEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JtfTel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JtfData = new javax.swing.JFormattedTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        JtbMasc = new javax.swing.JRadioButton();
        JtbFem = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        JtfTel1 = new javax.swing.JTextField();
        JtfTel2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JtfTel3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        JtfNome.setBackground(new java.awt.Color(153, 153, 153));
        JtfNome.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtfNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JtfNomeFocusGained(evt);
            }
        });
        JtfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfNomeKeyTyped(evt);
            }
        });

        JtfCpf.setBackground(new java.awt.Color(153, 153, 153));
        JtfCpf.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtfCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfCpfKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        JtfEmail.setBackground(new java.awt.Color(153, 153, 153));
        JtfEmail.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefone");

        JtfTel.setBackground(new java.awt.Color(153, 153, 153));
        JtfTel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtfTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfTelKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data de nascimento no formato: yyyy/MM/dd");

        JtfData.setBackground(new java.awt.Color(153, 153, 153));
        try {
            JtfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jToggleButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jToggleButton1.setText("Atualizar dados");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CPF");

        JtbMasc.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(JtbMasc);
        JtbMasc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtbMasc.setForeground(new java.awt.Color(255, 255, 255));
        JtbMasc.setText("M");

        JtbFem.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(JtbFem);
        JtbFem.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtbFem.setForeground(new java.awt.Color(255, 255, 255));
        JtbFem.setText("F");

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Solteiro");

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Casado");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Logradouro");

        JtfTel1.setBackground(new java.awt.Color(153, 153, 153));
        JtfTel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtfTel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfTel1KeyTyped(evt);
            }
        });

        JtfTel2.setBackground(new java.awt.Color(153, 153, 153));
        JtfTel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtfTel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfTel2KeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rua");

        JtfTel3.setBackground(new java.awt.Color(153, 153, 153));
        JtfTel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtfTel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfTel3KeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nº");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JtfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                        .addComponent(JtfCpf)
                        .addComponent(JtfEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JtbMasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JtbFem)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                        .addComponent(JtfTel2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JtfData, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JtfTel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JtfTel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JtfTel, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtfData, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfTel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(JtfTel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(JtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(JtfTel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JtbFem)
                        .addComponent(JtbMasc))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)))
                .addGap(32, 32, 32)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel1.setText("Informações do usuário");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        boolean _updateUser = updateUser();
        if (_updateUser == true) {
            JOptionPane.showMessageDialog(null, "Dados atualizados");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar os dados");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void JtfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfNomeKeyTyped
        JTextField textField = (JTextField) evt.getSource();
        String text = textField.getText();
        int limite = 30;

        if (text.length() >= limite) {
            evt.consume();
        }
    }//GEN-LAST:event_JtfNomeKeyTyped

    private void JtfNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfNomeFocusGained
        JTextField textField = (JTextField) evt.getSource();
        PlainDocument document = (PlainDocument) textField.getDocument();
        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (!string.matches(".*\\d.*")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (!text.matches(".*\\d.*")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
    }//GEN-LAST:event_JtfNomeFocusGained

    private void JtfCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfCpfKeyTyped
        char c = evt.getKeyChar();
        JTextField textField = (JTextField) evt.getSource();
        String text = textField.getText();
        int limite = 11;

        if (text.length() >= limite) {
            evt.consume();
        }
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_JtfCpfKeyTyped

    private void JtfTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfTelKeyTyped
        char c = evt.getKeyChar();
        JTextField textField = (JTextField) evt.getSource();
        String text = textField.getText();
        int limite = 12;
        if (text.length() >= limite) {
            evt.consume();
        }
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_JtfTelKeyTyped

    private void JtfTel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfTel1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfTel1KeyTyped

    private void JtfTel2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfTel2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfTel2KeyTyped

    private void JtfTel3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfTel3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfTel3KeyTyped

    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUser().setVisible(true);
            }
        });
    }

    public void showInformations(String cpf) throws SQLException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        ResultSet rs = userDao.findUser(cpf);
        JtfNome.setText(rs.getString(2));
        JtfSenha.setText(rs.getString(3));
        JtfCpf.setText(rs.getString(4));
        JtfEmail.setText(rs.getString(5));
        JtfTel.setText(rs.getString(7));
        JtfData.setText(rs.getDate(8).toString());

        if (rs.getString(6).equalsIgnoreCase("F")) {
            JtbFem.setSelected(true);
        }
    }

    public boolean updateUser() {
        Usuario user = new Usuario();
        user.setNome(JtfNome.getText());
        user.setCpf(JtfCpf.getText());
        user.setEmail(JtfEmail.getText());
        user.setTelefone(JtfTel.getText());
        user.setDataNascimento(JtfData.getText());
        boolean _user = userDao.updateUser(user, this.cpf);
        return _user;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JtbFem;
    private javax.swing.JRadioButton JtbMasc;
    private javax.swing.JTextField JtfCpf;
    private javax.swing.JFormattedTextField JtfData;
    private javax.swing.JTextField JtfEmail;
    private javax.swing.JTextField JtfNome;
    private javax.swing.JTextField JtfTel;
    private javax.swing.JTextField JtfTel1;
    private javax.swing.JTextField JtfTel2;
    private javax.swing.JTextField JtfTel3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
