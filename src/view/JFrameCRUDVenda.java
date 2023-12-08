 package view;

import controller.LogTrack;
import controller.ResultSetTableModel;
import java.awt.Color;
import java.awt.List;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import model.Produto;
import model.Usuario;
import model.Venda;
import model.VendaProduto;

public class JFrameCRUDVenda extends javax.swing.JFrame {
    
    private Venda venda;//objeto da tabela
    private Produto produto;
    private Usuario funcionario;
    private Usuario cliente;
    private VendaProduto vendaProduto;
    private boolean disconnectOnClose;//desconectar do banco ao fechar a janela
    private ResultSetTableModel result;
    DateTimeFormatter dtf;
    LocalDateTime now;
    Random aleatorio = new Random();
    int control, tamanho;
    ArrayList<Integer> lista = new ArrayList<Integer>();
    
        
    private String query = "SELECT p.nome_produto as Produto, vp.quantidade as Quantidade, p.receita as Receita " +
                           "from venda_produto vp \n" +
                           "inner join produtos p on p.codigo_produto = vp.codigo_produto \n" +
                           "where vp.codigo_venda = 0 \n" +
                           "order by 2";

    public JFrameCRUDVenda(Usuario funcionario, Venda venda, boolean disconnectOnClose) throws SQLException, Exception {
        initComponents();
        configElements();
        Color minhaCor = new Color(204, 255, 204);
        getContentPane().setBackground(minhaCor);
        
        dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        now = LocalDateTime.now();

        
        if( funcionario == null){
            this.funcionario = new Usuario();
        } else {
            this.funcionario = funcionario;
            //dataUp();
            jTextFieldFuncionario.setText(funcionario.getNomeCompleto());
        }
        
        if( venda == null){
            control = aleatorio.nextInt(100);
            tamanho = lista.size();
            
            //Verifica se o numero ja não foi usado nessa sessão
            for(int i = 0,i <= tamanho, i++){
                if(control == lista.get(i)){
                    control = aleatorio.nextInt(100);
                }
            }
            jTextFieldDataHora.setText(String.valueOf(dtf.format(now)));
            jTextFieldID.setText(String.valueOf(control));
            lista.get(control);
            
            this.venda = new Venda();
            dataDown();
            this.venda.insert();
            //dataUp();
        } else{
            this.venda = venda;
            dataUp();//levar os dados para janela
        }
        
        this.disconnectOnClose = disconnectOnClose;
        
        result = new ResultSetTableModel(query);
        jTableProdutos.setModel(result);
    }
   
    
    private void checkInput() throws Exception{
        if( jTextFieldID.getText().isEmpty() ){
            throw new Exception("Informe o ID.");
        } else {
            if (!jTextFieldID.getText().isEmpty()
                    && !jTextFieldID.getText().matches("\\d+")){
                throw new Exception("O campo ID deve ser um número.");
            }
        }
        //Integer.parseInt(spnQuantidade.getValue().toString());
        if( Integer.parseInt(jSpinnerQuant.getValue().toString()) == 0){
            throw new Exception("Informe a quantidade do produto.");
        }
        
    }

    private void dataDown() throws Exception{
        //data.setter TRAZER OS DADOS DA JANELA PARA O OBJETO
        venda.setCodigoVenda(Integer.parseInt(jTextFieldID.getText() ) );
        venda.setDataHoraVenda((String)jTextFieldDataHora.getText());
        venda.setFuncionario(funcionario);
        
    }
    
