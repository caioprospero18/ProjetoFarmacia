
package model;

import controller.DataAccessObject;
import java.util.ArrayList;


public class Venda extends DataAccessObject{
    
    private int codigoVenda;
    private String data;
    private String hora;
    private int quantidade;
    private float valorVenda;
    private Usuario usuario;
    private Produto produto;
    
    public Venda(){
        super("vendas");
    }

    public void setCodigoVenda(int codigoVenda) {
        if( codigoVenda != this.codigoVenda){
            this.codigoVenda = codigoVenda;
            addChange("codigo_venda", this.codigoVenda);
        }
    }

    public void setData(String data) {
        if( data != this.data){
            this.data = data;
            addChange("data", this.data);
        }
    }

    public void setHora(String hora) {
        if( hora != this.hora){
            this.hora = hora;
            addChange("hora", this.hora);
        }
    }

    public void setQuantidade(int quantidade) {
        if( quantidade != this.quantidade){
            this.quantidade = quantidade;
            addChange("quantidade", this.quantidade);
        }
    }

    public void setValorVenda(float valorVenda) {
        if( valorVenda != this.valorVenda){
            this.valorVenda = valorVenda;
            addChange("valor_venda", this.valorVenda);
        }
    }

    public void setUsuario(Usuario usuario) throws Exception {
        if( this.usuario == null ){
           
           if( usuario != null ){
               this.usuario = new Usuario();
               this.usuario.setCodigoUsuario(usuario.getCodigoUsuario());
               this.usuario.load();
               addChange("codigo_usuario", this.usuario.getCodigoUsuario());
           }
       }else{
           if( usuario == null){
               
               this.usuario = null;
               addChange("codigo_usuario", null);
           }else{
               
               if( !this.usuario.equals( usuario ) ){
                   this.usuario.setCodigoUsuario(usuario.getCodigoUsuario());
                   this.usuario.load();
                   addChange("codigo_usuario", this.usuario.getCodigoUsuario());
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

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Produto getProduto() {
        return produto;
    }
    
    
    public String getWhereClauseForOneEntry(){
        return " codigo_venda = " + this.codigoVenda;
    }
    
    public void fill(ArrayList<Object> data) throws Exception{
        this.codigoVenda = (int)data.get(0);
        this.data = data.get(1).toString();
        this.hora = data.get(2).toString();
        this.quantidade = (int)data.get(3);
        this.valorVenda = (float)data.get(4);
        if( data.get(5) != null ){
            if( usuario == null){
                usuario = new Usuario();
            }
            
            usuario.setCodigoUsuario((int)data.get(5));
            usuario.load();
        }
        if( data.get(6) != null ){
            if( produto == null){
                produto = new Produto();
            }
            
            produto.setCodigoProduto((int)data.get(6));
            produto.load();
        }
    }
}
