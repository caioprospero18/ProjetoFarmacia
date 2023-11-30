/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.LogTrack;
import model.Usuario;

public class JFramePrincipal extends javax.swing.JFrame {

    private Usuario usuario;
    
    
    public JFramePrincipal(Usuario usuario) {
        initComponents();
        
        jMenuUsuario.setText("Bem Vindo "+usuario.getNomeCompleto());
    }
    
    private void logout(){
        JFrameLogin jFrameLogin;
        jFrameLogin = new JFrameLogin();
        jFrameLogin.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRealizarVenda = new javax.swing.JButton();
        jButtonConsultarVendas = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuAdm = new javax.swing.JMenu();
        jMenuItemConsultaCategoria = new javax.swing.JMenuItem();
        jMenuConsultaProduto = new javax.swing.JMenuItem();
        jMenuItemConsultaReceita = new javax.swing.JMenuItem();
        jMenuItemConsultaTipoUsuario = new javax.swing.JMenuItem();
        jMenuItemConsultaUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadastroCategoria = new javax.swing.JMenuItem();
        jMenuCadastroProduto = new javax.swing.JMenuItem();
        jMenuItemCadastroReceita = new javax.swing.JMenuItem();
        jMenuItemCadastroTipoUsuario = new javax.swing.JMenuItem();
        jMenuItemCadastroUsuarios = new javax.swing.JMenuItem();
        jMenuUsuario = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal");

        jButtonRealizarVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonRealizarVenda.setText("Realizar venda");
        jButtonRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarVendaActionPerformed(evt);
            }
        });

        jButtonConsultarVendas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonConsultarVendas.setText("Consultar vendas realizadas");
        jButtonConsultarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarVendasActionPerformed(evt);
            }
        });

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

        jMenuBar.add(jMenuAdm);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemSair);

        jMenuBar.add(jMenuUsuario);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonConsultarVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRealizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jButtonRealizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButtonConsultarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        pack();
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

    private void jMenuConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultaProdutoActionPerformed
        try{
            JFrameConsultaProduto jFrameConsultaProduto;
            jFrameConsultaProduto = new JFrameConsultaProduto(null,false, true);
            jFrameConsultaProduto.setVisible(true);
        } catch ( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuConsultaProdutoActionPerformed

    private void jMenuItemConsultaReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaReceitaActionPerformed
        try{
            JFrameConsultaReceita jFrameConsultaReceita;
            jFrameConsultaReceita = new JFrameConsultaReceita(null, false, true);
            jFrameConsultaReceita.setVisible(true);
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemConsultaReceitaActionPerformed

    private void jMenuItemConsultaTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaTipoUsuarioActionPerformed
        try{
            JFrameConsultaTipo jFrameConsultaTipo;
            jFrameConsultaTipo = new JFrameConsultaTipo(null, false, true);
            jFrameConsultaTipo.setVisible(true);
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemConsultaTipoUsuarioActionPerformed

    private void jMenuItemConsultaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaUsuariosActionPerformed
        try{
            JFrameConsultaUsuario jFrameConsultaUsuario;
            jFrameConsultaUsuario = new JFrameConsultaUsuario(null,false, true);
            jFrameConsultaUsuario.setVisible(true);
        } catch ( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemConsultaUsuariosActionPerformed

    private void jMenuItemCadastroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroCategoriaActionPerformed
        try{
            JFrameCRUDCategoria jFrameCRUDCategoria;
            jFrameCRUDCategoria = new JFrameCRUDCategoria(null,true);
            jFrameCRUDCategoria.setVisible(true);
        } catch ( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemCadastroCategoriaActionPerformed

    private void jMenuCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroProdutoActionPerformed
        try{
            JFrameCRUDProduto jFrameCRUDProduto;
            jFrameCRUDProduto = new JFrameCRUDProduto(null,true);
            jFrameCRUDProduto.setVisible(true);
        } catch ( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuCadastroProdutoActionPerformed

    private void jMenuItemCadastroReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroReceitaActionPerformed
        try{
            JFrameCRUDReceita jFrameCRUDReceita;
            jFrameCRUDReceita = new JFrameCRUDReceita(null, true);
            jFrameCRUDReceita.setVisible(true);
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemCadastroReceitaActionPerformed

    private void jMenuItemCadastroTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroTipoUsuarioActionPerformed
        try{
            JFrameCRUDTipo jFrameCRUDTipo;
            jFrameCRUDTipo = new JFrameCRUDTipo(null, true);
            jFrameCRUDTipo.setVisible(true);
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemCadastroTipoUsuarioActionPerformed

    private void jMenuItemCadastroUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroUsuariosActionPerformed
        try{
            JFrameCRUDUsuario jFrameCRUDUsuario;
            jFrameCRUDUsuario = new JFrameCRUDUsuario(null,true);
            jFrameCRUDUsuario.setVisible(true);
        } catch ( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemCadastroUsuariosActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        logout();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButtonRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarVendaActionPerformed
        try{
            JFrameCRUDVenda jFrameCRUDVenda;
            jFrameCRUDVenda = new JFrameCRUDVenda(null, true);
            jFrameCRUDVenda.setVisible(true);
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jButtonRealizarVendaActionPerformed

    private void jButtonConsultarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarVendasActionPerformed
        try{
            JFrameConsultaVenda jFrameConsultaVenda;
            jFrameConsultaVenda = new JFrameConsultaVenda(null, false, true);
            jFrameConsultaVenda.setVisible(true);
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jButtonConsultarVendasActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            private Usuario usuario;
            public void run() {
                new JFramePrincipal(this.usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultarVendas;
    private javax.swing.JButton jButtonRealizarVenda;
    private javax.swing.JMenu jMenuAdm;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuCadastroProduto;
    private javax.swing.JMenuItem jMenuConsultaProduto;
    private javax.swing.JMenuItem jMenuItemCadastroCategoria;
    private javax.swing.JMenuItem jMenuItemCadastroReceita;
    private javax.swing.JMenuItem jMenuItemCadastroTipoUsuario;
    private javax.swing.JMenuItem jMenuItemCadastroUsuarios;
    private javax.swing.JMenuItem jMenuItemConsultaCategoria;
    private javax.swing.JMenuItem jMenuItemConsultaReceita;
    private javax.swing.JMenuItem jMenuItemConsultaTipoUsuario;
    private javax.swing.JMenuItem jMenuItemConsultaUsuarios;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuUsuario;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