    private void dataUp(){
        //data.getter LEVAR OS DADOS DO OBJETO PARA A JANELA
        jTextFieldID.setText(String.valueOf(venda.getCodigoVenda()) );
        jTextFieldDataHora.setText(String.valueOf(venda.getDataHoraVenda()));
        //jSpinnerQuant.setText(String.valueOf(venda.getQuantidade()));
        jTextFieldValor.setText(String.valueOf(venda.getValorVenda())); 
        if(venda.getUsuario().getNomeCompleto()!= null){
            jTextFieldCliente.setText(venda.getUsuario().getNomeCompleto());
        }
        /*if(venda.getProduto().getNomeProduto()!= null){
            jTextFieldProduto.setText(venda.getProduto().getNomeProduto());
        }*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelDataHora = new javax.swing.JLabel();
        jTextFieldDataHora = new javax.swing.JTextField();
        jLabelQuantidade = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabelCliente = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jButtonSelecionarUsuario = new javax.swing.JButton();
        jButtonApagarUsuario = new javax.swing.JButton();
        jLabelProduto = new javax.swing.JLabel();
        jTextFieldProduto = new javax.swing.JTextField();
        jButtonSelecionarProduto = new javax.swing.JButton();
        jButtonApagarProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jSpinnerQuant = new javax.swing.JSpinner();
        jButtonAdicionar = new javax.swing.JButton();
        jLabelFuncionario = new javax.swing.JLabel();
        jTextFieldFuncionario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelID.setText("ID:");

        jLabelDataHora.setText("Data e Hora:");

        jTextFieldDataHora.setEditable(false);

        jLabelQuantidade.setText("Quantidade:");

        jLabelValor.setText("Valor:");

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

        jLabelCliente.setText("Nome cliente:");

        jTextFieldCliente.setEditable(false);

        jButtonSelecionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/search-icon.png"))); // NOI18N
        jButtonSelecionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarUsuarioActionPerformed(evt);
            }
        });

        jButtonApagarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/eraser-icon.png"))); // NOI18N
        jButtonApagarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarUsuarioActionPerformed(evt);
            }
        });

        jLabelProduto.setText("Produto:");

        jTextFieldProduto.setEditable(false);

        jButtonSelecionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/search-icon.png"))); // NOI18N
        jButtonSelecionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarProdutoActionPerformed(evt);
            }
        });

        jButtonApagarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/eraser-icon.png"))); // NOI18N
        jButtonApagarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarProdutoActionPerformed(evt);
            }
        });

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableProdutos);

        jButtonAdicionar.setText("Adicionar Produto");
        jButtonAdicionar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jLabelFuncionario.setText("Nome funcionário:");

        jTextFieldFuncionario.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelID)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelDataHora)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldDataHora))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelCliente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonSelecionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonApagarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelProduto)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldProduto)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonSelecionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(42, 42, 42)
                                            .addComponent(jLabelQuantidade)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSpinnerQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonApagarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDataHora)
                    .addComponent(jTextFieldDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFuncionario)
                    .addComponent(jTextFieldFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCliente)
                        .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSelecionarUsuario)
                    .addComponent(jButtonApagarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelProduto)
                        .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSelecionarProduto)
                    .addComponent(jButtonApagarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantidade)
                    .addComponent(jSpinnerQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonSalvar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try{
            checkInput();
            dataDown();
            venda.delete();
            this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING));
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try{
            if (Float.parseFloat(jTextFieldValor.getText()) == 0){
               venda.delete();
               System.out.println("Não houve produtos selecionados. Venda deletada");
           }
            
            checkInput();
            dataDown();
            venda.save();
            //evento para fechar a janela ao clicar "Salvar"
            this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING));
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
                if( this.disconnectOnClose ){
                    venda.disconnectFromDatabase();
                }
            } catch (Exception ex){
                LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButtonSelecionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarUsuarioActionPerformed
        try{

            if (cliente == null){
                cliente = new Usuario();
            }

            JFrameConsultaUsuario jFrameConsultaUsuario;
            jFrameConsultaUsuario = new JFrameConsultaUsuario(cliente, true, false);
            jFrameConsultaUsuario.addWindowListener(new java.awt.event.WindowAdapter() {
                
                @Override
                //metodo para atualizar a tabela ao fechar a Janela CRUD
                public void windowClosed( java.awt.event.WindowEvent evt){
                    if( cliente.getNomeCompleto()!= null){
                        jTextFieldCliente.setText(cliente.getNomeCompleto());
                        try {
                            venda.setCliente(cliente);
                            venda.save();
                        } catch (Exception ex) {
                            Logger.getLogger(JFrameCRUDVenda.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            });
            jFrameConsultaUsuario.setVisible(true);
        } catch( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
            cliente = null;
        }
    }//GEN-LAST:event_jButtonSelecionarUsuarioActionPerformed

    private void jButtonApagarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarUsuarioActionPerformed
        cliente = null;
        jTextFieldCliente.setText(null);
    }//GEN-LAST:event_jButtonApagarUsuarioActionPerformed

    private void jButtonSelecionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarProdutoActionPerformed
        try{

            if (produto == null){
                produto = new Produto();
            }

            JFrameConsultaProduto jFrameConsultaProduto;
            jFrameConsultaProduto = new JFrameConsultaProduto(produto, true, false);
            jFrameConsultaProduto.addWindowListener( new java.awt.event.WindowAdapter() {
                @Override
                //metodo para atualizar a tabela ao fechar a Janela CRUD
                public void windowClosed( java.awt.event.WindowEvent evt){
                    if( produto.getNomeProduto()!= null){
                        jTextFieldProduto.setText(produto.getNomeProduto());
                    }
                }
            });
            jFrameConsultaProduto.setVisible(true);
        } catch( Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
            produto = null;
        }
    }//GEN-LAST:event_jButtonSelecionarProdutoActionPerformed

    private void jButtonApagarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarProdutoActionPerformed
        produto = null;
        jTextFieldProduto.setText(null);
    }//GEN-LAST:event_jButtonApagarProdutoActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        float valorTotal = 0;
        try{
            if (vendaProduto == null){
                vendaProduto = new VendaProduto();
                vendaProduto.setCodigo(aleatorio.nextInt(30));
                System.out.println("Venda: " + this.venda.getCodigoVenda());

                vendaProduto.setVenda(venda);               
                vendaProduto.setProduto(produto);
                vendaProduto.setQuantidade((int)jSpinnerQuant.getValue());
                
                valorTotal = venda.getValorVenda() + (produto.getValorProduto() * ((int) jSpinnerQuant.getValue()));
                venda.setValorVenda(valorTotal);
                venda.save();
                jTextFieldValor.setText(String.valueOf(valorTotal));
                
                produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - ((int) jSpinnerQuant.getValue()));
                produto.save();
                
                jSpinnerQuant.setValue((int)1);              
            }
            vendaProduto.save();
            
            query = "SELECT p.nome_produto as Produto, vp.quantidade as Quantidade, p.receita as Receita " +
                           "from venda_produto vp \n" +
                           "inner join produtos p on p.codigo_produto = vp.codigo_produto \n" +
                           "where vp.codigo_venda = '" + venda.getCodigoVenda() + "' " +
                           "order by 2";
            
            result.setQuery( query );
            
            vendaProduto = null;
            produto = null;
            jTextFieldProduto.setText(null);
            
            jSpinnerQuant = null;
            jSpinnerQuant = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
            //evento para fechar a janela ao clicar "Salvar"
            //this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING));
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void configElements(){        
        jTextFieldID.setEditable(false);
        jTextFieldDataHora.setEditable(false);
        jTextFieldValor.setEditable(false);
        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonApagarProduto;
    private javax.swing.JButton jButtonApagarUsuario;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSelecionarProduto;
    private javax.swing.JButton jButtonSelecionarUsuario;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelDataHora;
    private javax.swing.JLabel jLabelFuncionario;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerQuant;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldDataHora;
    private javax.swing.JTextField jTextFieldFuncionario;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
