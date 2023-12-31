
package view;

import controller.LogTrack;
import java.awt.Color;
import java.awt.event.WindowEvent;
import model.Produto;
import model.Receita;
import model.Usuario;

public class JFrameCRUDReceita extends javax.swing.JFrame {
    
    private Receita receita;//objeto da tabela
    private Produto remedio;
    private Usuario cliente;
    private boolean disconnectOnClose;//desconectar do banco ao fechar a janela

    public JFrameCRUDReceita(Receita receita, boolean disconnectOnClose) {
        initComponents();
        Color minhaCor = new Color(204, 255, 204);
        getContentPane().setBackground(minhaCor);
        
        if( receita == null){
            this.receita = new Receita();
        } else{
            this.receita = receita;
            dataUp();//levar os dados para janela
        }
        
        this.disconnectOnClose = disconnectOnClose;
    }
    
    private void checkInput() throws Exception{
        if( jTextFieldID.getText().isEmpty() ){
            throw new Exception("Informe o ID");
        } else {
            if (!jTextFieldID.getText().isEmpty()
                    && !jTextFieldID.getText().matches("\\d+")){
                throw new Exception("O campo ID deve ser um número.");
            }
        }
    }
    
    private void dataDown() throws Exception{
        //data.setter TRAZER OS DADOS DA JANELA PARA O OBJETO
        receita.setCodigoReceita(Integer.parseInt(jTextFieldID.getText() ) );
        receita.setNomeMedico(jTextFieldNomeMedico.getText());
        receita.setCrm(jTextFieldCrm.getText());
        receita.setCor(jTextFieldCor.getText()  );
        receita.setCliente(cliente);
        receita.setProduto(remedio);       
    }
    
    private void dataUp(){
        //data.getter LEVAR OS DADOS DO OBJETO PARA A JANELA
        jTextFieldID.setText(String.valueOf(receita.getCodigoReceita()) );
        jTextFieldNomeMedico.setText(receita.getNomeMedico());
        jTextFieldCrm.setText(receita.getCrm());
        jTextFieldCor.setText(receita.getCor()  );
        if(receita.getCliente().getNomeCompleto()!= null){
            jTextFieldRemedio.setText(receita.getCliente().getNomeCompleto());
        }
        if(receita.getProduto().getNomeProduto()!= null){
            jTextFieldRemedio.setText(receita.getProduto().getNomeProduto());
        }
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
        jLabelRemedio = new javax.swing.JLabel();
        jTextFieldRemedio = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSelecionarRemedio = new javax.swing.JButton();
        jButtonApagarRemedio = new javax.swing.JButton();
        jLabelCliente = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jButtonSelecionarCliente = new javax.swing.JButton();
        jButtonApagarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelID.setText("ID:");

        jLabelNomeMedico.setText("Nome do médico:");

        jLabelCrm.setText("CRM:");

        jLabelCor.setText("Cor:");

        jLabelRemedio.setText("Remédio:");

        jTextFieldRemedio.setEditable(false);

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

        jButtonSelecionarRemedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/search-icon.png"))); // NOI18N
        jButtonSelecionarRemedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarRemedioActionPerformed(evt);
            }
        });

        jButtonApagarRemedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/eraser-icon.png"))); // NOI18N
        jButtonApagarRemedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarRemedioActionPerformed(evt);
            }
        });

        jLabelCliente.setText("Cliente:");

        jTextFieldCliente.setEditable(false);

        jButtonSelecionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/search-icon.png"))); // NOI18N
        jButtonSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarClienteActionPerformed(evt);
            }
        });

        jButtonApagarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/eraser-icon.png"))); // NOI18N
        jButtonApagarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarClienteActionPerformed(evt);
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
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNomeMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeMedico))
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
                                .addComponent(jButtonSalvar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelRemedio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSelecionarRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCliente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonApagarRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonApagarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelRemedio)
                        .addComponent(jTextFieldRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSelecionarRemedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonApagarRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonApagarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCliente)
                        .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSelecionarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonSalvar))
                .addContainerGap())
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
            LogTrack.getInstance().addException(ex, true, this);
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
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
                if( this.disconnectOnClose ){
                    receita.disconnectFromDatabase();
                }
            } catch (Exception ex){
                LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButtonSelecionarRemedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarRemedioActionPerformed
        try{

            if (remedio == null){
                remedio = new Produto();
            }

            JFrameConsultaProduto jFrameConsultaProduto;
            jFrameConsultaProduto = new JFrameConsultaProduto(remedio, true, false);
            jFrameConsultaProduto.addWindowListener( new java.awt.event.WindowAdapter() {
                @Override
                //metodo para atualizar a tabela ao fechar a Janela CRUD
                public void windowClosed( java.awt.event.WindowEvent evt){
                    if( remedio.getNomeProduto()!= null){
                        jTextFieldRemedio.setText(remedio.getNomeProduto());
                    }
                }
            });
            jFrameConsultaProduto.setVisible(true);
        } catch( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
            remedio = null;
        }
    }//GEN-LAST:event_jButtonSelecionarRemedioActionPerformed

    private void jButtonApagarRemedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarRemedioActionPerformed
        remedio = null;
        jTextFieldRemedio.setText(null);
    }//GEN-LAST:event_jButtonApagarRemedioActionPerformed

    private void jButtonSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarClienteActionPerformed
        try{

            if (cliente == null){
                cliente = new Usuario();
            }

            JFrameConsultaUsuario jFrameConsultaUsuario;
            jFrameConsultaUsuario = new JFrameConsultaUsuario(cliente, true, false);
            jFrameConsultaUsuario.addWindowListener( new java.awt.event.WindowAdapter() {
                @Override
                //metodo para atualizar a tabela ao fechar a Janela CRUD
                public void windowClosed( java.awt.event.WindowEvent evt){
                    if( cliente.getNomeCompleto()!= null){
                        jTextFieldCliente.setText(cliente.getNomeCompleto());
                    }
                }
            });
            jFrameConsultaUsuario.setVisible(true);
        } catch( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
            cliente = null;
        }
    }//GEN-LAST:event_jButtonSelecionarClienteActionPerformed

    private void jButtonApagarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarClienteActionPerformed
        cliente = null;
        jTextFieldCliente.setText(null);
    }//GEN-LAST:event_jButtonApagarClienteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagarCliente;
    private javax.swing.JButton jButtonApagarRemedio;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSelecionarCliente;
    private javax.swing.JButton jButtonSelecionarRemedio;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelCrm;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNomeMedico;
    private javax.swing.JLabel jLabelRemedio;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldCor;
    private javax.swing.JTextField jTextFieldCrm;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNomeMedico;
    private javax.swing.JTextField jTextFieldRemedio;
    // End of variables declaration//GEN-END:variables
}
