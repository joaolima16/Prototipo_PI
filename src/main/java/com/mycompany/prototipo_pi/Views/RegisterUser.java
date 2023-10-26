package com.mycompany.prototipo_pi.Views;

import com.mycompany.prototipo_pi.DAO.UserDAO;
import com.mycompany.prototipo_pi.Models.Usuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

public class RegisterUser extends javax.swing.JFrame {

    private String sexo = "";
    private String estado = "";

    public RegisterUser() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonGroup9 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        JtfNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JtfCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JtfEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JtfTel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JbnCadastro = new javax.swing.JButton();
        jrbMasc = new javax.swing.JRadioButton();
        jrbFem = new javax.swing.JRadioButton();
        JtfData = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfSolt = new javax.swing.JRadioButton();
        jtfCas = new javax.swing.JRadioButton();
        JtfTel1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JtfTel2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JtfTel3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JtfTel4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setName("Registrar Usuário"); // NOI18N

        JtfNome.setBackground(new java.awt.Color(153, 153, 153));
        JtfNome.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtfNome.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");

        JtfCpf.setBackground(new java.awt.Color(153, 153, 153));
        JtfCpf.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtfCpf.setForeground(new java.awt.Color(255, 255, 255));
        JtfCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfCpfKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF");

        JtfEmail.setBackground(new java.awt.Color(153, 153, 153));
        JtfEmail.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtfEmail.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");

        JtfTel.setBackground(new java.awt.Color(153, 153, 153));
        JtfTel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtfTel.setForeground(new java.awt.Color(255, 255, 255));
        JtfTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfTelKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone");

