package examen1_rodrigovelasquez;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    Usuario us = new Usuario();

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jl_nombre = new javax.swing.JLabel();
        jl_apellido = new javax.swing.JLabel();
        jl_user = new javax.swing.JLabel();
        jl_correo = new javax.swing.JLabel();
        jl_password = new javax.swing.JLabel();
        jl_edad = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_usuario = new javax.swing.JTextField();
        tf_correo = new javax.swing.JTextField();
        tf_password = new javax.swing.JTextField();
        tf_edad = new javax.swing.JTextField();
        jb_register = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        pf_contrasena_log = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_user_log = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jb_log_in = new javax.swing.JButton();
        jDialog3 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_comandos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_instrucciones = new javax.swing.JTextArea();
        jb_enviar_comandos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jb_registrar = new javax.swing.JButton();
        jb_login = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("REGISTRO");

        jl_nombre.setText("Nombre");

        jl_apellido.setText("Apellido");

        jl_user.setText("Usuario");

        jl_correo.setText("Correo");

        jl_password.setText("Contraseña");

        jl_edad.setText("Edad");

        jb_register.setText("Registrar");
        jb_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_register)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jDialog1Layout.createSequentialGroup()
                                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jl_nombre)
                                        .addComponent(jl_apellido)
                                        .addComponent(jl_user)
                                        .addComponent(jl_correo))
                                    .addGap(28, 28, 28)
                                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_nombre)
                                        .addComponent(tf_apellido)
                                        .addComponent(tf_usuario)
                                        .addComponent(tf_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                                .addGroup(jDialog1Layout.createSequentialGroup()
                                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jl_password)
                                        .addComponent(jl_edad))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_password)
                                        .addGroup(jDialog1Layout.createSequentialGroup()
                                            .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 119, Short.MAX_VALUE))))))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(209, 209, 209)
                            .addComponent(jLabel2))))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombre)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_apellido)
                    .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_user)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_correo)
                    .addComponent(tf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_password)
                    .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_edad)
                    .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jb_register)
                .addGap(74, 74, 74))
        );

        jDialog2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Log In");
        jDialog2.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 25, -1, -1));
        jDialog2.getContentPane().add(pf_contrasena_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 180, -1));

        jLabel10.setText("Usuario");
        jDialog2.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel11.setText("Contraseña");
        jDialog2.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jDialog2.getContentPane().add(tf_user_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 180, -1));

        jb_log_in.setText("Iniciar Sesion");
        jb_log_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_log_inMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jb_log_in)
                .addGap(155, 155, 155))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(jb_log_in)
                .addContainerGap())
        );

        jDialog2.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 270));

        jDialog3.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta_comandos.setColumns(20);
        ta_comandos.setRows(5);
        jScrollPane1.setViewportView(ta_comandos);

        jDialog3.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 330, 110));

        ta_instrucciones.setColumns(20);
        ta_instrucciones.setRows(5);
        ta_instrucciones.setText("Lista de comandos:\nclases\natributos \nmetodos  \n\ncreate  \nmodify \ndelete ");
        jScrollPane2.setViewportView(ta_instrucciones);

        jDialog3.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 280, 210));

        jb_enviar_comandos.setText("Guardar");
        jb_enviar_comandos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_enviar_comandosMouseClicked(evt);
            }
        });
        jDialog3.getContentPane().add(jb_enviar_comandos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        jLabel3.setText("Ingrese comando");
        jDialog3.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jb_registrar.setText("Registrar");
        jb_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registrarMouseClicked(evt);
            }
        });
        getContentPane().add(jb_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jb_login.setText("Log In");
        jb_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_loginMouseClicked(evt);
            }
        });
        getContentPane().add(jb_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 70, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registrarMouseClicked
        jDialog1.pack();
        jDialog1.setModal(true);
        jDialog1.setLocationRelativeTo(this);
        jDialog1.setVisible(true);
        us.setNombre(tf_nombre.getText());
        us.setEdad(tf_edad.getText());
        us.setCorreo(tf_correo.getText());
        us.setNombre_usuario(tf_usuario.getText());
        us.setContrasena(tf_password.getText());
    }//GEN-LAST:event_jb_registrarMouseClicked

    private void jb_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_loginMouseClicked
        jDialog2.pack();
        jDialog2.setModal(true);
        jDialog2.setLocationRelativeTo(this);
        jDialog2.setVisible(true);
    }//GEN-LAST:event_jb_loginMouseClicked

    private void jb_log_inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_log_inMouseClicked
        String usuario_login = tf_user_log.getText();
        String contra_login = pf_contrasena_log.getText();

        if (usuario_login.equals(us.getNombre_usuario()) && contra_login.equals(us.getContrasena())) {
            jDialog3.pack();
            jDialog3.setModal(true);
            jDialog3.setLocationRelativeTo(this);
            jDialog3.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Datos invalidos!");
        }

    }//GEN-LAST:event_jb_log_inMouseClicked

    private void jb_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registerMouseClicked

        JOptionPane.showMessageDialog(this, "Registrado con exito!");
    }//GEN-LAST:event_jb_registerMouseClicked

    private void jb_enviar_comandosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_enviar_comandosMouseClicked
        String comando = ta_comandos.getText();
        try {
            switch (comando) {
                case "clases":
                    ta_comandos.setText("clases-");
                    break;
                case "atributos":
                    break;
                case "eliminar":
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Comando incorrecto!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Comando incorrecto!");
        }
    }//GEN-LAST:event_jb_enviar_comandosMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_enviar_comandos;
    private javax.swing.JButton jb_log_in;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_register;
    private javax.swing.JButton jb_registrar;
    private javax.swing.JLabel jl_apellido;
    private javax.swing.JLabel jl_correo;
    private javax.swing.JLabel jl_edad;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_password;
    private javax.swing.JLabel jl_user;
    private javax.swing.JPasswordField pf_contrasena_log;
    private javax.swing.JTextArea ta_comandos;
    private javax.swing.JTextArea ta_instrucciones;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_correo;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_user_log;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
ArrayList<Usuario> lista = new ArrayList<>();
}
