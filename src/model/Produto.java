
package model;

import controller.DataAccessObject;
import java.util.ArrayList;

public class Produto extends DataAccessObject{
    private int codigoProduto;
    private String nomeProduto;
    private float valorProduto;
    private int quantidadeEstoque;
    private String tarja;
    private String receita;
    private CategoriaProduto categoria;
    
    public Produto(){
        super("produtos");
    }

    public void setCodigoProduto(int codigoProduto) {
        if( codigoProduto != this.codigoProduto){
            this.codigoProduto = codigoProduto;
            addChange("codigo_produto", this.codigoProduto);
        }
    }

    public void setNomeProduto(String nomeProduto) {
        if( nomeProduto != this.nomeProduto){
            this.nomeProduto = nomeProduto;
            addChange("nome_produto", this.nomeProduto);
        }
    }

    public void setValorProduto(float valorProduto) {
        if( valorProduto != this.valorProduto){
            this.valorProduto = valorProduto;
            addChange("valor_produto", this.valorProduto);
        }
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if( quantidadeEstoque != this.quantidadeEstoque){
            this.quantidadeEstoque = quantidadeEstoque;
            addChange("quantidade_estoque", this.quantidadeEstoque);
        }
    }

    public void setTarja(String tarja) {
        if( tarja != this.tarja){
            this.tarja = tarja;
            addChange("tarja", this.tarja);
        }
    }

    public void setReceita(String receita) {
        if( receita != this.receita){
            this.receita = receita;
            addChange("receita", this.receita);
        }
    }

    public void setCategoria(CategoriaProduto categoria) throws Exception {
        if( this.categoria == null ){
           
           if( categoria != null ){
               this.categoria = new CategoriaProduto();
               this.categoria.setCodigoCategoria(categoria.getCodigoCategoria());
               this.categoria.load();
               addChange("codigo_categoria", this.categoria.getCodigoCategoria());
           }
       }else{
           if( categoria == null){
               
               this.categoria = null;
               addChange("codigo_categoria", null);
           }else{
               
               if( !this.categoria.equals( categoria ) ){
                   this.categoria.setCodigoCategoria(categoria.getCodigoCategoria());
                   this.categoria.load();
                   addChange("codigo_categoria", this.categoria.getCodigoCategoria());
               }
           }
       }
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String getTarja() {
        return tarja;
    }

    public String getReceita() {
        return receita;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }
    
    public String getWhereClauseForOneEntry(){
        return " codigo_produto = " + this.codigoProduto;
    }
    
    public void fill(ArrayList<Object> data) throws Exception{
        codigoProduto = (int)data.get(0);
        nomeProduto = (String)data.get(1);
        valorProduto = (float)data.get(2);
        quantidadeEstoque = (int)data.get(3);
        tarja = (String)data.get(4);
        receita = (String)data.get(5);
        if( data.get(6) != null ){
            if( categoria == null){
                categoria = new CategoriaProduto();
            }
            
            categoria.setCodigoCategoria((int)data.get(6));
            categoria.load();
        }

    }
    
}
