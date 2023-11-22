
package model;

import controller.DataAccessObject;
import java.util.ArrayList;

public class Receita extends DataAccessObject{
    private int codigoReceita;
    private String nomeRemedio;
    private String nomeMedico;
    private String crm;
    private String cor;
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

    public void setNomeRemedio(String nomeRemedio) {
        if( nomeRemedio != this.nomeRemedio){
            this.nomeRemedio = nomeRemedio;
            addChange("nome_remedio", this.nomeRemedio);
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

    public String getNomeRemedio() {
        return nomeRemedio;
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

    public Produto getProduto() {
        return produto;
    }
    
    public String getWhereClauseForOneEntry(){
        return " codigo_receita = " + this.codigoReceita;
    }
    
    public void fill(ArrayList<Object> data) throws Exception{
        this.codigoReceita = (int)data.get(0);
        this.nomeRemedio = (String)data.get(1);
        this.nomeMedico = (String)data.get(2);
        this.crm = (String)data.get(3);
        this.cor = (String)data.get(4);
        if( data.get(5) != null ){
            if( produto == null){
                produto = new Produto();
            }
            
            produto.setCodigoProduto((int)data.get(5));
            produto.load();
        }

    }
}
