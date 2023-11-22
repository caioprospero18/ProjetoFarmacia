
package view;

import java.awt.event.WindowEvent;
import model.Usuario;

public class JFrameCRUDUsuario extends javax.swing.JFrame {
    
    private Usuario usuario;//objeto da tabela
    private boolean disconnectOnClose;//desconectar do banco ao fechar a janela
    
    public JFrameCRUDUsuario(Usuario usuario, boolean disconnectOnClose) {
        initComponents();
        
        if( usuario == null){
            this.usuario = new Usuario();
        } else{
            this.usuario = usuario;
            dataUp();//levar os dados para janela
        }
        
        this.disconnectOnClose = disconnectOnClose;
    }
    
     private void checkInput(){
        
    }

    private void dataDown(){
        //data.setter TRAZER OS DADOS DA JANELA PARA O OBJETO
        usuario.setCodigoUsuario(Integer.parseInt(jTextFieldID.getText() ) );
        usuario.setNomeCompleto(jTextFieldNomeCompleto.getText());
        usuario.setDataNascimento(jTextFieldDataNascimento.getText());
        usuario.setCpf(jTextFieldCpf.getText());
        usuario.setEndereco(jTextFieldEndereco.getText());
        usuario.setNumero(jTextFieldNumero.getText());
        usuario.setComplemento(jTextFieldComplemento.getText());
        usuario.setBairro(jTextFieldBairro.getText());
        usuario.setCidade(jTextFieldCidade.getText());
        usuario.setEstado(jTextFieldEstado.getText());
    }
    
    private void dataUp(){
        //data.getter LEVAR OS DADOS DO OBJETO PARA A JANELA
        jTextFieldID.setText(String.valueOf(usuario.getCodigoUsuario()) );
        jTextFieldNomeCompleto.setText(usuario.getNomeCompleto());
        jTextFieldDataNascimento.setText(usuario.getDataNascimento());
        jTextFieldCpf.setText(usuario.getCpf());
        jTextFieldEndereco.setText(usuario.getEndereco());
        jTextFieldNumero.setText(usuario.getNumero());
        jTextFieldComplemento.setText(usuario.getComplemento());
        jTextFieldBairro.setText(usuario.getBairro());
        jTextFieldCidade.setText(usuario.getCidade());
        jTextFieldEstado.setText(usuario.getEstado());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelNomeCompleto = new javax.swing.JLabel();
        jTextFieldNomeCompleto = new javax.swing.JTextField();
        jLabelDataNascimento = new javax.swing.JLabel();
        jTextFieldDataNascimento = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelID.setText("ID:");

        jLabelNomeCompleto.setText("Nome completo:");

        jLabelDataNascimento.setText("Data nascimento:");

        jLabelCpf.setText("CPF:");

        jLabelEndereco.setText("Endereço:");

        jLabelNumero.setText("Número:");

        jLabelComplemento.setText("Complemento:");

        jLabelBairro.setText("Bairro:");

        jLabelCidade.setText("Cidade:");

        jLabelEstado.setText("Estado:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCidade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldComplemento))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEndereco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabelNomeCompleto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDataNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDataNascimento)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNomeCompleto)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCpf))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumero))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBairro))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNomeCompleto)
                        .addComponent(jTextFieldNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataNascimento)
                    .addComponent(jTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCpf)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComplemento)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
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
            usuario.delete();
            this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING));
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try{
            checkInput();
            dataDown();
            usuario.save();
            //evento para fechar a janela ao clicar "Salvar"
            this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING));
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
                if( this.disconnectOnClose ){
                    usuario.disconnectFromDatabase();
                }
            } catch (Exception ex){
                ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNomeCompleto;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldDataNascimento;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNomeCompleto;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
}
