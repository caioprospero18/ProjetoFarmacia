
package view;

import controller.LogTrack;
import controller.ResultSetTableModel;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.CategoriaProduto;

public class JFrameConsultaCategoria extends javax.swing.JFrame {
    
    private CategoriaProduto categoria;//objeto da tabela
    private boolean select;//define se é uma janela de seleção
    private boolean disconnectOnClose;//desconectar do banco ao fechar a janela
    
    private String query = "SELECT codigo_categoria as ID, categoria as Categoria, desconto as Desconto FROM categoria_produto";
    private ResultSetTableModel result;//para trazer o resultado da query
    private final TableRowSorter< TableModel > filter;

    public JFrameConsultaCategoria(CategoriaProduto categoria, boolean select, boolean disconnectOnClose) throws SQLException {
        initComponents();
        
        this.categoria = categoria;
        this.select = select;
        jButtonSelecionar.setEnabled(this.select);
        this.disconnectOnClose = disconnectOnClose;
        
        result = new ResultSetTableModel(query);
        jTableConsulta.setModel(result);
        
        filter = new TableRowSorter< TableModel >( result );
        jTableConsulta.setRowSorter( filter ); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneConsulta = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();
        jLabelFiltro = new javax.swing.JLabel();
        jTextFieldFiltro = new javax.swing.JTextField();
        jButtonFiltrar = new javax.swing.JButton();
        jButtonSelecionar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de categorias dos produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneConsulta.setViewportView(jTableConsulta);

        jLabelFiltro.setText("Filtro:");

        jButtonFiltrar.setText("Filtrar");
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jButtonSelecionar.setText("Selecionar");
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelFiltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFiltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdicionar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPaneConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFiltro)
                    .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiltrar)
                    .addComponent(jButtonSelecionar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonAdicionar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        String filtro = jTextFieldFiltro.getText();
        if(filtro.isEmpty() ){
            filter.setRowFilter(null); // se filtro estiver vazio, passa um filtro nulo por padrão
        } else {
            filter.setRowFilter(RowFilter.regexFilter(filtro));
        }
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        int row = jTableConsulta.getSelectedRow();//pegar a linha que está selecionada na tabela
        
        if( row != -1){
            System.out.println("Selecionar");
            
            int codigo = (int) result.getValueAt(row, 0);
            
            this.categoria.setCodigoCategoria(codigo);
            
            try{
                this.categoria.load();
                this.dispatchEvent(new WindowEvent( this, WindowEvent.WINDOW_CLOSING ) );
            } catch ( Exception ex){
                LogTrack.getInstance().addException(ex, true, this);
            }
        }
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        int row = jTableConsulta.getSelectedRow();//pegar a linha que está selecionada na tabela
        
        if( row != -1){
            System.out.println("Alterar");
            
            int codigo = (int) result.getValueAt(row, 0);
            
            categoria = new CategoriaProduto();
            categoria.setCodigoCategoria(codigo);
            try{
                categoria.load();
                
                JFrameCRUDCategoria crud;
                crud = new JFrameCRUDCategoria(categoria/*já possui dados*/, false);
                
                crud.addWindowListener( new java.awt.event.WindowAdapter() {
            @Override
            //metodo para atualizar a tabela ao fechar a Janela CRUD
            public void windowClosed( java.awt.event.WindowEvent evt){
                System.out.println("Atualizar");
                try{
                    result.setQuery( query );
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
                crud.setVisible(true);
                                
            } catch (Exception ex){
                LogTrack.getInstance().addException(ex, true, this);
            }
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            if( this.disconnectOnClose ) {
                result.disconnectFromDatabase();
            }
        } catch ( Exception ex ) {
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        System.out.println("Adicionar");        
        //chamar a nova janela
        JFrameCRUDCategoria crud;
        crud = new JFrameCRUDCategoria(null/*janela de adicionar não tem dados para passar*/, false);
        crud.addWindowListener( new java.awt.event.WindowAdapter() {
            @Override
            //metodo para atualizar a tabela ao fechar a Janela CRUD
            public void windowClosed( java.awt.event.WindowEvent evt){
                System.out.println("Atualizar");
                try{
                    result.setQuery( query );
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        crud.setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameConsultaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                new JFrameConsultaCategoria(null, false, true).setVisible(true);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JLabel jLabelFiltro;
    private javax.swing.JScrollPane jScrollPaneConsulta;
    private javax.swing.JTable jTableConsulta;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