        JbnCadastro.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        JbnCadastro.setText("Cadastrar");
        JbnCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JbnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbnCadastroActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbMasc);
        jrbMasc.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jrbMasc.setForeground(new java.awt.Color(255, 255, 255));
        jrbMasc.setText("M");

        buttonGroup1.add(jrbFem);
        jrbFem.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jrbFem.setForeground(new java.awt.Color(255, 255, 255));
        jrbFem.setText("F");

        JtfData.setBackground(new java.awt.Color(153, 153, 153));
        JtfData.setForeground(new java.awt.Color(255, 255, 255));
        try {
            JtfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JtfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfDataActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data de nascimento Formato: YYYY/MM/dd");

        jPanel3.setBackground(new java.awt.Color(204, 204, 0));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Registrar Usuário");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(25, 25, 25))
        );

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado civil");

        buttonGroup9.add(jtfSolt);
        jtfSolt.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jtfSolt.setForeground(new java.awt.Color(255, 255, 255));
        jtfSolt.setText("Solteiro");

        buttonGroup9.add(jtfCas);
        jtfCas.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jtfCas.setForeground(new java.awt.Color(255, 255, 255));
        jtfCas.setText("Casado");

        JtfTel1.setBackground(new java.awt.Color(153, 153, 153));
        JtfTel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtfTel1.setForeground(new java.awt.Color(255, 255, 255));
        JtfTel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfTel1KeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cidade");

        JtfTel2.setBackground(new java.awt.Color(153, 153, 153));
        JtfTel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtfTel2.setForeground(new java.awt.Color(255, 255, 255));
        JtfTel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfTel2KeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Rua");

        JtfTel3.setBackground(new java.awt.Color(153, 153, 153));
        JtfTel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtfTel3.setForeground(new java.awt.Color(255, 255, 255));
        JtfTel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfTel3KeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nº");

        JtfTel4.setBackground(new java.awt.Color(153, 153, 153));
        JtfTel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JtfTel4.setForeground(new java.awt.Color(255, 255, 255));
        JtfTel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfTel4KeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Logradouro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtfTel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbMasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbFem))
                            .addComponent(jLabel6)
                            .addComponent(JtfTel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfTel4, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfSolt)
                                .addGap(18, 18, 18)
                                .addComponent(jtfCas))
                            .addComponent(JbnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(JtfData, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtfTel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JtfCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtfTel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JtfData, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JtfTel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JtfTel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JtfTel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbFem)
                            .addComponent(jrbMasc)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfSolt)
                            .addComponent(jtfCas))))
                .addGap(39, 39, 39)
                .addComponent(JbnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean ValidarCampos() {
        if (JtfEmail.getText().equals("") || JtfCpf.getText().equals("")
                || JtfTel.getText().equals("") || JtfNome.getText().equals("")
                || JtfData.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Para realizar o cadastro preencha todos os campos");
            return false;

        } 
        } else if (JtfCpf.getText().length() < 11) {
            JOptionPane.showMessageDialog(null, "O CPF Precisa ter 11 digitos");
            return false;
        }
        return true;
    }

    private void JbnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbnCadastroActionPerformed
        boolean validarDados = ValidarCampos();
        if (validarDados == true) {
            // cadastrarUsuario();
            cadastrarUsuarioTabela();
        }

    }//GEN-LAST:event_JbnCadastroActionPerformed
    private void cadastrarUsuarioTabela() {

        if (jrbFem.isSelected()) {
            sexo = "F";
        } else {
            sexo = "M";
        }
        if(jtfSolt.isSelected()){
            estado = "solteiro";
        }
        else{
            estado =  "casado";
        }
        
        Usuario user = new Usuario(JtfNome.getText(),
                JtfCpf.getText(),
                JtfTel.getText(),
                JtfEmail.getText(),
                sexo,
                JtfData.getText(),
                estado
        );
        Clients clientForm = new Clients(user);
        clientForm.setVisible(true);
        this.dispose();
    }
    private void JtfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfDataActionPerformed

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
        if(text.length() >=limite){
            evt.consume();
        }
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_JtfTelKeyTyped

    private void JtfNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfNomeFocusGained
        JTextField textField = (JTextField) evt.getSource();
        PlainDocument document = (PlainDocument) textField.getDocument();
        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (!string.matches(".*\\d.*")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (!text.matches(".*\\d.*")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
    }//GEN-LAST:event_JtfNomeFocusGained

    private void JtfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfNomeKeyTyped
        JTextField textField = (JTextField) evt.getSource();
        String text = textField.getText();
        int limite = 30;

        if (text.length() >= limite) {
            evt.consume();
        }
    }//GEN-LAST:event_JtfNomeKeyTyped

    private void JtfTel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfTel1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfTel1KeyTyped

    private void JtfTel2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfTel2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfTel2KeyTyped

    private void JtfTel3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfTel3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfTel3KeyTyped

    private void JtfTel4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfTel4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfTel4KeyTyped
    private void cadastrarUsuario() {
        try {
            if (jrbFem.isSelected()) {
                sexo = "F";
            } else {
                sexo = "M";
            }
            if(jtfCas.isSelected()){
                estado = "Casado";
            }
            else{
                estado  = "Solteiro";
            }
            UserDAO userDao = new UserDAO();
            Usuario user = new Usuario(JtfNome.getText(),
                    JtfCpf.getText(),
                    JtfTel.getText(),
                    JtfEmail.getText(),
                    sexo,
        JtfData.getText(),
                  
                    estado
            );

            Usuario userdao = userDao.addUser(user);

            if (userdao != null) {
                JOptionPane.showMessageDialog(null, "Usuário cadastrado");
                UpdateUser userUpdate = new UpdateUser(JtfCpf.getText());
                userUpdate.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário já possui cadastro na plataforma");
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbnCadastro;
    private javax.swing.JTextField JtfCpf;
    private javax.swing.JFormattedTextField JtfData;
    private javax.swing.JTextField JtfEmail;
    private javax.swing.JTextField JtfNome;
    private javax.swing.JTextField JtfTel;
    private javax.swing.JTextField JtfTel1;
    private javax.swing.JTextField JtfTel2;
    private javax.swing.JTextField JtfTel3;
    private javax.swing.JTextField JtfTel4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbFem;
    private javax.swing.JRadioButton jrbMasc;
    private javax.swing.JRadioButton jtfCas;
    private javax.swing.JRadioButton jtfSolt;
    // End of variables declaration//GEN-END:variables
}
