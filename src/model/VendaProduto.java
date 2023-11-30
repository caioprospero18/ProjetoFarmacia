package model;

import controller.DataAccessObject;
import java.util.ArrayList;

/**
 *
 * @author Trabalho
 */
public class VendaProduto extends DataAccessObject {
    
    private int codigo;
    private int quantidade;
    private Venda venda;
    private Produto produto;
    private Receita receita;

    public VendaProduto(String table) {
        super("venda_produto");
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if( quantidade != this.quantidade){
            this.quantidade = quantidade;
            addChange("quantidade", this.quantidade);
        }
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
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
    
    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }
    
    @Override
    protected String getWhereClauseForOneEntry() {
        return " codigo = " + this.codigo;
    }

    @Override
    protected void fill(ArrayList<Object> data) throws Exception {
        this.codigo = (int)data.get(0);
        if( data.get(1) != null ){
            if( produto == null){
                produto = new Produto();
            }
            
            produto.setCodigoProduto((int)data.get(1));
            produto.load();
        }
        if( data.get(2) != null ){
            if( venda == null){
                venda = new Venda();
            }
            
            venda.setCodigoVenda((int)data.get(2));
            venda.load();
        }
        this.quantidade = (int)data.get(3);
        if( receita == null){
                receita = new Receita();
        }

        receita.setCodigoReceita((int)data.get(4));
        receita.load();
    }

}
