/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.LogTrack;



/**
 *
 * @author aluno
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    public JFramePrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuAdm = new javax.swing.JMenu();
        jMenuItemConsultaCategoria = new javax.swing.JMenuItem();
        jMenuConsultaProduto = new javax.swing.JMenuItem();
        jMenuItemConsultaReceita = new javax.swing.JMenuItem();
        jMenuItemConsultaTipoUsuario = new javax.swing.JMenuItem();
        jMenuItemConsultaUsuarios = new javax.swing.JMenuItem();
        jMenuItemConsultaVenda = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadastroCategoria = new javax.swing.JMenuItem();
        jMenuCadastroProduto = new javax.swing.JMenuItem();
        jMenuItemCadastroReceita = new javax.swing.JMenuItem();
        jMenuItemCadastroTipoUsuario = new javax.swing.JMenuItem();
        jMenuItemCadastroUsuarios = new javax.swing.JMenuItem();
        jMenuItemCadastroVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de Clínica Médica");

        jPanelLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );

        jMenuAdm.setText("Administrativo");

        jMenuItemConsultaCategoria.setText("Consulta Categoria");
        jMenuItemConsultaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaCategoriaActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemConsultaCategoria);

        jMenuConsultaProduto.setText("Consulta Produto");
        jMenuConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultaProdutoActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuConsultaProduto);

        jMenuItemConsultaReceita.setText("Consulta Receita");
        jMenuItemConsultaReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaReceitaActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemConsultaReceita);

        jMenuItemConsultaTipoUsuario.setText("Consulta Tipo Usuário");
        jMenuItemConsultaTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaTipoUsuarioActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemConsultaTipoUsuario);

        jMenuItemConsultaUsuarios.setText("Consulta Usuários");
        jMenuItemConsultaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaUsuariosActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemConsultaUsuarios);

        jMenuItemConsultaVenda.setText("Consulta Venda");
        jMenuItemConsultaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaVendaActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemConsultaVenda);
        jMenuAdm.add(jSeparator1);

        jMenuItemCadastroCategoria.setText("Cadastro Categoria");
        jMenuItemCadastroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroCategoriaActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemCadastroCategoria);

        jMenuCadastroProduto.setText("Cadastro Produto");
        jMenuCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroProdutoActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuCadastroProduto);

        jMenuItemCadastroReceita.setText("Cadastro Receita");
        jMenuItemCadastroReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroReceitaActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemCadastroReceita);

        jMenuItemCadastroTipoUsuario.setText("Cadastro Tipo Usuário");
        jMenuItemCadastroTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroTipoUsuarioActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemCadastroTipoUsuario);

        jMenuItemCadastroUsuarios.setText("Cadastro Usuários");
        jMenuItemCadastroUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroUsuariosActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemCadastroUsuarios);

        jMenuItemCadastroVenda.setText("Cadastro Venda");
        jMenuItemCadastroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroVendaActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemCadastroVenda);

        jMenuBar.add(jMenuAdm);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemConsultaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaCategoriaActionPerformed
        try{
            JFrameConsultaCategoria jFrameConsultaCategoria;
            jFrameConsultaCategoria = new JFrameConsultaCategoria(null ,false, true);
            jFrameConsultaCategoria.setVisible(true);
        } catch ( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemConsultaCategoriaActionPerformed

    private void jMenuItemCadastroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroCategoriaActionPerformed
        try{
            JFrameCRUDCategoria jFrameCRUDCategoria;
            jFrameCRUDCategoria = new JFrameCRUDCategoria(null,true);
            jFrameCRUDCategoria.setVisible(true);
        } catch ( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemCadastroCategoriaActionPerformed

    private void jMenuConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultaProdutoActionPerformed
        try{
            JFrameConsultaProduto jFrameConsultaProduto;
            jFrameConsultaProduto = new JFrameConsultaProduto(null,false, true);
            jFrameConsultaProduto.setVisible(true);
        } catch ( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuConsultaProdutoActionPerformed

    private void jMenuCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroProdutoActionPerformed
        try{
            JFrameCRUDProduto jFrameCRUDProduto;
            jFrameCRUDProduto = new JFrameCRUDProduto(null,true);
            jFrameCRUDProduto.setVisible(true);
        } catch ( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuCadastroProdutoActionPerformed

    private void jMenuItemCadastroUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroUsuariosActionPerformed
        try{
            JFrameCRUDUsuario jFrameCRUDUsuario;
            jFrameCRUDUsuario = new JFrameCRUDUsuario(null,true);
            jFrameCRUDUsuario.setVisible(true);
        } catch ( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemCadastroUsuariosActionPerformed

    private void jMenuItemConsultaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaUsuariosActionPerformed
        try{
            JFrameConsultaUsuario jFrameConsultaUsuario;
            jFrameConsultaUsuario = new JFrameConsultaUsuario(null,false, true);
            jFrameConsultaUsuario.setVisible(true);
        } catch ( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemConsultaUsuariosActionPerformed

    private void jMenuItemConsultaTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaTipoUsuarioActionPerformed
        try{
            JFrameConsultaTipo jFrameConsultaTipo;
            jFrameConsultaTipo = new JFrameConsultaTipo(null, false, true);
            jFrameConsultaTipo.setVisible(true);
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemConsultaTipoUsuarioActionPerformed

    private void jMenuItemCadastroTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroTipoUsuarioActionPerformed
        try{
            JFrameCRUDTipo jFrameCRUDTipo;
            jFrameCRUDTipo = new JFrameCRUDTipo(null, true);
            jFrameCRUDTipo.setVisible(true);
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemCadastroTipoUsuarioActionPerformed

    private void jMenuItemCadastroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroVendaActionPerformed
        try{
            JFrameCRUDVenda jFrameCRUDVenda;
            jFrameCRUDVenda = new JFrameCRUDVenda(null, true);
            jFrameCRUDVenda.setVisible(true);
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemCadastroVendaActionPerformed

    private void jMenuItemConsultaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaVendaActionPerformed
        try{
            JFrameConsultaVenda jFrameConsultaVenda;
            jFrameConsultaVenda = new JFrameConsultaVenda(null, false, true);
            jFrameConsultaVenda.setVisible(true);
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemConsultaVendaActionPerformed

    private void jMenuItemConsultaReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaReceitaActionPerformed
        try{
            JFrameConsultaReceita jFrameConsultaReceita;
            jFrameConsultaReceita = new JFrameConsultaReceita(null, false, true);
            jFrameConsultaReceita.setVisible(true);
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemConsultaReceitaActionPerformed

    private void jMenuItemCadastroReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroReceitaActionPerformed
        try{
            JFrameCRUDReceita jFrameCRUDReceita;
            jFrameCRUDReceita = new JFrameCRUDReceita(null, true);
            jFrameCRUDReceita.setVisible(true);
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemCadastroReceitaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAdm;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuCadastroProduto;
    private javax.swing.JMenuItem jMenuConsultaProduto;
    private javax.swing.JMenuItem jMenuItemCadastroCategoria;
    private javax.swing.JMenuItem jMenuItemCadastroReceita;
    private javax.swing.JMenuItem jMenuItemCadastroTipoUsuario;
    private javax.swing.JMenuItem jMenuItemCadastroUsuarios;
    private javax.swing.JMenuItem jMenuItemCadastroVenda;
    private javax.swing.JMenuItem jMenuItemConsultaCategoria;
    private javax.swing.JMenuItem jMenuItemConsultaReceita;
    private javax.swing.JMenuItem jMenuItemConsultaTipoUsuario;
    private javax.swing.JMenuItem jMenuItemConsultaUsuarios;
    private javax.swing.JMenuItem jMenuItemConsultaVenda;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
