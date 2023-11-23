
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
        this.codigoProduto = codigoProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

    public void setReceita(String receita) {
        this.receita = receita;
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
        this.codigoProduto = (int)data.get(0);
        this.nomeProduto = (String)data.get(1);
        this.valorProduto = (float)data.get(2);
        this.quantidadeEstoque = (int)data.get(3);
        this.tarja = (String)data.get(4);
        this.receita = (String)data.get(5);
        if( data.get(6) != null ){
            if( categoria == null){
                categoria = new CategoriaProduto();
            }
            
            categoria.setCodigoCategoria((int)data.get(6));
            categoria.load();
        }

    }
    
}
