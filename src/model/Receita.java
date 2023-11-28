
package model;

import controller.DataAccessObject;
import java.util.ArrayList;

public class Receita extends DataAccessObject{
    private int codigoReceita;
    private String nomeMedico;
    private String crm;
    private String cor;
    private Usuario cliente;
    private Produto produto;
    
    public Receita(){
        super("receitas");
    }

    public void setCodigoReceita(int codigoReceita) {
        if( codigoReceita != this.codigoReceita){
            this.codigoReceita = codigoReceita;
            addChange("codigo_receita", this.codigoReceita);
        }
    }


    public void setNomeMedico(String nomeMedico) {
        if( nomeMedico != this.nomeMedico){
            this.nomeMedico = nomeMedico;
            addChange("nome_medico", this.nomeMedico);
        }
    }

    public void setCrm(String crm) {
        if( crm != this.crm){
            this.crm = crm;
            addChange("crm", this.crm);
        }
    }

    public void setCor(String cor) {
        if( cor != this.cor){
            this.cor = cor;
            addChange("cor", this.cor);
        }
    }
    
    public void setCliente(Usuario cliente) throws Exception {
        if( this.cliente == null ){
           
           if( cliente != null ){
               this.cliente = new Usuario();
               this.cliente.setCodigoUsuario(cliente.getCodigoUsuario());
               this.cliente.load();
               addChange("codigo_cliente", this.cliente.getCodigoUsuario());
           }
       }else{
           if( cliente == null){
               
               this.cliente = null;
               addChange("codigo_cliente", null);
           }else{
               
               if( !this.cliente.equals( cliente ) ){
                   this.cliente.setCodigoUsuario(cliente.getCodigoUsuario());
                   this.cliente.load();
                   addChange("codigo_produto", this.cliente.getCodigoUsuario());
               }
           }
       }
    }

    public void setProduto(Produto produto) throws Exception {
        if( this.produto == null ){
           
           if( produto != null ){
               this.produto = new Produto();
               this.produto.setCodigoProduto(produto.getCodigoProduto());
               this.produto.load();
               addChange("codigo_produto", this.produto.getCodigoProduto());
           }
       }else{
           if( produto == null){
               
               this.produto = null;
               addChange("codigo_produto", null);
           }else{
               
               if( !this.produto.equals( produto ) ){
                   this.produto.setCodigoProduto(produto.getCodigoProduto());
                   this.produto.load();
                   addChange("codigo_produto", this.produto.getCodigoProduto());
               }
           }
       }
    }

    public int getCodigoReceita() {
        return codigoReceita;
    }


    public String getNomeMedico() {
        return nomeMedico;
    }

    public String getCrm() {
        return crm;
    }

    public String getCor() {
        return cor;
    }

    public Usuario getCliente() {
        return cliente;
    }
    

    public Produto getProduto() {
        return produto;
    }
    
    public String getWhereClauseForOneEntry(){
        return " codigo_receita = " + this.codigoReceita;
    }
    
    public void fill(ArrayList<Object> data) throws Exception{
        this.codigoReceita = (int)data.get(0);
        this.nomeMedico = (String)data.get(1);
        this.crm = (String)data.get(2);
        this.cor = (String)data.get(3);
        if( data.get(4) != null ){
            if( produto == null){
                produto = new Produto();
            }
            
            produto.setCodigoProduto((int)data.get(4));
            produto.load();
        }

    }
}
