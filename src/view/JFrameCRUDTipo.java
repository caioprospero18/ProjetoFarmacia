
package view;

import controller.LogTrack;
import java.awt.event.WindowEvent;
import model.TipoUsuario;

public class JFrameCRUDTipo extends javax.swing.JFrame {

    private TipoUsuario tipo;//objeto da tabela
    private boolean disconnectOnClose;//desconectar do banco ao fechar a janela
    
    public JFrameCRUDTipo(TipoUsuario tipo, boolean disconnectOnClose) {
        initComponents();
        
        if( tipo == null){
            this.tipo = new TipoUsuario();
        } else{
            this.tipo = tipo;
            dataUp();//levar os dados para janela
        }
        
        this.disconnectOnClose = disconnectOnClose;
    
    }
    
    private void checkInput() throws Exception{
        if (jTextFieldID.getText().isEmpty()){
            throw new Exception("Informe ID");
        }
        
        if( !jTextFieldID.getText().isEmpty() &&
                !jTextFieldID.getText().matches("\\d+") )
                    throw new Exception("O campo ID precisa ser um número.");
        
        if (jTextFieldNome.getText().isEmpty()){
            throw new Exception("Informe Nome");
        }
    }

    private void dataDown(){
        //data.setter TRAZER OS DADOS DA JANELA PARA O OBJETO
        tipo.setCodigoTipo(Integer.parseInt(jTextFieldID.getText() ) );
        tipo.setNome(jTextFieldNome.getText());    
        if( jCheckBoxAdministrativo.isSelected() ) {
            tipo.setModuloAdministrativo("S");
        } else {
            tipo.setModuloAdministrativo("N");
        }
        
        if( jCheckBoxVendas.isSelected() ) {
            tipo.setModuloVenda("S");
        } else {
            tipo.setModuloVenda("N");
        }
        
        if( jCheckBoxCadastroReceita.isSelected() ) {
            tipo.setModuloCadastrarReceita("S");
        } else {
            tipo.setModuloCadastrarReceita("N");
        }
    }
    
    private void dataUp(){
        //data.getter LEVAR OS DADOS DO OBJETO PARA A JANELA
        jTextFieldID.setText(String.valueOf(tipo.getCodigoTipo()) );
        jTextFieldNome.setText(tipo.getNome());
        if( ( tipo.getModuloAdministrativo() != null ) &&
            ( tipo.getModuloAdministrativo().equals("S") ) ) {
                jCheckBoxAdministrativo.setSelected( true );
        } else {
            jCheckBoxAdministrativo.setSelected( false );
        }
        
        if( ( tipo.getModuloVenda()!= null ) &&
            ( tipo.getModuloVenda().equals("S") ) ) {
                jCheckBoxVendas.setSelected( true );
        } else {
            jCheckBoxVendas.setSelected( false );
        }
        
        if( ( tipo.getModuloCadastrarReceita()!= null ) &&
            ( tipo.getModuloCadastrarReceita().equals("S") ) ) {
                jCheckBoxCadastroReceita.setSelected( true );
        } else {
            jCheckBoxCadastroReceita.setSelected( false );
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jCheckBoxAdministrativo = new javax.swing.JCheckBox();
        jCheckBoxVendas = new javax.swing.JCheckBox();
        jCheckBoxCadastroReceita = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelID.setText("ID:");

        jLabelNome.setText("Nome:");

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jCheckBoxAdministrativo.setText("Administrativo");

        jCheckBoxVendas.setText("Vendas");

        jCheckBoxCadastroReceita.setText("Cadastro de receitas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBoxAdministrativo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCheckBoxVendas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jCheckBoxCadastroReceita)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNome)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxAdministrativo)
                    .addComponent(jCheckBoxVendas)
                    .addComponent(jCheckBoxCadastroReceita))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try{
            checkInput();
            dataDown();
            tipo.delete();
            this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING));
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try{
            checkInput();
            dataDown();
            tipo.save();
            //evento para fechar a janela ao clicar "Salvar"
            this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING));
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
                if( this.disconnectOnClose ){
                    tipo.disconnectFromDatabase();
                }
            } catch (Exception ex){
                LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_formWindowClosing



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxAdministrativo;
    private javax.swing.JCheckBox jCheckBoxCadastroReceita;
    private javax.swing.JCheckBox jCheckBoxVendas;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
