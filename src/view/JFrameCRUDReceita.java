
package view;

import java.awt.event.WindowEvent;
import model.Receita;

public class JFrameCRUDReceita extends javax.swing.JFrame {
    
    private Receita receita;//objeto da tabela
    private boolean disconnectOnClose;//desconectar do banco ao fechar a janela

    public JFrameCRUDReceita(Receita receita, boolean disconnectOnClose) {
        initComponents();
        
        if( receita == null){
            this.receita = new Receita();
        } else{
            this.receita = receita;
            dataUp();//levar os dados para janela
        }
        
        this.disconnectOnClose = disconnectOnClose;
    }
    
    private void checkInput(){
        
    }
    
    private void dataDown(){
        //data.setter TRAZER OS DADOS DA JANELA PARA O OBJETO
        receita.setCodigoReceita(Integer.parseInt(jTextFieldID.getText() ) );
        receita.setNomeMedico(jTextFieldNomeMedico.getText());
        receita.setCrm(jTextFieldCrm.getText());
        receita.setCor(jTextFieldCor.getText()  );
        //receita.setProduto(Integer.parseInt(jTextFieldIDProduto.getText() ) );       
    }
    
    private void dataUp(){
        //data.getter LEVAR OS DADOS DO OBJETO PARA A JANELA
        jTextFieldID.setText(String.valueOf(receita.getCodigoReceita()) );
        jTextFieldNomeMedico.setText(receita.getNomeMedico());
        jTextFieldCrm.setText(receita.getCrm());
        jTextFieldCor.setText(receita.getCor()  );
        jTextFieldIDProduto.setText(String.valueOf(receita.getProduto() )  );
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelNomeMedico = new javax.swing.JLabel();
        jTextFieldNomeMedico = new javax.swing.JTextField();
        jLabelCrm = new javax.swing.JLabel();
        jTextFieldCrm = new javax.swing.JTextField();
        jLabelCor = new javax.swing.JLabel();
        jTextFieldCor = new javax.swing.JTextField();
        jLabelIDProduto = new javax.swing.JLabel();
        jTextFieldIDProduto = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelID.setText("ID:");

        jLabelNomeMedico.setText("Nome do médico:");

        jLabelCrm.setText("CRM:");

        jLabelCor.setText("Cor:");

        jLabelIDProduto.setText("ID produto:");

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
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNomeMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeMedico))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelIDProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCrm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabelCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 8, Short.MAX_VALUE)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSalvar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeMedico)
                    .addComponent(jTextFieldNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCrm)
                    .addComponent(jTextFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCor)
                    .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDProduto)
                    .addComponent(jTextFieldIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
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
            receita.delete();
            this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING));
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try{
            checkInput();
            dataDown();
            receita.save();
            //evento para fechar a janela ao clicar "Salvar"
            this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING));
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
                if( this.disconnectOnClose ){
                    receita.disconnectFromDatabase();
                }
            } catch (Exception ex){
                ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelCrm;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIDProduto;
    private javax.swing.JLabel jLabelNomeMedico;
    private javax.swing.JTextField jTextFieldCor;
    private javax.swing.JTextField jTextFieldCrm;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldIDProduto;
    private javax.swing.JTextField jTextFieldNomeMedico;
    // End of variables declaration//GEN-END:variables
}
